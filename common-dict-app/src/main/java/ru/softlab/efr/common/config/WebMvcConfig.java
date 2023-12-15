package ru.softlab.efr.common.config;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Настройки MVC
 *
 * @author Andrey Grigorov
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(byteArrayHttpMessageConverter());
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        JavaTimeModule module = new JavaTimeModule();

        module.addDeserializer(LocalDate.class, new LocalDateDeserializer(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        module.addSerializer(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        module.addDeserializer(OffsetDateTime.class, offsetDateTimeDeserializer(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));
        module.addSerializer(OffsetDateTime.class, offsetDateTimeSerializer(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));

        builder.modules(module);
        converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
        converters.add(new ResourceHttpMessageConverter());
    }

    private StdSerializer<OffsetDateTime> offsetDateTimeSerializer(DateTimeFormatter formatter) {
        return new OffsetDateTimeSerializer(OffsetDateTimeSerializer.INSTANCE, true, formatter) {
        };
    }

    private StdDeserializer<OffsetDateTime> offsetDateTimeDeserializer(DateTimeFormatter formatter) {
        return new InstantDeserializer<OffsetDateTime>(InstantDeserializer.OFFSET_DATE_TIME, formatter) {
        };
    }

    private ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
        ByteArrayHttpMessageConverter converter = new ByteArrayHttpMessageConverter();
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
        converter.setSupportedMediaTypes(mediaTypes);
        return converter;
    }

}

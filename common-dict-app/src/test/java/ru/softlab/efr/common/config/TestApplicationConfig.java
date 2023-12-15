package ru.softlab.efr.common.config;

import net.ttddyy.dsproxy.listener.DataSourceQueryCountListener;
import net.ttddyy.dsproxy.support.ProxyDataSource;
import org.springframework.context.annotation.*;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.softlab.efr.common.settings.annotations.EnableSettings;
import ru.softlab.efr.common.utilities.hibernate.annotations.EnableHibernateJpa;
import ru.softlab.efr.infrastructure.logging.annotations.EnableLogging;
import ru.softlab.efr.infrastructure.transport.annotations.EnableTransport;
import ru.softlab.efr.services.authorization.annotations.EnablePermissionControl;

import javax.sql.DataSource;

import static org.springframework.context.annotation.FilterType.ANNOTATION;
import static ru.softlab.efr.common.dict.config.CommonDictConstants.APPLICATION_NAME;

/**
 * Конфигурация запуска окружения для тестов
 *
 * @author olshansky
 * @since 11.01.2018.
 */
@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport
@ComponentScan(basePackages = {
        "ru.softlab.efr.common.dict", "ru.softlab.efr.services.insurance", "ru.softlab.efr.common.stubs"}, excludeFilters = @ComponentScan.Filter(
        value = Configuration.class,
        type = ANNOTATION
))
@EnablePermissionControl
@EnableHibernateJpa(
        repositoryPackages = "ru.softlab.efr.common.dict.repositories",
        modelPackages = "ru.softlab.efr.common.dict.model")
@EnableSettings
@EnableLogging
@Import({WebMvcConfig.class})
@EnableTransport(APPLICATION_NAME)
public class TestApplicationConfig {


    @Bean
    @Primary
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();

        ProxyDataSource proxyDataSource = new ProxyDataSource(builder
                .setType(EmbeddedDatabaseType.H2)
                .setName(APPLICATION_NAME)
                .build());

        proxyDataSource.addListener(new DataSourceQueryCountListener());
        return proxyDataSource;
    }

    @Bean
    public TaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        executor.initialize();
        return executor;
    }

}
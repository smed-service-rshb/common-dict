package ru.softlab.efr.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.softlab.efr.common.settings.annotations.EnableSettings;
import ru.softlab.efr.common.utilities.hibernate.annotations.EnableHibernateJpa;
import ru.softlab.efr.infrastructure.logging.annotations.EnableLogging;
import ru.softlab.efr.infrastructure.transport.annotations.EnableTransport;
import ru.softlab.efr.services.authorization.annotations.EnablePermissionControl;
import ru.softlab.efr.settings.logging.annotations.EnableSettingsClientLoggingConfiguration;

import static ru.softlab.efr.common.dict.config.CommonDictConstants.APPLICATION_NAME;

/**
 * @author levin
 * @since 05.04.2017
 */
@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport
@ComponentScan(basePackages = {"ru.softlab.efr.common.dict", "ru.softlab.efr.services.insurance"})
@EnablePermissionControl
@EnableHibernateJpa(
        repositoryPackages = "ru.softlab.efr.common.dict.repositories",
        modelPackages = "ru.softlab.efr.common.dict.model")
@EnableTransport(APPLICATION_NAME)
@EnableSettings
@EnableLogging
@EnableSettingsClientLoggingConfiguration
@EnableScheduling
@EnableAsync
@Import({WebMvcConfig.class})
public class ApplicationConfig {

    @Bean
    public TaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        executor.initialize();
        return executor;
    }
}

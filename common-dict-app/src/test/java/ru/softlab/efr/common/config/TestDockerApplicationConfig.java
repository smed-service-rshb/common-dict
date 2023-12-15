package ru.softlab.efr.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.softlab.efr.common.utilities.hibernate.annotations.EnableHibernateJpa;
import ru.softlab.efr.test.infrastructure.transport.rest.config.AbstractTestConfiguration;
import ru.softlab.efr.test.services.auth.rest.config.AuthTestConfiguration;

import static ru.softlab.efr.common.dict.config.CommonDictConstants.APPLICATION_NAME;

/**
 * @author khudyakov
 * @since 25.07.2017
 */
@Configuration
@Import({HibernateConfig.class, AuthTestConfiguration.class})
@EnableHibernateJpa(
        repositoryPackages = {
                "ru.softlab.efr.common.dict.repositories",
                "ru.softlab.efr.services.authorization.repositories"},
        modelPackages = {
                "ru.softlab.efr.common.dict.model",
                "ru.softlab.efr.services.authorization.model"})
@ComponentScan("ru.softlab.efr.common.dict.services")
public class TestDockerApplicationConfig extends AbstractTestConfiguration {
    @Override
    protected String getTestAppName() {
        return APPLICATION_NAME;
    }

    @Override
    protected String getTestAppContextRoot() {
        //context root из jboss-web.xml
        return APPLICATION_NAME;
    }
}


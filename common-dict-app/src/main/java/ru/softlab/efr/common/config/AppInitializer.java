package ru.softlab.efr.common.config;

import org.springframework.web.WebApplicationInitializer;
import ru.softlab.efr.infrastructure.transport.server.init.AbstractTransportInitializer;

/**
 * @author levin
 * @since 01.09.2017
 */
public class AppInitializer extends AbstractTransportInitializer implements WebApplicationInitializer {
    @Override
    protected Class<?> getConfiguration() {
        return ApplicationConfig.class;
    }
}

package io.veracode.asc.bbaukema.springbootcwe117.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLoggerFactory {
    public static MyLogger getLogger(Class<?> klassParm) {
        Logger logger = LoggerFactory.getLogger(klassParm);
        return getLogger(logger);
    }

    public static MyLogger getLogger(Logger loggerParm) {
        return new MyLoggerDecorator(loggerParm);
    }
}

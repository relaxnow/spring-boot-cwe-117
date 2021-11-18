package io.veracode.asc.bbaukema.springbootcwe117.logging;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.springframework.util.StringUtils;

public class MyLoggerDecorator implements MyLogger {
    private Logger delegate;

    public MyLoggerDecorator(Logger loggerParm) {
        delegate = loggerParm;
    }

    private static String sanitize(String message) {
        return StringUtils.trimAllWhitespace(message);
    }

    @Override
    public String getName() {
        return MyLogger.class.toGenericString();
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public void trace(String s) {
        delegate.trace(sanitize(s));
    }

    @Override
    public void trace(String s, Object o) {
        delegate.trace(sanitize(s), o);
    }

    @Override
    public void trace(String s, Object o, Object o1) {
        delegate.trace(sanitize(s), o, o1);
    }

    @Override
    public void trace(String s, Object... objects) {
        delegate.trace(sanitize(s), objects);
    }

    @Override
    public void trace(String s, Throwable throwable) {
        delegate.trace(sanitize(s), throwable);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return false;
    }

    @Override
    public void trace(Marker marker, String s) {
        delegate.trace(marker, sanitize(s));
    }

    @Override
    public void trace(Marker marker, String s, Object o) {
        delegate.trace(marker, sanitize(s), o);
    }

    @Override
    public void trace(Marker marker, String s, Object o, Object o1) {
        delegate.trace(marker, sanitize(s), o, o1);
    }

    @Override
    public void trace(Marker marker, String s, Object... objects) {
        delegate.trace(marker, sanitize(s), objects);
    }

    @Override
    public void trace(Marker marker, String s, Throwable throwable) {
        delegate.trace(marker, sanitize(s), throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public void debug(String s) {
        delegate.debug(s);
    }

    @Override
    public void debug(String s, Object o) {
        delegate.debug(sanitize(s), o);
    }

    @Override
    public void debug(String s, Object o, Object o1) {
        delegate.debug(sanitize(s), o, o1);
    }

    @Override
    public void debug(String s, Object... objects) {
        delegate.debug(sanitize(s), objects);
    }

    @Override
    public void debug(String s, Throwable throwable) {
        delegate.debug(sanitize(s), throwable);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return false;
    }

    @Override
    public void debug(Marker marker, String s) {
        delegate.debug(marker, sanitize(s));
    }

    @Override
    public void debug(Marker marker, String s, Object o) {
        delegate.debug(marker, sanitize(s), o);
    }

    @Override
    public void debug(Marker marker, String s, Object o, Object o1) {
        delegate.debug(marker, sanitize(s), o, o1);
    }

    @Override
    public void debug(Marker marker, String s, Object... objects) {
        delegate.debug(marker, sanitize(s), objects);
    }

    @Override
    public void debug(Marker marker, String s, Throwable throwable) {
        delegate.debug(marker, sanitize(s), throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public void info(String s) {
        delegate.info(s);
    }

    @Override
    public void info(String s, Object o) {
        delegate.info(sanitize(s), o);
    }

    @Override
    public void info(String s, Object o, Object o1) {
        delegate.info(sanitize(s), o, o1);
    }

    @Override
    public void info(String s, Object... objects) {
        delegate.info(sanitize(s), objects);
    }

    @Override
    public void info(String s, Throwable throwable) {
        delegate.info(sanitize(s), throwable);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return false;
    }

    @Override
    public void info(Marker marker, String s) {
        delegate.info(marker, sanitize(s));
    }

    @Override
    public void info(Marker marker, String s, Object o) {
        delegate.info(marker, sanitize(s), o);
    }

    @Override
    public void info(Marker marker, String s, Object o, Object o1) {
        delegate.info(marker, sanitize(s), o, o1);
    }

    @Override
    public void info(Marker marker, String s, Object... objects) {
        delegate.info(marker, sanitize(s), objects);
    }

    @Override
    public void info(Marker marker, String s, Throwable throwable) {
        delegate.info(marker, sanitize(s), throwable);
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public void warn(String s) {
        delegate.warn(s);
    }

    @Override
    public void warn(String s, Object o) {
        delegate.warn(sanitize(s), o);
    }

    @Override
    public void warn(String s, Object... objects) {
        delegate.warn(sanitize(s), objects);
    }

    @Override
    public void warn(String s, Object o, Object o1) {
        delegate.warn(sanitize(s), o, o1);
    }

    @Override
    public void warn(String s, Throwable throwable) {
        delegate.warn(sanitize(s), throwable);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return false;
    }

    @Override
    public void warn(Marker marker, String s) {
        delegate.warn(marker, sanitize(s));
    }

    @Override
    public void warn(Marker marker, String s, Object o) {
        delegate.warn(marker, sanitize(s), o);
    }

    @Override
    public void warn(Marker marker, String s, Object o, Object o1) {
        delegate.warn(marker, sanitize(s), o, o1);
    }

    @Override
    public void warn(Marker marker, String s, Object... objects) {
        delegate.warn(marker, sanitize(s), objects);
    }

    @Override
    public void warn(Marker marker, String s, Throwable throwable) {
        delegate.warn(marker, sanitize(s), throwable);
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public void error(String s) {
        delegate.error(s);
    }

    @Override
    public void error(String s, Object o) {
        delegate.error(sanitize(s), o);
    }

    @Override
    public void error(String s, Object o, Object o1) {
        delegate.error(sanitize(s), o, o1);
    }

    @Override
    public void error(String s, Object... objects) {
        delegate.error(sanitize(s), objects);
    }

    @Override
    public void error(String s, Throwable throwable) {
        delegate.error(sanitize(s), throwable);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return false;
    }

    @Override
    public void error(Marker marker, String s) {
        delegate.error(marker, sanitize(s));
    }

    @Override
    public void error(Marker marker, String s, Object o) {
        delegate.error(marker, sanitize(s), o);
    }

    @Override
    public void error(Marker marker, String s, Object o, Object o1) {
        delegate.error(marker, sanitize(s), o, o1);
    }

    @Override
    public void error(Marker marker, String s, Object... objects) {
        delegate.error(marker, sanitize(s), objects);
    }

    @Override
    public void error(Marker marker, String s, Throwable throwable) {
        delegate.error(marker, sanitize(s), throwable);
    }
}

package io.veracode.asc.bbaukema.springbootcwe117;

import io.veracode.asc.bbaukema.springbootcwe117.logging.MyLogger;
import io.veracode.asc.bbaukema.springbootcwe117.logging.MyLoggerDecorator;
import io.veracode.asc.bbaukema.springbootcwe117.logging.MyLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private Logger standardLogger = LoggerFactory.getLogger(HelloController.class);
    private Logger decoratedWideLogger = MyLoggerFactory.getLogger(HelloController.class);
    private MyLogger decoratedNarrowLogger = MyLoggerFactory.getLogger(HelloController.class);
    private MyLoggerDecorator decoratedCastLogger = (MyLoggerDecorator)MyLoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String index(String name) {
        standardLogger.debug("CWE 117: " + name);
        decoratedWideLogger.debug("No CWE 117: " + name);
        decoratedNarrowLogger.debug("No CWE 117" + name);
        decoratedCastLogger.debug("No CWE 117 " + name);

        return "CWE 80: " + name + "!";
    }
}

package com.eh.webapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eh.webapi.util.Property;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version   1.0.00.EH
 * @since     1.0.00.EH
 */
@SpringBootApplication
public class MainApplication {

    private static Logger LOG = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        LOG.info("START UP MASSAGE :: {} {}", Property.WELCOME, Property.STARTING_MASSAGE);
    }
}

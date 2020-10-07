package com.eh.webapi.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Massages {

    @SuppressWarnings("unused")
    private static Logger LOG = LoggerFactory.getLogger(Massages.class);

    public static final boolean TRUE = true;
    public static final boolean FALSE = false;
    public static final String RESPONSE_MASSAGE_TRUE = "Records Found";
    public static final String RESPONSE_MASSAGE_FALSE = "No Records Found";

    public static final String WELCOME = "Welcome To Internet Cable Billing System";
    public static final String STARTING_MASSAGE = "API Can Now accessible";

    public static String welcome() {
        return WELCOME;
    }

    public static String start() {
        return STARTING_MASSAGE;
    }
}
package com.eh.webapi.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SQLProperty {

    @SuppressWarnings("unused")
    private static Logger LOG = LoggerFactory.getLogger(Property.class);

    public static final String ALL_NATIONALITY       = "SELECT * FROM nationality";
    public static final String NATIONALIRY_BY_CODE   = "SELECT * FROM nationality WHERE nationality_code =?";
    public static final String CREATE_NATIONALITY    = "INSERT INTO nationality(nationality_code, entry_date, entry_user, lang1_name, lang2_name, short_name) VALUES ( ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_NATIONALITY    = "UPDATE nationality SET update_date = ?, update_user = ?, lang1_name = ?, lang2_name = ?, short_name = ? WHERE nationality_code = ?";
}

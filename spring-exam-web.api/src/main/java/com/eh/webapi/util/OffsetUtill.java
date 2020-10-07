package com.eh.webapi.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OffsetUtill {

    @SuppressWarnings("unused")
    private static Logger LOG = LoggerFactory.getLogger(OffsetUtill.class);

    public static Map<String, Object> response(List<?> date, Long total) {
        Map<String, Object> response = new HashMap<String, Object>();
        Long pages = getPageCount(total, 10);

        response.put("total", total);
        response.put("pages", pages);
        response.put("data", date);
        response.put("success", total == 0 ? Massages.FALSE : Massages.TRUE);
        response.put("message", total == 0 ? Massages.RESPONSE_MASSAGE_FALSE : Massages.RESPONSE_MASSAGE_TRUE);

        return response;
    }

    public static Long getPageCount(Long noOfRecords, int pageSize) {
        Long pages = noOfRecords / pageSize;
        if (noOfRecords % pageSize > 0) {
            pages++;
        }
        return pages;
    }
}

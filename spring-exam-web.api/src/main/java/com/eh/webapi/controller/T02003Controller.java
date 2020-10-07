package com.eh.webapi.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.webapi.model.T02003;
import com.eh.webapi.service.T02003Service;
import com.eh.webapi.util.OffsetUtill;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
@RestController
@RequestMapping("/v.0.1/rest/api")
public class T02003Controller {

    @Autowired
    T02003Service t02003Service;

    @GetMapping("/nationality/all")
    public Map<String, Object> allNationality() throws IOException {
        List<T02003> allNationality = t02003Service.searchAllNationality();
        Long total = t02003Service.searchCountAllNationality();

        return OffsetUtill.response(allNationality, total);
    }
}

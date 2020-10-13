package com.eh.webapi.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.webapi.service.DefultService;
import com.eh.webapi.util.OffsetUtill;

@RestController
@RequestMapping("/")
public class DefultController {

    @Autowired
    DefultService defultService;

    @GetMapping
    public Map<String, Object> getDefult() {
        defultService.getDataSource();
        return OffsetUtill.response(new ArrayList<>(), 0);
    }
}

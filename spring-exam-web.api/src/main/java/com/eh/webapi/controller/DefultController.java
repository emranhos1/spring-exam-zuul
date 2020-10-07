package com.eh.webapi.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.webapi.util.OffsetUtill;

@RestController
@RequestMapping("/v.0.1/rest/api")
public class DefultController {

    @GetMapping
    public Map<String, Object> getDefult() {
        return OffsetUtill.response(new ArrayList<>(), 0L);
    }
}

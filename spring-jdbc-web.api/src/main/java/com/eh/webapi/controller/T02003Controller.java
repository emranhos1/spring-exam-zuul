package com.eh.webapi.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.webapi.model.T02003;
import com.eh.webapi.service.T02003Service;
import com.eh.webapi.util.DataSource;
import com.eh.webapi.util.OffsetUtill;

@RestController
@RequestMapping("/nationality")
public class T02003Controller {

    @SuppressWarnings("unused")
    private static Logger LOG = LoggerFactory.getLogger(DataSource.class);

    @Autowired
    T02003Service t02003Service;

    @GetMapping("/all")
    public Map<String, Object> allNationality() throws IOException {
        List<T02003> allNationality = t02003Service.searchAllNationality();
        int total = allNationality.size();

        return OffsetUtill.response(allNationality, total);
    }

    @GetMapping("/{code}")
    public Map<String,Object> nationalityByCode(@PathVariable String code) throws IOException {
        T02003 nationality = t02003Service.searchNationalityByCode(code);
        int total = (ObjectUtils.isEmpty(nationality) ? 0 : 1);

        return OffsetUtill.response(nationality, total);
    }

    @PostMapping("/create")
    public Map<String, Object> createNationality(@RequestBody T02003 t02003) {
        t02003Service.save(t02003);

        return OffsetUtill.response(t02003, 1);
    }
}

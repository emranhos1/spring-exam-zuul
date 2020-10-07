package com.eh.webapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.webapi.model.T02003;
import com.eh.webapi.repository.T02003Repository;
import com.eh.webapi.service.T02003Service;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
@Service
public class T02003ServiceImpl implements T02003Service{

    @Autowired
    T02003Repository t02003Repository;

    @Override
    public List<T02003> searchAllNationality() {
        return t02003Repository.findAll();
    }

    @Override
    public Long searchCountAllNationality() {
        return t02003Repository.count();
    }
}

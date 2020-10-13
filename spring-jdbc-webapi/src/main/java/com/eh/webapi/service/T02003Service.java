package com.eh.webapi.service;

import java.util.List;

import com.eh.webapi.model.T02003;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
public interface T02003Service {

    List<T02003> searchAllNationality();
    T02003 searchNationalityByCode(String code);

    void save(T02003 nationality);
}
package com.eh.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.webapi.model.T02003;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
@Repository
public interface T02003Repository extends JpaRepository<T02003, Integer>{

    T02003 findByNationalityCode(String code);
}

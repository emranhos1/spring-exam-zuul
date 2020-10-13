package com.eh.webapi.util;

import java.util.List;

import org.gjt.mm.mysql.Driver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
public class DataSource {

    private static Logger LOG = LoggerFactory.getLogger(DataSource.class);

    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String SCHEMA = "spring_zuul_exam";
    private final String USER_NAME = "root";
    private final String PASSWORD = "";
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {

        try {
            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
            dataSource.setDriver(new Driver());
            dataSource.setUrl(URL + SCHEMA);
            dataSource.setUsername(USER_NAME);
            dataSource.setPassword(PASSWORD);
            jdbcTemplate = new JdbcTemplate(dataSource);
        } catch (Exception e) {
            LOG.error("Exception From DataSource getJdbcTemplate Method : {}", e);
        }
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(String sql, Object[] objects) {
        int total = 0;
        try {
            total = getJdbcTemplate().update(sql, objects);
        } catch (Exception e) {
            LOG.error("Exception From DataSource insert Method : {}", e);
        }
        return total;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Object selectOne(String sql, Object[] params, Class modelClass) {
        Object object = null;
        try {
            object = getJdbcTemplate().queryForObject(sql, params, new BeanPropertyRowMapper(modelClass));
        } catch (Exception e) {
            LOG.error("Exception From DataSource selectOne Method : {}", e);
        }
        return object;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public List selectList(String sql, Object[] params, Class modelClass) {
        List list = null;
        try {
            list = getJdbcTemplate().query(sql, params, new BeanPropertyRowMapper(modelClass));
        } catch (Exception e) {
            LOG.error("Exception From DataSource selectList Method : {}", e);
        }
        return list;
    }
}

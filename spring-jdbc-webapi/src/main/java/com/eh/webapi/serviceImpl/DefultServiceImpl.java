package com.eh.webapi.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.eh.webapi.service.DefultService;
import com.eh.webapi.util.DataSource;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
@Service
public class DefultServiceImpl implements DefultService{

    private static Logger LOG = LoggerFactory.getLogger(DataSource.class);

    @Override
    public void getDataSource() {
        LOG.info("Message from DefultController");
    }


}

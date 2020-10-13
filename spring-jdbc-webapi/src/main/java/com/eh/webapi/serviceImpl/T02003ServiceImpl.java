package com.eh.webapi.serviceImpl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.eh.webapi.model.T02003;
import com.eh.webapi.service.T02003Service;
import com.eh.webapi.util.DataSource;
import com.eh.webapi.util.SQLProperty;
/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
@Service
public class T02003ServiceImpl implements T02003Service{

    //FIXME Need to use @Autowired
    private DataSource dataSource = new DataSource();

    @SuppressWarnings("unused")
    private static Logger LOG = LoggerFactory.getLogger(DataSource.class);

    @SuppressWarnings("unchecked")
    @Override
    public List<T02003> searchAllNationality() {
        return dataSource.selectList(SQLProperty.ALL_NATIONALITY, new Object[]{}, T02003.class);
    }

    @Override
    public T02003 searchNationalityByCode(String code) {
        return (T02003) dataSource.selectOne(SQLProperty.NATIONALIRY_BY_CODE, new Object[]{code}, T02003.class);
    }

    @Override
    public void save(T02003 t02003) {
        T02003 hasNationality = (T02003) dataSource.selectOne(SQLProperty.NATIONALIRY_BY_CODE, new Object[]{t02003.getNationalityCode()}, T02003.class);
        if(!ObjectUtils.isEmpty(hasNationality)) {
            dataSource.insert(
                    SQLProperty.UPDATE_NATIONALITY, 
                    new Object[]{ new Date(), t02003.getAmendUser(), t02003.getNameNative(), t02003.getNameGlobal(), t02003.getNameShrt(), t02003.getNationalityCode()}
                );
        } else {
            dataSource.insert(
                    SQLProperty.CREATE_NATIONALITY, 
                    new Object[]{ t02003.getNationalityCode(), new Date(), "SELF", t02003.getNameNative(), t02003.getNameGlobal(), t02003.getNameShrt()}
                );
        }
    }
}

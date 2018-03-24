package com.peng.service;

import com.peng.domain.Girl;
import com.peng.exception.GirlException;
import com.peng.exception.ResultEnum;
import com.peng.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;


   //该方法处于事务之下
    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);

    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age<10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age>10 && age< 16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);

        }

    }

    /**
     * unitTest 方法
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }

}

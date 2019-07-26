package com.czxy.service;

import com.czxy.dao.BaseDictMapper;
import com.czxy.domain.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author : 传智新星
 * @date : 2019/7/4  11:18
 */
@Transactional
@Service
public class Baseservice {
    @Autowired
    private BaseDictMapper baseDictMapper;
    public List<BaseDict> findAllCustSourceBaseDict() {
        Example example = Example.builder(BaseDict.class).build();
        example.createCriteria().andEqualTo("dictTypeCode","002");
        return baseDictMapper.selectByExample(example);
    }
    public List<BaseDict> findAllCustomerLevel() {

        Example build = Example.builder(BaseDict.class).build();
        build.createCriteria().andEqualTo("dictTypeCode","006");
        return  baseDictMapper.selectByExample(build);
    }
}

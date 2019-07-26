package com.czxy.dao;

import com.czxy.domain.Customer;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface CustomerMapper extends Mapper<Customer> {
    @Select("select * from cst_customer")
    @Results({
            @Result(property = "custId",column = "cust_id"),
            @Result(property = "custName",column = "cust_name"),
            @Result(property = "custAddress",column = "cust_address"),
            @Result(property = "custIndustry",column = "cust_industry"),
            @Result(property = "custPhone",column = "cust_phone"),
            @Result(property = "custSourceBaseDict",column = "cust_source",one = @One(select = "com.czxy.dao.BaseDictMapper.selectByPrimaryKey")),
            @Result(property = "custLevelBaseDict",column = "cust_level",one = @One(select = "com.czxy.dao.BaseDictMapper.selectByPrimaryKey"))
    })
    List<Customer> findAll();


}

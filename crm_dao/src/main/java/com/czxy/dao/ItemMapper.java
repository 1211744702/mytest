package com.czxy.dao;

import com.czxy.domain.Items;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author : 传智新星
 * @date : 2019/7/5  11:40
 */
@Repository
@org.apache.ibatis.annotations.Mapper
public interface ItemMapper extends Mapper<Items> {

    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "money",column = "money"),
            @Result(property = "filepath",column = "filepath"),
            @Result(property = "introduce",column = "introduce"),
    })
    @Select("insert into `items` values(#{name},#{money},#{filepath},#{introduce})")
    void  insertItem(Items items);

    @Select("select * from items")
    List<Items> showAll();
}

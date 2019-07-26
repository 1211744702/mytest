package com.czxy.dao;

import com.czxy.domain.BaseDict;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface BaseDictMapper extends Mapper<BaseDict> {
	
	@Select("SELECT * FROM base_dict WHERE dict_type_code =#{type}")
	public List<BaseDict> findByTypeCode(@Param("type") String type);

}
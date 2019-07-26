package com.czxy.dao;

import com.czxy.domain.LinkMan;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface LinkManMapper extends Mapper<LinkMan> {

}

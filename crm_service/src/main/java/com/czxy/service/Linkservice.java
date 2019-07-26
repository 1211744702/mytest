package com.czxy.service;

import com.czxy.dao.LinkManMapper;
import com.czxy.domain.LinkMan;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : 传智新星
 * @date : 2019/7/4  20:08
 */
@Repository
@Service
@Transactional
public class Linkservice {
    @Autowired
    private LinkManMapper manMapper;
    public PageInfo<LinkMan> ShowAll(int number) {
        PageHelper.startPage(number,5);
        List<LinkMan> men = manMapper.selectAll();
        PageInfo<LinkMan> pageInfo=new PageInfo<>(men);
        return  pageInfo;
    }

    public void addLinkMan(LinkMan linkMan) {
        manMapper.insert(linkMan);
    }

    public LinkMan findbyid(Integer id) {
        LinkMan linkMan = manMapper.selectByPrimaryKey(id);
        return linkMan;
    }
}

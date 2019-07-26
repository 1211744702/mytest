package com.czxy.service;

import com.czxy.dao.ItemMapper;
import com.czxy.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : 传智新星
 * @date : 2019/7/5  17:28
 */
@Transactional
@Service
public class Itemservice {
    @Autowired
    private ItemMapper itemMapper;
    public List<Items> list(){
        return  itemMapper.showAll();
    }
    public  void  addfile(Items items){
        itemMapper.insertItem(items);
    }
}

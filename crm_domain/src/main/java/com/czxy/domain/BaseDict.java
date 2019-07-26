package com.czxy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="base_dict")
public class BaseDict {
    // 编号
    @Id
    private String dictId;
    //数据字典类别代码
    private String dictTypeCode;
    //数据字典类别名称
    private String dictTypeName;
    //数据字典项目名称
    private String dictItemName;
    //数据字典项目
    private String dictItemCode;
    //排序字段
    private String dictSort;
    //状态 0 停用 1 启用
    private String dictEnable;
    // 备注
    private String dictMemo;

    @Override
    public String toString() {
        return "BaseDict{" +
                "dictId='" + dictId + '\'' +
                ", dictTypeCode='" + dictTypeCode + '\'' +
                ", dictTypeName='" + dictTypeName + '\'' +
                ", dictItemName='" + dictItemName + '\'' +
                ", dictItemCode='" + dictItemCode + '\'' +
                ", dictSort='" + dictSort + '\'' +
                ", dictEnable='" + dictEnable + '\'' +
                ", dictMemo='" + dictMemo + '\'' +
                '}';
    }

    public BaseDict(String dictId, String dictTypeCode, String dictTypeName, String dictItemName, String dictItemCode, String dictSort, String dictEnable, String dictMemo) {
        this.dictId = dictId;
        this.dictTypeCode = dictTypeCode;
        this.dictTypeName = dictTypeName;
        this.dictItemName = dictItemName;
        this.dictItemCode = dictItemCode;
        this.dictSort = dictSort;
        this.dictEnable = dictEnable;
        this.dictMemo = dictMemo;
    }

    public BaseDict() {

    }

    public String getDictId() {

        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName;
    }

    public String getDictItemCode() {
        return dictItemCode;
    }

    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode;
    }

    public String getDictSort() {
        return dictSort;
    }

    public void setDictSort(String dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictEnable() {
        return dictEnable;
    }

    public void setDictEnable(String dictEnable) {
        this.dictEnable = dictEnable;
    }

    public String getDictMemo() {
        return dictMemo;
    }

    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo;
    }
}

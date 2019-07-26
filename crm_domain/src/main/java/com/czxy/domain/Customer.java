package com.czxy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 客户
 * @author Administrator
 */
@Entity
@Table(name="cst_customer")
public class Customer {

    // 默认编写，配置文件。整合命名规范，默认把 _ 去掉，变成大写
    // 主键
    @Id
    private Long custId;
    // 客户名称
    private String custName;
    // 客户来源
    private String custSource;
    // 客户行业
    private String custIndustry;
    // 客户级别
    private String custLevel;

    // 客户地址
    private String custAddress;
    // 客户电话
    private String custPhone;

    private BaseDict custSourceBaseDict;
    private BaseDict custLevelBaseDict;

    public BaseDict getCustSourceBaseDict() {
        return custSourceBaseDict;
    }

    public void setCustSourceBaseDict(BaseDict custSourceBaseDict) {
        this.custSourceBaseDict = custSourceBaseDict;
    }

    public BaseDict getCustLevelBaseDict() {
        return custLevelBaseDict;
    }

    public void setCustLevelBaseDict(BaseDict custLevelBaseDict) {
        this.custLevelBaseDict = custLevelBaseDict;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custPhone='" + custPhone + '\'' +
                '}';
    }

    public Customer() {
    }

    public Customer(Long custId, String custName, String custSource, String custIndustry, String custLevel, String custAddress, String custPhone) {

        this.custId = custId;
        this.custName = custName;
        this.custSource = custSource;
        this.custIndustry = custIndustry;
        this.custLevel = custLevel;
        this.custAddress = custAddress;
        this.custPhone = custPhone;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
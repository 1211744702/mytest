package com.czxy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 联系人，多方
 * @author Administrator
 */
@Entity
@Table(name="cst_linkman")
public class LinkMan {

    // 主键
    @Id
    private Long lkmId;
    // 名称
    private String lkmName;
    // 性别
    private String lkmGender;
    // 电话
    private String lkmPhone;
    // 移动电话
    private String lkmMobile;
    // 邮箱
    private String lkmEmail;
    // 职位
    private String lkmPosition;
    // 备注
    private String lkmMemo;


    // 客户的对象
    private Customer customer;

    @Column(name="lkm_cust_id")
    private Long custId;				//所属客户主键信息（及联系人的外键）


    public LinkMan() {
    }



    public Long getLkmId() {

        return lkmId;
    }

    public void setLkmId(Long lkmId) {
        this.lkmId = lkmId;
    }

    public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    public String getLkmGender() {
        return lkmGender;
    }

    public void setLkmGender(String lkmGender) {
        this.lkmGender = lkmGender;
    }

    public String getLkmPhone() {
        return lkmPhone;
    }

    public void setLkmPhone(String lkmPhone) {
        this.lkmPhone = lkmPhone;
    }

    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    public String getLkmEmail() {
        return lkmEmail;
    }

    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }

    public String getLkmPosition() {
        return lkmPosition;
    }

    public void setLkmPosition(String lkmPosition) {
        this.lkmPosition = lkmPosition;
    }

    public String getLkmMemo() {
        return lkmMemo;
    }

    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "LinkMan{" +
                "lkmId=" + lkmId +
                ", lkmName='" + lkmName + '\'' +
                ", lkmGender='" + lkmGender + '\'' +
                ", lkmPhone='" + lkmPhone + '\'' +
                ", lkmMobile='" + lkmMobile + '\'' +
                ", lkmEmail='" + lkmEmail + '\'' +
                ", lkmPosition='" + lkmPosition + '\'' +
                ", lkmMemo='" + lkmMemo + '\'' +
                ", customer=" + customer +
                ", custId=" + custId +
                '}';
    }

    public LinkMan(Long lkmId, String lkmName, String lkmGender, String lkmPhone, String lkmMobile, String lkmEmail, String lkmPosition, String lkmMemo, Customer customer, Long custId) {
        this.lkmId = lkmId;
        this.lkmName = lkmName;
        this.lkmGender = lkmGender;
        this.lkmPhone = lkmPhone;
        this.lkmMobile = lkmMobile;
        this.lkmEmail = lkmEmail;
        this.lkmPosition = lkmPosition;
        this.lkmMemo = lkmMemo;
        this.customer = customer;
        this.custId = custId;
    }
}

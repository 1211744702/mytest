package com.czxy.domain;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author : 传智新星
 * @date : 2019/7/5  11:38
 */
public class Items {
    @Id
    private  String name;
    @Column(name = "money")
    private  Double money;
    private  String filepath;
    @Column(name = "introduce")
    private  String introduce;

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", filepath='" + filepath + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getmoney() {
        return money;
    }

    public void setmoney(Double money) {
        this.money = money;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getintroduce() {
        return introduce;
    }

    public void setintroduce(String introduce) {
        this.introduce = introduce;
    }

    public Items(String name, Double money, String filepath, String introduce) {
        this.name = name;
        this.money = money;
        this.filepath = filepath;
        this.introduce = introduce;
    }

    public Items() {
    }
}

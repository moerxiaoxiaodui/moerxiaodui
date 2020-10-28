package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/20 - 15:21
 */
@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //jpa通用策略生成器：IDENTITY：主键由数据库自动生成（主要是自动增长型）
    @Column(name = "id")    //因为配置文件是物理命名策略，所以用@Column注解声明列名，初始值默认数据库列名与属性值一致
    private Integer id;
    @Column(name = "phone")
    private String phone;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "sex")
    private String sex;
    @Column(name = "birth")
    private String birth;
    @Column(name = "introduce")
    private String introduce;
    @Column(name = "address")
    private String address;
    @Column(name = "intentionJob")
    private String intentionJob;
    @Column(name = "avatar")
    private String avatar;

    public User() {
    }

    public User(String phone, String password, String name, String sex, String birth, String introduce, String address, String intentionJob, String avatar) {
        this.phone = phone;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.introduce = introduce;
        this.address = address;
        this.intentionJob = intentionJob;
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", introduce='" + introduce + '\'' +
                ", address='" + address + '\'' +
                ", intentionJob='" + intentionJob + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntentionJob() {
        return intentionJob;
    }

    public void setIntentionJob(String intentionJob) {
        this.intentionJob = intentionJob;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

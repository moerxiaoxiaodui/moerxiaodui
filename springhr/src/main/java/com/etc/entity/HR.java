package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hr")
@Data
public class HR implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name="sex")
    private String sex;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name = "nickName")
    private String nickName;
    @Column(name="password")
    private String password;


//    @Column(name="compentId")
//    private String compentId;

    @OneToOne
    @JoinColumn(name="compentId")
    private Company company;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getCompentId() {
//        return compentId;
//    }
//
//    public void setCompentId(String compentId) {
//        this.compentId = compentId;
//    }

    public HR() {
    }

    public HR(int id, String name, String sex, String phone, String email, String nickName, String password) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.nickName = nickName;
        this.password = password;
//        this.compentId = compentId;
    }

    @Override
    public String toString() {
        return "HR{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
//                ", compentId='" + compentId + '\'' +
                '}';
    }
}

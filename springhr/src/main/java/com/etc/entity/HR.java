package com.etc.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hr")
public class HR implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String sex;
    private String phone;
    private String email;
    private String nickName;
    private String password;
    private String compentId;

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
                ", compentId='" + compentId + '\'' +
                '}';
    }
}

package com.etc.entity;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Table(name = "company")
@Data
@Entity
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name="avatar")
    private String avatar;
    @Column(name = "introduce")
    private String introduce;
    @Column(name = "scale")
    private String scale;
    @Column(name = "type")
    private String type;

    public Company(String name, String address, String avatar, String introduce, String scale, String type) {
        this.name = name;
        this.address = address;
        this.avatar = avatar;
        this.introduce = introduce;
        this.scale = scale;
        this.type = type;
    }

    public Company() {
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                ", introduce='" + introduce + '\'' +
                ", scale='" + scale + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

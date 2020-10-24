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
}

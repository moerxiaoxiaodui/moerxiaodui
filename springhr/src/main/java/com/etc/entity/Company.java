package com.etc.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
@Table(name = "company")
@Data
public class Company implements Serializable {
    private int id;
}

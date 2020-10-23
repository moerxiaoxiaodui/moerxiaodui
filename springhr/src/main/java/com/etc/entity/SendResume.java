package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sendresume")
@Data
public class SendResume implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "job")
    private String job;
    @Column(name = "time")
    private String time;
    @Column(name = "resumeId")
    private int resumeId;
    @Column(name = "hrId")
    private int hrId;
}

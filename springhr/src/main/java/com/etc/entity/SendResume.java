package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="sendresume")
@Data
public class SendResume implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String job;

    private String time;

    @OneToOne
    @JoinColumn(name="resumeId")
    private Resume resume;

    @OneToOne
    @JoinColumn(name = "hrId")
    private HR hr;

    @Override
    public String toString() {
        return "SendResume{" +
                "id=" + id +
                ", job='" + job + '\'' +
                ", time='" + time + '\'' +
                ", resume=" + resume +
                ", hr=" + hr +
                '}';
    }
}

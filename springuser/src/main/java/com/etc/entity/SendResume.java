package com.etc.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/24 - 9:39
 */
@Entity
@Table(name = "sendresume")
public class SendResume implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "job")
    private String job;
    @Column(name = "time")
    private String time;
    @Column(name = "resumeId")
    private Integer resumeId;
    @Column(name = "hrId")
    private Integer hrId;

    public SendResume() {
    }

    public SendResume(String job, String time, Integer resumeId, Integer hrId) {
        this.job = job;
        this.time = time;
        this.resumeId = resumeId;
        this.hrId = hrId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getHrId() {
        return hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }
}

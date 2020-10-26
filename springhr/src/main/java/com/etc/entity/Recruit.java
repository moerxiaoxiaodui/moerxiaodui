package com.etc.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/26 - 8:58
 */
@Entity
@Table(name = "recruit")
public class Recruit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "job")
    private String job;
    @Column(name = "salary")
    private String salary;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "createTime")
    private String createTime;
    @Column(name = "updateTime")
    private String updateTime;
    @Column(name = "hrId")
    private Integer hrId;

    public Recruit(String job, String salary, String title, String content, String createTime, String updateTime, Integer hrId) {
        this.job = job;
        this.salary = salary;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.hrId = hrId;
    }

    public Recruit() {
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getHrId() {
        return hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", job='" + job + '\'' +
                ", salary='" + salary + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", hrId=" + hrId +
                '}';
    }
}

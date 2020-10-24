package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/21 - 15:58
 */
@Entity
@Data
@Table(name = "resume")
public class Resume implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "sex")
    String sex;
    @Column(name = "birth")
    String birth;
    @Column(name = "school")
    String school;
    @Column(name = "address")
    String address;
    @Column(name = "endTime")
    String endTime;
    @Column(name = "skills")
    String skills;
    @Column(name = "phone")
    String phone;
    @Column(name = "email")
    String email;
    @Column(name = "introduce")
    String introduce;
    @Column(name = "experience")
    String experience;
    @Column(name = "awards")
    String awards;
    @Column(name = "avatar")
    String avatar;
    @Column(name = "major")
    String major;
    @Column(name = "ecucation")
    String ecucation;
    @Column(name = "userId")
    String userId;

    public Resume() {
    }

    public Resume(String name, String sex, String birth, String school, String address, String endTime, String skills, String phone, String email, String introduce, String experience, String awards, String avatar, String major, String ecucation, String userId) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.school = school;
        this.address = address;
        this.endTime = endTime;
        this.skills = skills;
        this.phone = phone;
        this.email = email;
        this.introduce = introduce;
        this.experience = experience;
        this.awards = awards;
        this.avatar = avatar;
        this.major = major;
        this.ecucation = ecucation;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEcucation() {
        return ecucation;
    }

    public void setEcucation(String ecucation) {
        this.ecucation = ecucation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", school='" + school + '\'' +
                ", address='" + address + '\'' +
                ", endTime='" + endTime + '\'' +
                ", skills='" + skills + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", introduce='" + introduce + '\'' +
                ", experience='" + experience + '\'' +
                ", awards='" + awards + '\'' +
                ", avatar='" + avatar + '\'' +
                ", major='" + major + '\'' +
                ", ecucation='" + ecucation + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}

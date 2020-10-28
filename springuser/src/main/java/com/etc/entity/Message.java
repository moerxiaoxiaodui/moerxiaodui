package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="message")
@Data
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    private int fromId; //发送方id

    private int toId;       //接收方id

    private String title;   //消息标题

    private String content; //消息正文

    private String createTime;  //创建时间

    private String readState;   //消息已读状态

    @OneToOne
    @JoinColumn(name="fromId")
    private HR hr;

    @Override
    public String  toString() {
        return "Message{" +
                "id=" + id +
//                ", fromId=" + fromId +
                ", toId=" + toId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", readState='" + readState + '\'' +
                ", hr=" + hr +
                '}';
    }

    public void setReadState(String s) {
    }
}

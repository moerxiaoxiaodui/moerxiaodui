package com.etc.service;

import com.etc.entity.Message;

import java.util.List;

public interface MessageService {

    //应聘人查看自己面试结果
    public List<Message> findAllByToId(int id);

    //添加面试通知信息
    public void saveMessage(Message message);

    //修改面试通知已读状态
    public int updateMessageReadState(int id);

    //查看用户有多少面试消息
    public int findUserMessageCount(int id);

    //查看用户有多少未读的面试消息
    public int findUserNoReadMessageCount(int id);

    //用户删除面试消息
    public void deleteMessage(int id);

    public Message findById(int id);
}

package com.etc.service.impl;

import com.etc.dao.MessageDao;
import com.etc.entity.Message;
import com.etc.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageDao messageDao;


    @Override
    public List<Message> findAllByToId(int id) {
        return messageDao.findAllByToId(id);
    }

    //添加,修改面试信息内容
    public void saveMessage(Message message){
        messageDao.save(message);
    }

    //修改面试通知已读状态
    public int updateMessageReadState(int id){
        return messageDao.updateMessageReadStateById(id);
    }

    @Override
    public int findUserMessageCount(int id) {
        return messageDao.findUserMessageCount(id);
    }

    @Override
    public int findUserNoReadMessageCount(int id) {
        return messageDao.findUserNoReadMessageCount(id);
    }

    //用户删除消息
    @Override
    public void deleteMessage(int id) {
        messageDao.deleteById(id);
    }

    @Override
    public Message findById(int id) {
        return messageDao.findById(id);
    }

}

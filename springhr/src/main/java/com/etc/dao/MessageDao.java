package com.etc.dao;

import com.etc.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
public interface MessageDao extends JpaRepository<Message,Integer>, JpaSpecificationExecutor<Message>, Serializable {

    //应聘人查看自己的面试结果
   public List<Message> findAllByToId(int id);

    //修改消息已读状态
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update message set readState= '1' where id = ?",nativeQuery = true)
    public int updateMessageReadStateById(int id);

    //查看用户共有几个面试结果通知
    @Query(value = "select count(*) from message where toId=?",nativeQuery=true)
    public int findUserMessageCount(int id);

    //查看用户有多少未读消息
    @Query(value = "select count(*) from message where toId=? and readState='0'",nativeQuery=true)
    public int findUserNoReadMessageCount(int id);




}

package com.etc.dao;

import com.etc.entity.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author huge
 * @date 2020/10/26 - 15:39
 */
@Repository
public interface RecruitDao extends JpaRepository<Recruit,Integer>, JpaSpecificationExecutor<Recruit>, Serializable {

    //模糊查询工作岗位
    @Query(value = "select * from recruit ",nativeQuery = true)
    public List<Recruit> findRecruitByKey(String key);

    public Recruit findById(int id);

}

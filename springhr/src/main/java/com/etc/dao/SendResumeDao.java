package com.etc.dao;

import com.etc.entity.SendResume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;


@Repository
public interface SendResumeDao extends JpaRepository<SendResume,Integer>, JpaSpecificationExecutor<SendResume>, Serializable {

    public List<SendResume> findAllByHr_Id(int id);

}

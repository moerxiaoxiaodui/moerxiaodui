package com.etc.dao;

import com.etc.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

public interface CompanyDao extends JpaRepository<Company,Integer>,JpaSpecificationExecutor<Company>, Serializable {
   
}

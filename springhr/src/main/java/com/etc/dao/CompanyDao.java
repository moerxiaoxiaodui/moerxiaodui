package com.etc.dao;

import com.etc.entity.AllInfo;
import com.etc.entity.Company;
import com.etc.entity.ViewInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface CompanyDao extends JpaRepository<Company,Integer>,JpaSpecificationExecutor<Company>, Serializable {
    /*
    * 查找全部company和hr
    * */
   @Query(value="select new com.etc.entity.ViewInfo(c,h) from Company c,HR h where c.id = h.compentId")
    public List<ViewInfo> findAllCompanyAndHR();

    @Query(value="select new com.etc.entity.ViewInfo(c,h) from Company c,HR h where c.id = h.compentId")
    public Page<ViewInfo> findAllCompanys(Pageable pageable);

   @Query(value="select new com.etc.entity.ViewInfo(c,h) from Company c,HR h where c.id = h.compentId and h.phone like ?1")
    public Page<ViewInfo> findAllCompanyAndHR2(String phone, Pageable pageable);

   @Query(value = "select new com.etc.entity.AllInfo(c,h,r) from Company c,HR h,Recruit r where c.id=h.compentId and h.id=r.hrId")
    public List<AllInfo> findAllCHR();
    /**
     * 根据hr的电话号码查找公司、hr和招聘条件
     * */
    @Query(value = "select new com.etc.entity.AllInfo(c,h,r) from Company c,HR h,Recruit r where h.phone=?1 and c.id=h.compentId and h.id=r.hrId ")
    public List<AllInfo> findCHR(String phone);




}

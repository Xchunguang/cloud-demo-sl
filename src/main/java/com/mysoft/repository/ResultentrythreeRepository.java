package com.mysoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysoft.module.Resultentrythree;
@Repository
public interface ResultentrythreeRepository extends JpaRepository<Resultentrythree, Integer>{

	@Query("select count(r) from Resultentrythree r where r.code = ?1 and r.wz like %?2%")
	public Integer getMechineType(String code,String province);
	
	@Query("select count(r) from Resultentrythree r where r.sbzt0 = ?1 and r.wz like %?2%")
	public Integer getMechineState(String sbzt0,String province);
	
	@Query("select count(r) from Resultentrythree r where r.sbzt1 = ?1 and r.wz like %?2%")
	public Integer getJiaofu(String sbzt1,String province);
	
	public List<Resultentrythree> findBySbbh(String sbbh);
	
}

package com.mysoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysoft.module.Resultentrytwo;
@Repository
public interface ResultentrytwoRepository extends JpaRepository<Resultentrytwo, Integer>{

	@Query("select count(r) from Resultentrytwo r where r.nd = ?1 and r.fgsb like %?2% and r.sbztmc like %?3%")
	public Integer getMechineBack(String nd,String province,String sbztmc);
	
	
}

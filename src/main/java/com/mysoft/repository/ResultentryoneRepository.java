package com.mysoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysoft.module.Resultentryone;
@Repository
public interface ResultentryoneRepository extends JpaRepository<Resultentryone, Integer>{

	@Query("select count(r) from Resultentryone r where r.zxqdhtrq0 like %?1% and r.fgsb like %?2%")
	public Integer getMechineRepire(String time,String province);
	
	
}

package com.mysoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysoft.module.Allmechine;

@Repository
public interface AllMechineRepository extends JpaRepository<Allmechine, Integer>{

	@Query("select r from Allmechine r where r.mvalue like %?1% and r.mtype = ?2")
	public List<Allmechine> getMechine(String province,String type);
	
	@Query("select r from Allmechine r where r.mtype = ?1 and r.allmechineid < 2000")
	public List<Allmechine> getByMtype(String type);
	
}

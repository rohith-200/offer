package com.demo.entity;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Integer> {
//	@Query(value = "select * from doctorName=?", nativeQuery = true)
//	List<Doctor> getByDoctorName(String name);
//	
//	@Query(value = "select * from specialization=?", nativeQuery = true)
//	List<Doctor> getByDoctorSpecialization(String spec);
//	
//	@Query(value = "select * from area=?", nativeQuery = true)
//	List<Doctor> getByDoctorArea(String area);
//	
//	@Transactional
//	@Modifying
//	@Query(value="UPDATE Doctor SET doctorName=:name, specialization=:spec,cost=:cost,area=:area,email=:email,pwd=:pwd,confirmpwd=:confirmpwd,mobileNum=:mobileNum WHERE doctorId=:id", nativeQuery=true)
//	void updateByDoctorId(@Param("name") String name,@Param("spec") String spec,@Param("cost") double cost,@Param("area") String area,@Param("email") String email,@Param("pwd") String pwd,@Param("confirmpwd") String confirmpwd,@Param("mobileNum") int mobileNum,@Param("id") int id);


}

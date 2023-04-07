package com.demo.entity;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface UserRepo extends CrudRepository<User, Integer>{
//	@Query(value = "select userName,email,phnNo from User where userId=?", nativeQuery = true)
//	List<User> findAllUsers(int id);
//	
//	@Transactional
//	@Modifying
//	@Query(value="UPDATE User SET userName=:name,email=:email,pwd=:pwd,confirmpwd=:confirmpwd,phnNo=:phnNo WHERE userId=:id", nativeQuery=true)
//	void updateByUserId(@Param("name") String name,@Param("email") String email,@Param("pwd") String pwd,@Param("confirmpwd") String confirmpwd,@Param("phnNo") int phnNo,@Param("id") int id);


}

package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Id;



@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    @Column(name = "doctorname", nullable = false)
    private String doctorName;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name = "cost", nullable = false)
    private Double cost;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "pwd", nullable = false)
    private String password;

    @Column(name = "docphno", nullable = false)
    private String docPhno;

    @OneToMany(mappedBy = "doctor")
    private Set<User> users = new HashSet<>();

	public Doctor(Long doctorId, String doctorName, String specialization, Double cost, String area, String email,
			String password, String docPhno, Set<User> users) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.cost = cost;
		this.area = area;
		this.email = email;
		this.password = password;
		this.docPhno = docPhno;
		this.users = users;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDocPhno() {
		return docPhno;
	}

	public void setDocPhno(String docPhno) {
		this.docPhno = docPhno;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
    
    
}

package com.demo.entity;


import java.time.LocalDate;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentId;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "userphno", nullable = false)
    private String userPhno;

    @Column(name = "userid", nullable = false)
    private Long userId;

    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    @Column(name = "date", nullable = false)
    private LocalDate date;

	public Appointment(Long appointmentId, Doctor doctor, String username, String userPhno, Long userId,
			LocalDateTime time, LocalDate date) {
		this.appointmentId = appointmentId;
		this.doctor = doctor;
		this.username = username;
		this.userPhno = userPhno;
		this.userId = userId;
		this.time = time;
		this.date = date;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPhno() {
		return userPhno;
	}

	public void setUserPhno(String userPhno) {
		this.userPhno = userPhno;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

    
}

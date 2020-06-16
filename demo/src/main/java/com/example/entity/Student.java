package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@Column(name = "ST_ID")
	private String id = null;
	
	@Column(name = "ST_NAME")
	private String name = null;
	
	@Column(name = "ST_KOR")
	private int kor = 0;
	
	@Column(name = "ST_ENG")
	private int eng = 0;	
	
	@Column(name = "ST_MATH")
	private int math = 0;
	
	@CreationTimestamp
	@Column(name = "ST_DATE")
	private Date date = null;
	
// 생성자(Constructor)
	public Student() {
		
	}
	
	public Student(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
// Getter Setter	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//to String
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", date="
				+ date + "]";
	}	

}

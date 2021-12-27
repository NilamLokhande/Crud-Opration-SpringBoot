package com.example.demo.EmployeeBean;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class EmployeeBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private Integer age;
	@Column(name="Address")
	private String address;
	
	public EmployeeBean() {
		super();
	
	}
	public EmployeeBean(Integer id, String name, Integer age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Integer getEmployeeId() {
		return id;
	}
	public void setEmployeeId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}

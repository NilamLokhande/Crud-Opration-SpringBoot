package com.example.demo.EmployeeRepository;



import com.example.demo.EmployeeBean.EmployeeBean;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<EmployeeBean,Integer>{

}


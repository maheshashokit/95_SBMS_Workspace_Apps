package com.ashokit.dao;

import com.ashokit.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean createEmployee(Employee emp) {
       int rowCount = jdbcTemplate.update("insert into ashokit_emps values(?,?,?)", emp.getEmpId(),emp.getEmpName(),emp.getEmailId());
       return rowCount > 0;
    }

    @Override
    public int createEmployees(List<Employee> emps) {
        int totalRowsStatus = 0;
        for(Employee emp: emps){
            int currentRowStatus = jdbcTemplate.update("insert into ashokit_emps values(?,?,?)", emp.getEmpId(),emp.getEmpName(),emp.getEmailId());
            totalRowsStatus += currentRowStatus;
        }
        return totalRowsStatus;
    }
}

/**
 * Project : spring_toturial
 * Package : com.never.demo.dao.impl
 * Author  : xzllc2010<xzllc2010@gmail.com>
 * Create  : On 10/16/2014
 */

package com.never.demo.dao.impl;


import com.never.demo.dao.EmployeeDAO;
import com.never.demo.dataobject.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee findById(final int id)
    {
        String sqlStr = "SELECT id, name, age FROM employee WHERE id = ?";
        final Employee employee = new Employee();
        jdbcTemplate.query(sqlStr, new Object[]{id},
                new RowCallbackHandler(){
                    public void processRow(ResultSet rs) throws SQLException
                    {
                        employee.setId(id);
                        employee.setName(rs.getString("name"));
                        employee.setAge(rs.getInt("age"));
                    }

                });
        return employee;
    }




}

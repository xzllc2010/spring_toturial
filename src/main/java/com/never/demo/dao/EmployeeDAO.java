/**
 * Project : spring_toturial
 * Package : com.never.demo.dao
 * Author  : xzllc2010<xzllc2010@gmail.com>
 * Create  : On 10/16/2014
 */

package com.never.demo.dao;

import com.never.demo.dataobject.Employee;

public interface  EmployeeDAO {
    public Employee findById(int id);
}

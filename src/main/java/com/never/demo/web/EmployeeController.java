/**
 * Project : spring_toturial
 * Package : com.never.demo.web
 * Author  : xzllc2010<xzllc2010@gmail.com>
 * Create  : On 10/16/2014
 */

package com.never.demo.web;

import javax.servlet.http.HttpServletRequest;

import com.never.demo.dao.EmployeeDAO;
import com.never.demo.dataobject.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "/findEmployee")
    public ModelAndView findEmployee(HttpServletRequest request) {

        Employee employee = employeeDAO.findById(1);
        request.getSession().setAttribute("employee", employee);
        return new ModelAndView("employee");
    }

}

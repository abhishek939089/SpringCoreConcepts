package com.example.SpringCore.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eid;
    private String ename;

    @Autowired
    private DepartmentBean deptBean; // Field Injection

    private static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean() {
        logger.trace("*** Autowiring by using @Autowired annotation on constructor ***");
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean) { // Setter Injection
        logger.trace("*** Autowiring by using @Autowired annotation on Setter ***");
        this.deptBean = deptBean;
    }

    public void showEmployeeDetails() {
        logger.debug("Employee ID: " + eid);
        logger.debug("Employee Name: " + ename);
        logger.debug("Department: " + deptBean.getDeptName());
    }
}

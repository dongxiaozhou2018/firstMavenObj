package com.neuedu.jdbc.dao;

import com.neuedu.jdbc.mybatisDemo.Employees;

import java.util.List;

public interface EmployeesDao {

    //添加
    void  addOneEmployee(Employees employees);
    //删除
    void deleteOneEmployee(int employee_id);
    //修改
    void updateOneEmployee(Employees employees);
    //模糊查询
    public List<Employees> getEmployeeByName(String name);
    //查询所有
    List<Employees> SelectAllBoy();
}

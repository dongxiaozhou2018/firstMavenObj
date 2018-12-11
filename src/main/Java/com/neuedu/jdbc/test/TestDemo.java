package com.neuedu.jdbc.test;

import com.neuedu.jdbc.DBUtils.DBUtils;
import com.neuedu.jdbc.dao.EmployeesDao;
import com.neuedu.jdbc.mybatisDemo.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestDemo {

    @Test
    public void Test()
    {
        SqlSession sqlSession = DBUtils.getSqlSession();
        EmployeesDao mapper = sqlSession.getMapper(EmployeesDao.class);
        List<Employees> employees = mapper.SelectAllBoy();
        System.out.println(employees);
    }
}

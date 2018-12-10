package com.neuedu.jdbc.mybatisDemo;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.List;

public class MyFirstBatis {

    @Test
    public  void test()
    {
//     查询所有
//     try {
//
//            InputStream resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            List<Employees> selectAllBoy = sqlSession.selectList("SelectAllBoy");
//            System.out.println(selectAllBoy);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //增加
//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            Employees employees = new Employees();
//            employees.setEmployee_id(301);
//            employees.setFirst_name("段");
//            employees.setLast_name("yu");
//            employees.setEmail("zhongguo");
//            employees.setPhone_number("136.5215.8808");
//            employees.setJob_id("IT_PROG");
//            employees.setSalary(2550.0);
//            employees.setCommission_pct(null);
//            employees.setManager_id(102);
//            employees.setDepartment_id(60);
//            employees.setHiredate(new Timestamp(System.currentTimeMillis()));
//            int addOneBoy = sqlSession.insert("AddOneBoy",employees);
//            System.out.println(addOneBoy);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //删除
//        InputStream resourceAsStream = null;
//        try {
//            resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            Employees employees = new Employees();
//            employees.setEmployee_id(300);
//            int deleteOne = sqlSession.delete("deleteOne", employees);
//            System.out.println(deleteOne);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        //修改
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            Employees employees = new Employees();
            employees.setEmployee_id(301);
            employees.setFirst_name("duan");
            employees.setLast_name("玉");
            employees.setEmail("zhongguo");
            employees.setPhone_number("136.5215.8606");
            employees.setJob_id("IT_PROG");
            employees.setSalary(2550.0);
            employees.setCommission_pct(null);
            employees.setManager_id(102);
            employees.setDepartment_id(60);
            employees.setHiredate(new Timestamp(System.currentTimeMillis()));
            int updateOne = sqlSession.update("updateOne",employees );
            System.out.println(updateOne);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

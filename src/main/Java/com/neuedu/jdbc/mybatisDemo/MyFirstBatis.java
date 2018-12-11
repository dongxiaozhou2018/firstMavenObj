//package com.neuedu.jdbc.mybatisDemo;
//
//import com.neuedu.jdbc.dao.EmployeesDao;
//import com.neuedu.jdbc.dao.EmployeesDaoImpl;
//import com.sun.xml.internal.ws.developer.UsesJAXBContext;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.jupiter.api.Test;
//
//import javax.annotation.Resource;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Timestamp;
//import java.util.List;
//
//public class MyFirstBatis {
//
//    @Test
//    public  void test()
//    {
////     查询所有
////     try {
////
////        InputStream resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
////        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
////        SqlSession sqlSession = sqlSessionFactory.openSession();
////        List<Employees> selectAllBoy = sqlSession.selectList("SelectAllBoy");
////        System.out.println(selectAllBoy);
////    } catch (IOException e) {
////        e.printStackTrace();
////    }
//
//        //增加
////        EmployeesDao employeesDao = new EmployeesDaoImpl();
////        Employees employees = new Employees(302,"段","yu","zhongguo","136.5215.8808","IT_PROG",2550.0,null,102,60,new Timestamp(System.currentTimeMillis()));
////        employeesDao.addOneEmployee(employees);
////        try {
////            InputStream resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
////            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
////            SqlSession sqlSession = sqlSessionFactory.openSession(true);
////            Employees employees = new Employees();
////            employees.setEmployee_id(301);
////            employees.setFirst_name("段");
////            employees.setLast_name("yu");
////            employees.setEmail("zhongguo");
////            employees.setPhone_number("136.5215.8808");
////            employees.setJob_id("IT_PROG");
////            employees.setSalary(2550.0);
////            employees.setCommission_pct(null);
////            employees.setManager_id(102);
////            employees.setDepartment_id(60);
////            employees.setHiredate(new Timestamp(System.currentTimeMillis()));
////            int addOneBoy = sqlSession.insert("AddOneBoy",employees);
////            System.out.println(addOneBoy);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        //删除
//
////        EmployeesDao employeesDao1 = new EmployeesDaoImpl();
////        employeesDao1.deleteOneEmployee(301);
//
////        InputStream resourceAsStream = null;
////        try {
////            resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
////            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
////            SqlSession sqlSession = sqlSessionFactory.openSession(true);
////            Employees employees = new Employees();
////            employees.setEmployee_id(300);
////            int deleteOne = sqlSession.delete("deleteOne", employees);
////            System.out.println(deleteOne);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
////        //修改
////        EmployeesDao employeesDao1 = new EmployeesDaoImpl();
////        Employees employees = new Employees(300,"段","玉","zhongguo","136.5215.8808","IT_PROG",2550.0,null,102,60,new Timestamp(System.currentTimeMillis()));
////        employeesDao1.updateOneEmployee(employees);
////        InputStream resourceAsStream = null;
////        try {
////            resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
////            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
////            SqlSession sqlSession = sqlSessionFactory.openSession(true);
////            Employees employees = new Employees();
////            employees.setEmployee_id(301);
////            employees.setFirst_name("duan");
////            employees.setLast_name("玉");
////            employees.setEmail("zhongguo");
////            employees.setPhone_number("136.5215.8606");
////            employees.setJob_id("IT_PROG");
////            employees.setSalary(2550.0);
////            employees.setCommission_pct(null);
////            employees.setManager_id(102);
////            employees.setDepartment_id(60);
////            employees.setHiredate(new Timestamp(System.currentTimeMillis()));
////            int updateOne = sqlSession.update("updateOne",employees );
////            System.out.println(updateOne);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        //模糊查询
////        EmployeesDao employeesDao = new EmployeesDaoImpl();
////        List<Employees> employeeByName = employeesDao.getEmployeeByName("Steven");
////        System.out.println(employeeByName);
//
//        //返回
//        EmployeesDao employeesDao1 = new EmployeesDaoImpl();
//        Employees employees = new Employees(null,"飞","段","zhongguo","136.5215.8808","IT_PROG",2550.0,null,102,60,new Timestamp(System.currentTimeMillis()));
//        System.out.println(employees);
//        employeesDao1.addOneEmployee(employees);
//        System.out.println(employees);
//    }
//}

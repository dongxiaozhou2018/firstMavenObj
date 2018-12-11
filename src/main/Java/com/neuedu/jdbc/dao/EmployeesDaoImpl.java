//package com.neuedu.jdbc.dao;
//
//import com.neuedu.jdbc.DBUtils.DBUtils;
//import com.neuedu.jdbc.mybatisDemo.Employees;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//
//import java.util.List;
//
//public class EmployeesDaoImpl implements EmployeesDao {
//    @Override
//    public void addOneEmployee(Employees employees) {
//        SqlSession sqlSession = DBUtils.getSqlSession();
//        int addOneEmployee = sqlSession.insert("addOneEmployeeAndReturnId", employees);
//        sqlSession.commit();
//    }
//
//    @Override
//    public void deleteOneEmployee(int employee_id) {
//        SqlSession sqlSession = DBUtils.getSqlSession();
//        sqlSession.delete("deleteOne",employee_id);
//        sqlSession.commit();
//    }
//
//    @Override
//    public void updateOneEmployee(Employees employees) {
//        SqlSession sqlSession = DBUtils.getSqlSession();
//        sqlSession.update("updateOne",employees);
//        sqlSession.commit();
//    }
//
//    @Override
//    public List<Employees> getEmployeeByName(String name) {
//        SqlSession sqlSession = DBUtils.getSqlSession();
//        List<Employees> selectEmployeeByName = sqlSession.selectList("selectEmployeeByName", name);
//        return selectEmployeeByName;
//    }
//}

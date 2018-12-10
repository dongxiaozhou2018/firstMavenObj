package com.neuedu.jdbc.DBUtils;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DBUtils {

   public static SqlSession getSqlSession() {

           InputStream resourceAsStream = null;
           try {
                   resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
                   SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
                   SqlSession sqlSession = sqlSessionFactory.openSession(true);
                   return sqlSession;
           } catch (IOException e) {
                   e.printStackTrace();
           }
           return null;
   }
}

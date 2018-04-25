package com.mybatis;

import java.io.IOException;
import java.io.InputStream;
import com.mybatis.pojo.Student;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {
    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession(true);

        //dao、mapper映射实现。
        StudentDAO dao = session.getMapper(StudentDAO.class);

        Student stu = dao.getStudent((long)52);
        System.out.println(stu);

        session.close();
    }
}

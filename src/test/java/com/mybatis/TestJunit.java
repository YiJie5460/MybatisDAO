package com.mybatis;

import com.mybatis.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {
    private SqlSession session;
    private SqlSessionFactory factory;

    @Before
    public void setUp() {
        factory = new SqlSessionFactoryBuilder().
                build(ClassLoader.getSystemResourceAsStream("mybatis/mybatis-configuration.xml"));
        session = factory.openSession();
    }

    @Test
    public void mapperClient() {
        StudentDAO dao = session.getMapper(StudentDAO.class);

        Student stu = dao.getStudent((long)52);
        System.out.println(stu);
    }

    @After
    public void tearDown() {
        session.close();
    }
}

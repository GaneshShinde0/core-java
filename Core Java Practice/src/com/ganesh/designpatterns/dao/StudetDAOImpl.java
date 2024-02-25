//package com.ganesh.designpatterns.dao;
//
//import com.ganesh.generics.Student;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository("studentDAO")
//public class studentDAOImpl extends
//        HibernateDaoSupport implements studentDAO {
//    @Autowired
//    public void anyMethodName(SessionFactory
//                                      sessionFactory) {
//        setSessionFactory(sessionFactory);
//    }
//
//    public void save(Student student) {
//        getHibernateTemplate().save(student);
//    }
//
//    public void update(Student student) {
//        getHibernateTemplate().update(student);
//    }
//
//    public void delete(Student student) {
//        getHibernateTemplate().delete(student);
//    }
//}
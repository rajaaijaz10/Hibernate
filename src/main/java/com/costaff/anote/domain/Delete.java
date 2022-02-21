package com.costaff.anote.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
    public static void main(String[] args) {
        int id =1;
        Configuration configuration= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeAnote.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        EmployeeAnote employee=session.get(EmployeeAnote.class,id);
        Transaction transaction=session.beginTransaction();
        session.delete(employee);
        transaction.commit();

        System.out.println(employee);
    }
}

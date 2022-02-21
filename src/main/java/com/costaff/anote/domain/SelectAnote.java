package com.costaff.anote.domain;

import com.costaff.xml.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectAnote {
    public static void main(String[] args) {
        Configuration configuration= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeAnote.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        EmployeeAnote employee=session.get(EmployeeAnote.class,1);

        System.out.println(employee);
    }



}

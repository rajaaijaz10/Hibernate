package com.costaff.xml.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Select {
    public static void main(String[] args) {
        Configuration configuration= new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Employee employee=session.get(Employee.class,1);

        System.out.println(employee);
    }



}

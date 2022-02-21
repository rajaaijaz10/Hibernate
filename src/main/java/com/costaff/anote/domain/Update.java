package com.costaff.anote.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
    public static void main( String[] args )
    {

        EmployeeAnote employee;

        Configuration configuration=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeAnote.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        employee=session.get(EmployeeAnote.class,1);
        Transaction transaction=session.beginTransaction();
        employee.setFirstName("Updated name");
        session.update(employee);

        transaction.commit();

    }
}

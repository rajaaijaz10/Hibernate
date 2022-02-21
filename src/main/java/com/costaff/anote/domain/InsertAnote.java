package com.costaff.anote.domain;

import com.costaff.xml.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class InsertAnote
{
    public static void main( String[] args )
    {

        EmployeeAnote obj=new EmployeeAnote(2,"Aijaz","Ahmad","Development",2000,"Aijaz@ab.com","password",true);

        Configuration configuration=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeAnote.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(obj);

        transaction.commit();

    }
}

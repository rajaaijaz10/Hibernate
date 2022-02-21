package com.costaff.xml.domain;

import com.costaff.xml.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class Insert
{
    public static void main( String[] args )
    {

        Employee obj=new Employee(1,"Aijaz","Dar","Development",2000,"Aijaz@ab.com","password",true);

        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(obj);
        transaction.commit();

    }
}

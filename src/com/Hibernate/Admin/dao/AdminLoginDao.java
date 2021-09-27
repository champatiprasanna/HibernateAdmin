package com.Hibernate.Admin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

import com.Hibernate.Admin.pojo.AdminLoginPojo;
public class AdminLoginDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scobj = new Scanner(System.in);
		
		Configuration conref = new Configuration();
		conref.configure("hibernate.cfg.xml");
		SessionFactory sfref = conref.buildSessionFactory();
		Session sref = sfref.openSession();
		Transaction tref = sref.beginTransaction();
		AdminLoginPojo adminrefa  = new AdminLoginPojo();
		
		System.out.println("1.Add" +"\n" + "2.update" + "\n" + "3.delete");
		int uchoice = scobj.nextInt();
		
		if(uchoice == 1) {
			System.out.println("Enter id");
			int id1 = scobj.nextInt();
			System.out.println("Enter name");
			String name1 =scobj.next();
			System.out.println("Enter age");
			int age1 = scobj.nextInt();
			adminrefa.setId(id1);
			adminrefa.setName(name1);
			adminrefa.setAge(age1);
			sref.save(adminrefa);
			System.out.println("values Inserted!");
			tref.commit();
			sref.close();
			sfref.close();
		}
		
		if(uchoice == 2) {
			adminrefa.setId(2);
			adminrefa.setName("Thomas");
			adminrefa.setAge(36);
			sref.update(adminrefa);
			System.out.println("values Updated!");
			tref.commit();
			sref.close();
			sfref.close();
			
		}
		
		if(uchoice == 3) {
			adminrefa.setId(5);
			sref.delete(adminrefa);
			System.out.println("values deleted!");
			tref.commit();
			sref.close();
			sfref.close();
		}
		
		
	}

}

/*
System.out.println("Enter the username:");
String uname = scobj.next(); 
System.out.println("Enter password:");
String pass = scobj.next();
9*/
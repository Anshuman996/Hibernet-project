package com.caps.dev;

import java.util.Scanner;

import com.caps.dev.beans.Person;
import com.caps.dev.model.HibernateImpl;
import com.caps.dev.model.JdbcImpl;
import com.caps.dev.model.PersonDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Enter person details...");
       System.out.println("------------------------");
       Scanner in=new Scanner(System.in);
       Person person=new Person();
       
       System.out.println("Enter the id: ");
       person.setPerId(Integer.parseInt(in.nextLine()));
       
       System.out.println("Enter the name: ");
       person.setName(in.nextLine());
       
       System.out.println("Enter the email: ");
       person.setEmail(in.nextLine());
       
       System.out.println("Enter the age: ");
       person.setAge(Integer.parseInt(in.nextLine()));
       
       System.out.println("Enter the address: ");
       person.setAddress(in.nextLine());
       
       PersonDAO pd=new JdbcImpl();
       //PersonDAO pd=new HibernateImpl();
       pd.create(person);
    }
}
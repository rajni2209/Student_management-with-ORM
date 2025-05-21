package com.spring.orm_project;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm_project.Dao.StudentDao;
import com.spring.orm_project.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm_project/ormconfig.xml");
    	StudentDao studentDao = (StudentDao) context.getBean("studentDao");
    	
    	
    	Scanner sc = new Scanner(System.in);
    	boolean go =  true;
    	
    	while(go) {
    		System.out.println("\n***** Welcome to Student ORM App *****");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student by ID");
            System.out.println("3. Get All Students");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            
            
            System.out.println("Enter the choise: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            
            
            switch (choice) {
            //insert
			case 1:
				System.out.println("Enter student id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the name: ");
				String name = sc.nextLine();
				System.out.println("Enter the department:");
				String dept = sc.nextLine();
				System.out.println("Enter the section ");
				String section = sc.nextLine();
				Student student  = new Student(id,name,dept,section);
				int r = studentDao.insert(student);
				System.out.println("Details_submitted" + r);
			break;
			//read
			case 2:
				System.out.println("Enter student id to fetch: ");
				int sid = sc.nextInt();
				Student s = studentDao.getData(sid);
				System.out.println("sucessfully fetched!  " + s);
			break;
			//readAll	
			case 3:
				System.out.println("All Students:");
                for (Student st : studentDao.getAllData()) {
                    System.out.println(st);
                }
			break;
			//update
			case 4:
				System.out.println("Enter student id to update: ");
				int uid = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new name: ");
				String uname = sc.nextLine();
				System.out.println("Enter new department:");
				String udept = sc.nextLine();
				System.out.println("Enter new section ");
				String usection = sc.nextLine();
				Student updateStudent  = new Student(uid,uname,udept,usection);
				studentDao.update(updateStudent, uid);
				System.out.println("student updated!");
			break;
			//delete
			case 5:
				System.out.println("Enter id to delete: ");
				int did = sc.nextInt();
				studentDao.delete(did);
				System.out.println("student deleted with id "+ did + "!");
			break;
			//exit
			case 6:
				go = false;
			break;

			default:
			System.out.println("Invalid input! please enter correct input");
			break;
			}
            }
    	}
    	
    }

package mypackageday5;

import java.util.*;

class Person{
	
	//instance variables
	private String name;
	private int age;
	
	//accept the values
	public void accept() {
		
		//to accept data from user input
		Scanner sc = new Scanner(System.in);
		
		//accept name and age
		System.out.println("Enter the name: ");
		name=sc.nextLine(); // to handle the full name with space
		
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		
	}
	
	//to check the age and display the age-group name
	public void check() {
		if(age<=30) {
			System.out.println(name+" is a young person ! ");
		}
		else if(age<=50) {
			System.out.println(name+" is a middle aged person !");
		}
		else {
			System.out.println(name+" an old person ! ");
		}
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		//create a person class object
		Person p = new Person();
		
		//accept person data
		p.accept();
		
		//check the age
		p.check();
	}

}

//Complete Section3 Lesson 1 and Lesson2 on LMS portal
//HackerRank try to achieve atleast 3 start by monday
//do all Array and Methods assignments
// www.javatpoint.com
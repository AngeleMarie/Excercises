package cars;

import java.util.*;


public 	class Mymain{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 
			        Employee emp1 = new Employee("Mugisha","Mike","Software Engineer",20,3000);
			        Employee emp2 = new Employee("Mugisha","Marc","Database Adminsitrator",18,2000);
			        Employee emp3 = new Employee("Mugisha","Mike","Software Engineer",20,3000);
			        Employee emp4 = new Employee("Mugisha","Moses","Software Developer",20,3000);
			        Employee emp5 = new Employee("Iradukunda","Mike","Database Administrator",20,3000);
			        Employee emp6 = new Employee("Iradukunda","Gael","Software Engineer",20,3000);
			        
		

			        // Use ArrayList to store students
			        ArrayList<Employee> employeesList = new ArrayList<>();
			        employeesList.add(emp1);
			        employeesList.add(emp2);
			        employeesList.add(emp3);
			        employeesList.add(emp4);
			        employeesList.add(emp5);
			        employeesList.add(emp6);
			        Collections.sort(employeesList);
			        
          TreeSet<Employee> sorts =new TreeSet<> (employeesList);
			        // Sort students based on their age using Collections.sort (Comparable)
//			        Collections.sort(employeesList);

			        // Display the sorted list
			        for (Employee employee : sorts) {
			            System.out.println("Name: " + employee.firstname +" lastname: "+employee.lastname+ ", Age: " + employee.age+" position: "+employee.position+" salary: "+employee.salary+"\n");
			        }
			    }
		
	}



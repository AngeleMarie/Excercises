package cars;

class Employee implements Comparable<Employee>{
	
	protected String lastname;
	protected String firstname; 
	protected String position; 
	protected int age; 
	protected int salary; 


	public Employee(String firstname,String lastname,String position,int age,int salary) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.position=position;
	this.age=age;
	this.salary=salary;
	}
	@Override
	   public int compareTo(Employee otherEmployee) {
		if (this.firstname.compareTo(otherEmployee.firstname)!=0) {
            return this.firstname.compareTo(otherEmployee.firstname);
        }	else if (this.lastname.compareTo(otherEmployee.lastname)!=0) {
            return this.lastname.compareTo(otherEmployee.lastname);
        }   else if (this.position.compareTo(otherEmployee.position)!=0) {
            return this.position.compareTo(otherEmployee.position);
        } else if (this.age-otherEmployee.age!=0) {
            return this.age-otherEmployee.age;
        } else {
            return this.salary-otherEmployee.salary;
        }
    }}

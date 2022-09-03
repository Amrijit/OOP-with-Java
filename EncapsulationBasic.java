
class mathematician {
	
	private int n1;				// let's think this is the impact factor of an employee
	
	mathematician(int n1){
		this.n1=n1;
	}
	
	public void setn1(int num1) {
		n1=num1;
	}
	
}


class developer extends mathematician{
	
	public  String name;					// name of that employee
	
	developer(int n1, String name){
		super(n1);
		this.name = name;
	}
	
	
}


class manager extends developer{
	
	private double salary;				// Salary of that employee
	
	manager(int n1, String name,double salary){
		super(n1,name);
		this.salary=salary;
	}
	
	public void setSalary(double s) {
		salary =s;
	}
}

class employee extends manager{
	
	public int id;								// id name of the employee
	
	employee(int n1, String name, double salary, int id){
		super(n1,name,salary);
		this.id=id;
	}
}



public class Encapsulation {

	public static void main(String[] args) {
		
		employee e= new employee(1 , "Amrijit" , 50000 , 1230);
		
		
		// 	e.n1=2;                this will not work cause type is private
		//	e.salary= 70000;       this will not work cause type is private
		   e.name= "Masud";     // this will work casue type is public
		
		   e.setn1(2);
		   e.setSalary(70000);

	}

}

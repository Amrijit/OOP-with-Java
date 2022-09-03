


 abstract class Calculator1800 {

	int n1,n2;
	
	Calculator1800(int n1, int n2){
		this.n1=n1;
		this.n2=n2;
	}
	
	public int sum() {
		return n1+n2;
	}
	public abstract int sub();
	public abstract int multiplication();

}


abstract class Calculator1900 extends Calculator1800{
	
	int x1,x2;
	
	Calculator1900 (int n1, int n2, int x1, int x2){
		super(n1,n2);
		this.x1=x1;
		this.x2=x2;
	}
	
	public int sub() {
		return x1-x2;
	}
	public abstract int multiplication();
}


class Calculator2022  extends Calculator1900 {
	
	int y1,y2;
	
	Calculator2022(int n1,int n2,int x1, int x2,int y1,int y2){
		super(n1,n2,x1,x2);
		this.y1=y1;
		this.y2=y2;
	}
	
	public int multiplication() {
	
		return y1*y2;
	}
	
}


public class AbstractCalculator {

	public static void main(String[] args) {
		
		Calculator2022 C2022= new Calculator2022(1,2,10,6,2,5);
		System.out.print("addition "+C2022.sum()+ " subtraction "+C2022.sub() +" multiplication "+ C2022.multiplication());
		

	}

}




 class Calculator1880 {

	int n1,n2;
	
	Calculator1880(int n1, int n2){
		this.n1=n1;
		this.n2=n2;
	}
	
	public int sum() {
		return n1+n2;
	}

}


class Calculator1990 extends Calculator1880{
	
	int x1,x2;
	
	Calculator1990 (int n1, int n2, int x1, int x2){
		super(n1,n2);
		this.x1=x1;
		this.x2=x2;
	}
	
	public int sub() {
		return x1-x2;
	}
}


class Calculator2020 extends Calculator1990 {
	
	int y1,y2;
	
	Calculator2020(int n1,int n2,int x1, int x2,int y1,int y2){
		super(n1,n2,x1,x2);
		this.y1=y1;
		this.y2=y2;
	}
	
	public int multiplication() {
	
		return y1*y2;
	}
	
}

class Calculator{
public static void main(String[] args) {
	
	Calculator1880 C1880= new Calculator1880(1,2);
	System.out.print("calculator in 1880 can add 1 and 2 ==>>"+ (C1880.sum()));
	
	System.out.println();
	Calculator1990 C1990= new Calculator1990(1,2,10,4);
	System.out.print("calculator in 1990 can add 1+2 and subtract 10-4  ==>>"+ (C1990.sum()+" and "+ C1990.sub()));
	
	System.out.println();
	Calculator2020 C2020= new Calculator2020(1,2,10,4,2,5);
	System.out.print("calculator in 2020 can add,sum and mul 5 and 6 ==>>"+ (C2020.sum()+ " and "+C2020.sub()+" and "+ C2020.multiplication()));

	
 }
}




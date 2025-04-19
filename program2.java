class SIvariable{
	int Mobile=1;
	int Laptop=1;
	static int TV=1;

	void manasiMethod(){
		System.out.println("Laptop="+ Laptop);
		System.out.println("Mobile="+ Mobile);
		System.out.println("TV="+ TV);
	}
	void vedantMethod(){
		System.out.println("Laptop="+ Laptop);
		System.out.println("Mobile="+ Mobile);
		System.out.println("TV="+ TV);
	}

	public static void main(String[]args){
		SIvariable ob1 = new SIvariable();
		ob1.Laptop=0;
		ob1.Mobile=0;
		ob1.TV=10;
		ob1.manasiMethod();

	        SIvariable ob2 = new SIvariable();
		ob2.vedantMethod();

	}
}
		

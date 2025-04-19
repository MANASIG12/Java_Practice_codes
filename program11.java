class TCS {
	
	static int empcount = 200000;
	int noofproject = 200;

	static void empDetails(){

		System.out.println("TCS emp Details = "+empcount);
	}

	void projectDetails(){

		System.out.println("TCS project Details = "+noofproject);
	}
}

class Wipro {

	static int empcount = 400000;
	int noofproject = 500;

	static void empDetails(){

		System.out.println("Wipro emp Details = "+empcount);
	}

	void projectDetails(){

		System.out.println("Wipro project Details = "+noofproject);
	}
}
class ITcompany {

	public static void main(String[]args){

		TCS pune = new TCS();
		pune.empDetails();
		pune.noofproject = 400;
		pune.projectDetails();

		TCS mumbai = new TCS();
		mumbai.empDetails();
		mumbai.noofproject = 500;
		mumbai.projectDetails();

		Wipro bangluru = new Wipro();
		bangluru.empDetails();
		bangluru.noofproject = 600;
		bangluru.projectDetails();

		Wipro Chennai = new Wipro();
		Chennai.empDetails();
		Chennai.noofproject = 700;
		Chennai.projectDetails();

	}
}

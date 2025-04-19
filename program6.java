class Olympics{
	//static variables
	static float hundredMeterWR = 9.58f;
	static float swimmingMeterWR = 45.00f;

	//instance variable
	int IndiaTotalMedal = 3;
	int UsaTotalMedal = 95;
        int JapanTotalMedal = 50;	

	//instance methods
	void getIndiaMedalDetails(){
		System.out.println("India's Total medal:"+IndiaTotalMedal);
	}
	void getUsaMedalDetails(){
		System.out.println("Usa's Total medal :"+UsaTotalMedal);
	}
	void getJapanMedalDetails(){
		System.out.println("Japan's Total Medal :"+JapanTotalMedal);
	}

	//entry point
	public static void main(String[]args){
		System.out.println("100 meter running :"+hundredMeterWR);
		System.out.println("100 meter swimming :"+swimmingMeterWR);

		Olympics o2024 = new Olympics();

		o2024.getIndiaMedalDetails();
		o2024.getUsaMedalDetails();
		o2024.getJapanMedalDetails();

		System.out.println("Paris Olympics 2024 - closing ceremony 11-aug-2024");
	}

	//static block
	static{
		System.out.println("Paris Olympics 2024 - opening ceremony 27-jul-2024");
	}
}
	

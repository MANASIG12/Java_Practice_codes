class Olympics{
	//static variables
	static int mostboundaries = 1478;
	static int mostsixes = 515;

	//instance variable
	int IndiaTotalwin = 3;
	int PakistanTotalwin = 95;
        int AustraliaTotalMedal = 50;	

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

		System.out.println("T20 WC 2024 - closing ceremony 29-jun-2024");
	}

	//static block
	static{
		System.out.println("T20 WC 2024 - opening ceremony 2-jun-2024");
	}
}


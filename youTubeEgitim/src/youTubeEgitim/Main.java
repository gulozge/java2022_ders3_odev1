package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Custumer custumer = new Custumer();
		custumer.id =1;
		

		
		Company company = new Company();
		company.TaxNumber ="100000";
		company.CompanyName = "arçelik";
		company.id =100;
		
		
		Custumer c1 = new Custumer();
		Custumer c2 = new Person();
		Custumer c3 = new Company();
		
		CustumerManager custumerManager = new CustumerManager(new Custumer(), new MilitaryCreditManager());
		custumerManager.GiveCredit();
		
		
	}

}

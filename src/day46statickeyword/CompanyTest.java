package day46statickeyword;

public class CompanyTest {
	public static void main(String[] args) {
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
		Company c = new Company();
		System.out.println(c.cname);
		c.companyInfo();
		Company.companyInfo();
		
	}

}


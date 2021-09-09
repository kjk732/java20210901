package p19;

public class Q19 {

	
	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.setBalance(10000);
		System.out.println(ac.getBalance());
		
		ac.setBalance(-100);
		System.out.println(ac.getBalance());
		
		ac.setBalance(20000000);
		System.out.println(ac.getBalance());

		ac.setBalance(30000);
		System.out.println(ac.getBalance());
	}
}

package p20;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc= new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			
			int selNum =sc.nextInt();
			
			if (selNum ==1 ) 
				createAccount();
			
			else if (selNum ==2 ) 
				accountList();
			
			else if (selNum ==3 ) 
				deposit();
			
			else if (selNum ==4 ) 
				createAccount();
			
			else if (selNum ==5 ) 
				createAccount();
			
			
			
		}
	}
	
	
	private static void createAccount() {
		
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("입금액: ");
		int balance = sc.nextInt();
		
		
		Account nA = new Account(ano, owner, balance);
		for( int i = 0 ; i < accountArray.length ; i++) {
			if(accountArray[i] == null)
				accountArray[i] = nA;
			System.out.println("계좌가 생성되었습니다.");
			break;
			
		}
		
	}
	
	private static void accountList() {
		System.out.println("[계좌 목록 확인]");
		for( int i = 0 ; i < accountArray.length ; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.print("계좌번호: " +account.getAno());
				System.out.print("  계좌주: " + account.getOwner());
				System.out.print("  입금액: " + account.getBalance());
				System.out.println();
			}
		}
		
	}
	private static void deposit() {
		System.out.println("[돈넣고 돈넣기]");
		
		System.out.print("넣으실 돈 : ");
		int money = sc.nextInt();
		System.out.print("본인이름 : ");
		Account account = findAccount(sc.next());
		if(account == null) {
			System.out.println("입력하신 계좌가 없는데요..?");
			return;
		}
		account.setBalance(account.getBalance() + money);
		
	}
	
	private static void withdraw() {
		
		
	}
	private static Account findAccount(String ano) {
		for( int i = 0 ; i < accountArray.length ; i++) {
			Account account = accountArray[i];
			if(accountArray[i]!=null) {
				if(account.getAno().equals(ano)) {
					return account;
				}
			}
		}return null;
	}
	
	
	
	
	
	
	
}

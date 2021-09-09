package Bank.quiz;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택> ");
			
			
			int selectNo = sc.nextInt();
			
			
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			
			case 5:
				run = false;
				break;

			default:
				System.out.println("1~5숫자를 눌러주세요 이상한거 누르지말고;");
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다 ㅃ2");
	
	}
	
	private static void createAccount() {
		
		
		
		System.out.println("------------------");
		System.out.println("[계좌 생성!!!!]");
		System.out.println("------------------");
		
		System.out.print("계좌 번호: ");
		String AccNum = sc.next();
		
		System.out.print("계좌주: ");
		String AccOwn = sc.next();
		
		System.out.print("초기 입금액: ");
		int BeginMoney = sc.nextInt();
		
		Account account = new Account(AccNum, AccOwn, BeginMoney);
		for( int i =0; i < accountArray.length ; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("계좌를 생성했어요!");
				break;
			}
		}
		
		
	}
	
	private static void accountList() {
		
		System.out.println("------------------");
		System.out.println("[계좌 확인!!!!]");
		System.out.println("------------------");
		
		for( int i = 0 ; i <accountArray.length ; i++) {
			Account account = accountArray[i];
			if(accountArray[i] == null)
				break;
			else{
				System.out.print(account.getAccNum());
				System.out.print("   ");
				System.out.print(account.getAccOwn());
				System.out.print("   ");
				System.out.print(account.getBeginMoney());
				System.out.println();
			}
		}
	}
	
	private static void deposit() {
		System.out.println("-------------------");
		System.out.println("[돈넣고 돈먹기~!]");
		System.out.println("------------------");
		System.out.print("계좌번호 : ");
		String findAccNum = sc.next();
		System.out.print("넣을 돈 : ");
		int plusMoney = sc.nextInt();
		Account acc = findAccount(findAccNum);
		if(acc == null) {
			System.out.println("계좌가 없는데요~?");
			return;
		}
		acc.setBeginMoney(acc.getBeginMoney() + plusMoney);
		System.out.println("돈넣기 성공!!! ㅋㅋ");
		System.out.println("현재 흑우력 : " + acc.getBeginMoney());
	}
	
	private static void withdraw() {
		System.out.println("-------------------");
		System.out.println("[현생 살러가기~!]");
		System.out.println("------------------");
		System.out.print("계좌번호 : ");
		String findAccNum = sc.next();
		System.out.print("찾을 돈 : ");
		int minusMoney = sc.nextInt();
		Account acc = findAccount(findAccNum);
		if(acc == null) {
			System.out.println("계좌가 없는데요~?");
			return;
		}
		acc.setBeginMoney(acc.getBeginMoney() - minusMoney);
		System.out.println("흑우탈출!!! ㅜㅜ");
		System.out.println("현재 흑우력 : " + acc.getBeginMoney());
	}
	private static Account findAccount(String ano) {
		
		for(int i = 0 ; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account.getAccNum().equals(ano))
				return account;
		}
		return null;
	}
	
}

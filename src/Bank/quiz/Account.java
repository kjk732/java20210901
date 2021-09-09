package Bank.quiz;

public class Account {

	private String AccNum; // 계좌번호
	private String AccOwn; // 계좌주
	private int BeginMoney; // 초기금액
	
	public Account(String accNum, String accOwn, int beginMoney) {
		super();
		AccNum = accNum;
		AccOwn = accOwn;
		BeginMoney = beginMoney;
	}

	public String getAccNum() {
		return AccNum;
	}

	public void setAccNum(String accNum) {
		AccNum = accNum;
	}

	public String getAccOwn() {
		return AccOwn;
	}

	public void setAccOwn(String accOwn) {
		AccOwn = accOwn;
	}

	public int getBeginMoney() {
		return BeginMoney;
	}

	public void setBeginMoney(int beginMoney) {
		BeginMoney = beginMoney;
	}
	
	
}

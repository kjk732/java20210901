package p11api.p01textbook;

public class Member {

	private String id;
	private String name;
	
	public Member(String id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
	
		return this.id + ": " + this.name;
	}
}

package p11api.p02quiz;

public class Ex02IndexOf {
	public static void main(String[] args) {

		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		String s = "공장";
		
		int i = 0 - str.indexOf(s);

		while(true) {
			
			i = str.indexOf(s, i + s.length());
			
			if(i < 0)
			break;
			
			System.out.println(i);
		}
		
		
		}

	}



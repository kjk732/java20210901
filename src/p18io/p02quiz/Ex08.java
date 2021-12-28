package p18io.p02quiz;

import java.io.FileReader;

public class Ex08 {

		public String split(int num) throws Exception{
			String name = "C:\\Users\\kjk73\\OneDrive\\바탕 화면\\iotest\\test4.txt";
			FileReader fr = new FileReader(name);
			char[] datas =new char[num];
			
			int cnt = 0;
			String a ="";
			
			while((cnt = fr.read(datas)) != -1) {
				
				for(int i = 0 ; i <cnt ; i++) {
					
					a += datas[i];
				}
				a += ",";
			}
			
			fr.close();
			
			
			return a.substring(0, a.length()-1);
		}
}

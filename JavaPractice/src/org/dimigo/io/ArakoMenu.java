package org.dimigo.io;

import java.io.*;

public class ArakoMenu {
	public static void main(String[] args) {
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter wr= new BufferedWriter(new FileWriter("files\\menu.txt"));
			String str;
			while((str=br.readLine())!=null){
				wr.write(str);
				wr.newLine();
				wr.flush();
			}
			wr.close();
			BufferedReader rd= new BufferedReader(new FileReader("files\\menu.txt"));
			System.out.println("<< 메뉴 출력 >>");
			while((str=rd.readLine())!=null){
				System.out.println(str);
			}
			rd.close();
			
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo4.java");

			br = new BufferedReader(fr);// 보통 readLine()메소드를 활용하기 위하여 BufferedReader를 사용
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);//뒤의 인자가 true이면 auto flush 가능.
											//이로써, bw.write(),bw.newLine(), bw.flush()사용안해도됨.
			
			String readLine = null;	// br.readLine() : 개행을 뺀 한줄을 읽는다.
			while ((readLine = br.readLine()) != null) {
				pw.println(readLine);
				//bw.write(readLine);
				//bw.newLine(); // 개행을 다시 넣어주어 출력한다.
			}
			//bw.flush();// Buffered를 했을때는 배열이 다 차지 않아도 출력할 수 있는 flush를 호출!

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				if(pw != null)pw.close();
			try {
				if (fr != null) fr.close();
				if (fw != null)	fw.close();
				if (br != null) br.close();
				if (bw != null)	bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

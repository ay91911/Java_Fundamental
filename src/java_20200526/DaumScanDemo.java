package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.daum.net/");
		InputStream in = url.openStream();
		//1바이트->2바이트로 바꿈
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		
		//파일, 모니터로 출력하고픔.
		FileWriter fw = new FileWriter("c:\\dev\\daum.html");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw,true);
		
		while((readLine = br.readLine())!= null) {
			System.out.println(readLine);
			pw.println(readLine);
			//bw.write(readLine);
			//bw.newLine();
		}
		//bw.flush();
	}
}

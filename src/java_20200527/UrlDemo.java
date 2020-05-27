package java_20200527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://item.gmarket.co.kr/Item?goodscode=1803177701&ver=637261973341968890");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort(); //없으면 -1나옴 
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol: "+protocol);
		System.out.println("host: "+host);
		System.out.println("port: "+port);
		System.out.println("path: "+path);
		System.out.println("query: "+query);
		System.out.println("reference: "+reference);
		
		
		
		
		
		InputStream in = url.openStream();//html 정보가 "in"인풋스트림에 들어가있음.
		InputStreamReader isr = new InputStreamReader(in);//문자형태인 html을 가져올땐 2byte형식으로 가져오는 것이 더 효율적이어서 InputStreamReader로 전환
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		
		
		

	}

}

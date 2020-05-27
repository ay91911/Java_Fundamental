package java_20200527;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) {
		//bonus!!
		//문자열"6,909.45"을 더블값6909.45로 바꾸기 위한 방법
		String test = "6,909.45".replace(",","");
		double d = Double.parseDouble(test);
		System.out.println(d);//6909.45
		
		//더블값6909.45를 문자열"6,909.45"로 바꾸기 위한 방법
		String test1 = String.format("%,.2f", d);
		System.out.println(test1);//6,909.45
		
		
		FileWriter fw = null;
		
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20200101&end=20200527";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\coin.txt");
			
			System.out.println("성공");
			
			Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");
			
			System.out.println("날짜\t\t시가\t\t고가\t\t저가\t\t종가\t\t거래량\t\t총량");
			
			fw.write("날짜\t\t시가\t고가\t저가\t종가\t거래량\t\t총량\n");
			
			/*
			for(int i=0; i<trElements.size();i++) {
				Element trElement = trElements.get(i);
				
				Elements tdElements = trElement.select("td");
				for(int j=0; j<tdElements.size();j++) {
					Element tdElement = tdElements.get(j);
					System.out.print(tdElement.text()+"\t");
				}
				System.out.println();
			}*/
			
			for(int i=0; i<trElements.size();i++) {
				Element trElement = trElements.get(i);
				String date = trElement.child(0).text();
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String marketCap = trElement.child(6).text();
				System.out.println(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap);
				
					fw.write(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap+"\n");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		

		
	
	}

}

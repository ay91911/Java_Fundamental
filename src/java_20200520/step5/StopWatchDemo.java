package java_20200520.step5;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class StopWatchDemo {
	
	public static void run(StopWatch s1) {
		s1.execute();
	}
	
	public static void main(String[] args) throws Exception {
		//StopNanoWatch s1 = new StopNanoWatch();
		//StopMilliWatch s1 = new StopMilliWatch();
		//StopMicroWatch s1 = new StopMicroWatch();
		//run(s1);
		
		//Java IO 하는 방법(line 21 - 23)
		BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundamental\\src\\java_20200520\\step5\\class.txt"));
		
		String readLine = br.readLine();
		
		//Java Reflection 하는 방법(line 26 - 28)
		Class clazz = Class.forName(readLine);
		StopWatch s = (StopWatch)clazz.newInstance();
		run(s);
	}
}

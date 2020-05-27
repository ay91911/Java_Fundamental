package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		//1byte로 일고 출력할땐, FileInputStream, FileOutputStream
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis= new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");//소스(바이너리 파일)
			fos = new FileOutputStream("c:\\dev\\jdk.exe");//destination
			
			int readByte = 0;
			//fis.read() : 한바이트씩 읽어 반환한다. 더이상 읽을 바이트가 없으면 -1을 반환한다.
			while((readByte = fis.read()) != -1) {
				//fos.write(~): 한 바이트씩 쓰기
				fos.write(readByte);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		
				try {if(fis != null) fis.close();
					if(fos != null) fos.close();	
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}

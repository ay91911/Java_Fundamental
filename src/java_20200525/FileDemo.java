package java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
		//File 클래스
		//1. 디렉토리 생성(v)
		//2. 파일크기(v), 파일이름, 파일경로, 마지막 수정날짜
		//3. 파일 생성, 삭제(v)
		//4. 파일 이름 바꾸기(v)
		File f1 = new File("c:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if(success) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 해당 디렉토리가 있습니다.");
		}
		
		File f2 =  new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length()/1024;//KB로 나타내기 위해
		System.out.println(fileSize+"KB");
		
		String fileName = f2.getName();
		System.out.println(fileName);
		
		String path = f2.getPath();
		System.out.println(path);
		
		if(fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		}else if(fileName.endsWith("pdf")){
			System.out.println("pdf 파일");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}
		
		//1970년 1월 1일 부터 마지막 수정한 날짜까지의 시간을 밀리세컨드로 반환
		//1589168363341

		long lastModified = f2.lastModified();
		System.out.println(lastModified);
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		File f3 = new File("c:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//f3.delete;
		
		File f4 = new File("c:\\dev\\HelloWorld.java");
		f3.renameTo(f4);
	}

}

package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		//ctrl+shift+o => import빼는 법
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\dev\\jdk2.exe");

			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8];// 8KB크기

			// fis.read(readBytes) : FileInputStream에 8192 바이트(8KB)를 읽어서 readBytes에 저장하고 읽은
			// 바이트 수를 반환한다.
			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

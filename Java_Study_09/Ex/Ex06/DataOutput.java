package Java_Study_09.Ex.Ex06;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutput {
    	public static void main(String[] args) throws Exception {
		
		// 1. 내보낼 파일 위치 지정 + 2. 주스트림 준비
		FileOutputStream fos = new FileOutputStream("C:/img/temp/data.dat", true); // 확장자가 반드시 dat 여야 한다.
		
		// 3. 보조스트림준비
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
				
		// 4. 데이터 쓰기
		dos.writeUTF("김지훈");
		dos.writeInt(500);
		dos.writeBoolean(true);
		System.out.println("저장완료");
		// 5. 비우기
		dos.flush();
		// 6. 자원 반납
		dos.close();

	}
}

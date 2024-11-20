package Java_Study_09.Ex.Ex10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		// C:\\img\\temp\\img.gif를 C:\\img\\temp2\\img.gif로 복사하기
		
		// 1. 주 스트림 + 파일위치 지정(인/아웃) => 위치지정
		Path src = Paths.get("C:\\img\\temp\\img.gif");
		Path dst = Paths.get("C:\\img\\temp2\\img.gif");
		
		// 2. 보조 스트림 준비(인/아웃) => 사용안함
		
		// 3. 읽기 -> 읽은 내용쓰기
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
		/* REPLACE EXISTING : 이미 파일이 있으면 덮어쓴다. (만약, 이 옵션이 없으면 이미 파일이 있을경우 Exception 발생한다.)
		 * COPY ATTRIBUTES : 파일의 속성까지도 복사한다. (권한, 읽기전용 등...) 
		 */
		
		System.out.println("복사완료");
		// 4. flush 및 자원반납 => 사용안함.			
	}
}
package Java_Study_09.Ex.Ex09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExam {

    public static void main(String[] args) throws IOException {
        // Path 객체를 사용하여 파일의 경로를 표현하고, 파일 정보를 다룬다.
        // Paths 클래스와 함께 자주 사용됨
        Path path = Paths.get("C:\\img\\temp\\test.txt"); // 파일 경로 설정
        
        // 1. 디렉토리 여부 확인
        System.out.println("디렉토리 여부 : " + Files.isDirectory(path)); // 경로가 디렉토리인지 확인
        
        // 2. 마지막 수정 시간 가져오기
        System.out.println("마지막 수정시간 : " + Files.getLastModifiedTime(path)); // 파일의 마지막 수정 시간 출력
        
        // 3. 파일 크기 가져오기
        System.out.println("파일 크기 : " + Files.size(path)); // 파일의 크기를 바이트 단위로 출력
        
        // 4. 파일 소유자 정보 가져오기
        System.out.println("소유자 : " + Files.getOwner(path)); // 파일의 소유자 정보 출력
        
        // 5. 숨긴 파일 여부 확인
        System.out.println("숨긴파일 여부 : " + Files.isHidden(path)); // 파일이 숨김 파일인지 확인
    }
}

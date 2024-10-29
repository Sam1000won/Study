package Java_Study_09.Ex.Ex01;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        // 폴더 만들기
        // "C:/img/temp" 경로의 File 객체 생성
        File dir = new File("C:/img/temp");
        
        // 해당 폴더가 존재하지 않는 경우
        if (!dir.exists()) {
            System.out.println("폴더가 존재하지 않아 생성 합니다."); // 폴더 생성 메시지 출력
            dir.mkdirs(); // 필요한 모든 디렉토리를 생성
        }
        
        // 파일 만들기
        // "C:/img/temp/test.txt" 경로의 File 객체 생성
        File file = new File("C:/img/temp/test.txt"); // 파일 경로 + 이름
        // 해당 파일이 존재하지 않는 경우
        if (!file.exists()) {
            System.out.println("해당 파일이 없어서 생성"); // 파일 생성 메시지 출력
            file.createNewFile(); // 새로운 파일 생성
        }
        
        // 특정 폴더 정보 알아내기
        // "C:/" 경로의 File 객체 생성
        dir = new File("C:/");
        
        // 특정 폴더 내의 파일명 추출(이름만)
        // dir.list()를 통해 해당 경로의 파일 및 디렉토리 이름 목록을 가져옴
        String[] fileNames = dir.list();
        // 파일 및 디렉토리 이름을 출력
        for (String name : fileNames) {
            System.out.println(name); // 각 이름 출력
        }
        
        // 파일 정보 전체 추출
        // dir.listFiles()를 통해 해당 경로의 File 객체 배열을 가져옴
        File[] files = dir.listFiles();
        String gubun; // 디렉토리 또는 파일 구분을 위한 변수
        
        // 각 File 객체에 대해 반복
        for (File f : files) {
            // 현재 File 객체가 디렉토리인지 파일인지 확인
            if(f.isDirectory()) {
                gubun = "[디렉토리]"; // 디렉토리인 경우 메시지 설정
            } else {
                gubun = "[파일]"; // 파일인 경우 메시지 설정
            }
            // 파일/디렉토리의 이름과 크기(바이트 단위) 출력
            System.out.println(gubun + " " + f.getName() + " / " + f.length() + " byte");			
        }
    }
}

package Java_Study_09.Ex.Ex09;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/* 3. 파일 시스템 특화 클래스 */
public class FileSystemExam {

    public static void main(String[] args) throws IOException {
        
        // 1. 기본 파일 시스템 가져오기
        FileSystem fs = FileSystems.getDefault();
        
        // 2. 파일 스토어 목록 가져오기
        // 시스템에 연결된 파일 저장소(드라이브 등)의 정보를 가져옵니다.
        Iterable<FileStore> infoList = fs.getFileStores();
        
        // 3. 각 파일 스토어에 대한 정보 출력
        for (FileStore info : infoList) {
            System.out.println("드라이브 이름 : " + info.name()); // 드라이브 이름 출력
            System.out.println("NTFS/FAT32 : " + info.type()); // 파일 시스템 타입 출력
            System.out.println("전체공간 : " + (info.getTotalSpace() / 1024 / 1024 / 1024) + " GB"); // 전체 공간 출력 (GB 단위)
            System.out.println("사용가능 공간 : " + (info.getUsableSpace() / 1024 / 1024 / 1024) + " GB"); // 사용 가능한 공간 출력 (GB 단위)
            System.out.println("==============================");
        }
    }
}

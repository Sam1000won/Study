package Java_Study_09.Ex.Ex10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MakeDir {
	
	// 1. 디렉토리 및 파일생성
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\img\\temp2");
		
		if (Files.notExists(path)) {
			System.out.println("폴더 없음");
			Files.createDirectory(path);
		}
		
		Path file = Paths.get("C:\\img\\temp2\\textFile.txt");
		if (Files.notExists(file)) {
			System.out.println("파일 없음");
			Files.createFile(file);
		}
	}

}
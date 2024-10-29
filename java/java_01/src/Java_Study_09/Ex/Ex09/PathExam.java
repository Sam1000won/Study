package Java_Study_09.Ex.Ex09;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExam {
	
	/* 1. 경로 특화 클래스 Path	*/
	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\img\\img.gif");
		System.out.println("특정 경로의 파일이름 : " + path.getFileName());
		System.out.println("부모 폴더 : " + path.getParent().getFileName());
		System.out.println("루트 : " + path.getRoot());
		
		
	}
	
}
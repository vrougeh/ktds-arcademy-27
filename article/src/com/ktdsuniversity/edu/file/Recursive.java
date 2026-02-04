package com.ktdsuniversity.edu.file;

import java.io.File;

public class Recursive {
	
	public void deleteDiretory(File target) {
		if(target.isFile()) {
			target.delete();
		}else if(target.isDirectory()) {
			//폴더 내부의 목록을 조회
			File[] children = target.listFiles();
			for(File child : children) {
				this.deleteDiretory(child);
			}
			System.out.println(target.getAbsolutePath());
		}
	}
	
	
	public void printFiles(File target) {
		if(target.isFile()) {
			System.out.println(target.getAbsolutePath());
		}else if(target.isDirectory()) {
			//폴더 내부의 목록을 조회
			File[] children = target.listFiles();
			for(File child : children) {
				this.printFiles(child);
//				System.out.println(child.getAbsolutePath());
			}
		}
	}
	
	public void printNumber(int number) {
		System.out.println(number);
		if(number > 0) {
			printNumber(number-1);
		}
	}
	
	public void print(int number) {
		System.out.println("출력합니다. - " + number);
		if(number < 3) {
			print(number+1);
			System.out.println(number + "스택 실행을 완료했습니다.");
		}
	}
	
	public int sumToZero(int start) {
		if(start == 1) {
			return 1;
		}
		return start + sumToZero(start-1);
		
	}
	
	
	public static void main(String[] args) {
		Recursive r = new Recursive();
//		r.print(1);
//		r.printNumber(2000);
//		int result = r.sumToZero(5);
//		System.out.println(result);
//		
//		File root = new File("C:\\DevPrograms");
//		r.printFiles(root);
		
		File root = new File("C:\\Users\\211-17\\Documents\\삭제대상");
		r.deleteDiretory(root);
	}

}
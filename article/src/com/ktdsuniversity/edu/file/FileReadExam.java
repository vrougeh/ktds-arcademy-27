package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileReadExam {
	
	
	
	/*
	 * NIO
	 * Java version >= 1.8
	 */
	public static void readAndPrintFileDescriptionUseNIO(String parentPath,String file) {
		//1. 읽으려는 파일 특정
		File target = new File(parentPath,file);
		
		//2. 파일의 내용을 읽는다
		//3. 파일의 내용을 List에 할당한다
		try {
			List<String> lines = Files.readAllLines(target.toPath()); // 메모리 많이 먹음
			//4. 파일의 내용을 출력한다.
			for(String line : lines) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * IO
	 * Java version < 1.8
	 */
	public static void readAndPrintFileDescriptionUseIO(String parentPath,String file) {
		
		//1.읽으려는 파일 특정
		File target = new File(parentPath,file);
		//2.파일이 존재하는지 확인
		//3.읽으려는 대상이 진짜 파일이 맞는지 확인
		if(target.exists() && target.isFile()) {
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			//4.파일의 내용을 읽기 시작
			try {
				//4-1 파일의 바이트를 Chunking해서 가져온다
				fileReader = new FileReader(target);
				//4-2 파일의 내용을 String으로 변환한다
				bufferedReader = new BufferedReader(fileReader);  //trycatch - IOException
				
				String line = null;
				while(true) {
					line = bufferedReader.readLine();  //trycatch - IOException
					//EOF가지 갔느냐
					if (line == null) {
						break;
					}
					else {
						//4-3 내용을 출력한다.
						System.out.println(line);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException e) {}
				}
				
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {}
				}
			}
			
		}
		
	}
	
	
	
public static void readAndPrintFileDescriptionUseIOAutoClose(String parentPath,String file) {
		
		//1.읽으려는 파일 특정
		File target = new File(parentPath,file);
		//2.파일이 존재하는지 확인
		//3.읽으려는 대상이 진짜 파일이 맞는지 확인
		if(target.exists() && target.isFile()) {
			
			try(FileReader fileReader = new FileReader(target)){
				try(BufferedReader bufferedReader = new BufferedReader(fileReader);){
					String line = null;
					while(true) {
						line = bufferedReader.readLine();  //trycatch - IOException
						//EOF가지 갔느냐
						if (line == null) {
							break;
						}
						else {
							//4-3 내용을 출력한다.
							System.out.println(line);
						}
					}
				}
			} catch(IOException e ) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		//운영체제 정보 취득
		Properties props = System.getProperties();
		String homePath = props.get("user.home").toString();
		System.out.println(homePath);
		
//		System.out.println(props);
//		System.out.println(props.get("user.home"));
//		
//		System.out.println();
//		
//		Map<String,String> env = System.getenv();
//		System.out.println(env);
//		System.out.println(env.get("HOME"));
		
		//os 별로 다름
		System.out.println(File.separator);
		
		//C:\Java Exam 폴더의 정보를 추출
		File directory = new File(homePath + File.separator +"Java Exam");
		//1. 폴더의 이름 출력
		String dirName = directory.getName();
		System.out.println(dirName);
		
		//2. 이 경로가 가리키는 것이 파일인지 폴더인지를 구문.
		boolean isFile = directory.isFile();
		//isFile의 값이 true면 파일이다. false면 파일이 아니다
		System.out.println(isFile);
		
		boolean isDirectory = directory.isDirectory();
		//isDirectory 값이 true면 파일이다. false면 파일이 아니다
		System.out.println(isDirectory);
		
		//3. 이 경로가 실제하는 존재하는 것인지
		boolean exists = directory.exists();
		//exists 값이 true면 존재하는 폴더 false면 존재하지 않는 폴더
		System.out.println(exists);
		
		//4. 이 경로의 크기(폴더의 크기) 출력.
		long bytes = directory.length();
		System.out.println(bytes + " byte");
		
		//C:\Java Exam\Java Exam.txt 파일의 정보를 추출
		File textFile = new File(homePath + File.separator + "Java Exam", "Java Exam.txt");
		//1. 파일의 이름을 출력
		String textName = textFile.getName();
		System.out.println(textName);
		//2. 파일이 폴더인지 파일인지 구분해서 출력
		isFile = textFile.isFile();
		System.out.println(isFile);
		isDirectory = textFile.isDirectory();
		System.out.println(isDirectory);
		//3. 이 파일이 실제 존재하는 것인지 출력
		exists = textFile.exists();
		System.out.println(exists);
		//4. 파일의 크기를 출력
		bytes = textFile.length();
		System.out.println(bytes + " byte");
		//5. 이 파일이 있는 부모의 경로를 출력한다
		//첫번째 방법
		String parentPath = textFile.getParent();
		System.out.println(parentPath);
		//두번째 방법
		File parentFile = textFile.getParentFile();
		System.out.println(parentFile);
		
		//6. 이 파일의 경로를 출력한다
		//첫번째 방법
		String textFilePath = textFile.getAbsolutePath();
		System.out.println(textFilePath);
		//두번째 방법
		File textFileFile = textFile.getAbsoluteFile();
		System.out.println(textFileFile);
		
		
		
		readAndPrintFileDescriptionUseNIO(homePath + File.separator + "Java Exam" , "Java Exam.txt");
		
		readAndPrintFileDescriptionUseIO(homePath + File.separator + "Java Exam" , "Java Exam.txt");
		
		readAndPrintFileDescriptionUseIOAutoClose(homePath + File.separator + "Java Exam" , "Java Exam.txt");
	}
}

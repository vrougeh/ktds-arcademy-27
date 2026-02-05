package com.ktdsuniversity.edu.fp.basic.convert;

public class Test {
	
	public static void main(String[] args) {
		Converter converter = new Converter();
		
		converter.printConverterResult2("123456", str -> Integer.parseInt(str) );
		converter.printConverterResult2("46789", Integer::parseInt);
		
		
		converter.printConverterResult2("asdf", str -> str.length());
		
		converter.printConverterResult2("asdf", String::length);
	}
	
}
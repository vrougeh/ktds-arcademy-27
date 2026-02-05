package com.ktdsuniversity.edu.fp.basic.convert;

import java.util.function.Function;

public class Converter {
	
	public void  printConverterResult(String str, Changer changer) {
		int result =changer.changeToInt(str);
		System.out.println(result);
	}
	
	
	public void printConverterResult2(String str , Function<String,Integer> function) {
		int result = function.apply(str);
		System.out.println(result);
	}

}
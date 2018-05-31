package com.akshaya.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamDemoFmFileMain {

	public static void main(String[] args) {		
		String fileName = "D:/7_POC_WorkSpace/J2EE_WorkSpace/CoreJavaDemo/src/com/akshaya/java8/stream/Employee.txt";
		// Reading file into stream inside try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
		    stream.forEach(System.out::println);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}

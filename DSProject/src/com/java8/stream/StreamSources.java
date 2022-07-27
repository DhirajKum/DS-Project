package com.java8.stream;

import java.util.stream.Stream;

public class StreamSources {

	
	public static Stream<String> stringStream(){
		
		return Stream.of("one","two","three","four","five");
	}
	
	public static Stream<Integer> intStream(){
		return Stream.iterate(0, i -> i+2).limit(10);
	}
	
	public static Stream<User> userStream(){
		
		return Stream.of(new User(1,"Abc","Delhi"),new User(2,"def","Delhi NCR"),new User(3,"ghi","Gurugram"),new User(4,"jkl","Noida"));
		
	}
}

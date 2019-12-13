package by.smirnov.loops.task3.controller;

public class Runner {
	
	private static final int NUMBER = 3;
	
	private static final int MAX_NUMBER = 9;
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= MAX_NUMBER; i++) {
			System.out.println(NUMBER + " X " + i 
							+ " = " + (NUMBER * i));
		}
	}
}


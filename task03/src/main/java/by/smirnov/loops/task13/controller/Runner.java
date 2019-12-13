package by.smirnov.loops.task13.controller;

import static java.lang.Math.pow;
public class Runner {
	
	private static final double MIN_NUMBER = -5.0;
	
	private static final double MAX_NUMBER = 5.0;
	
	private static final double STEP_SIZE = 0.5;
	
	private static final String FUNCTION_VIEW = "Function is y=5-x^2/2";
	
	public static void main(String[] args) {
		double y;
		
		for(double step = MIN_NUMBER; step <= MAX_NUMBER; 
				   step += STEP_SIZE) {
			y = 5 - (pow(step, 2) / 2);  
			System.out.println(FUNCTION_VIEW + " x= " + step
					+ " y= " + y );
		}
	}
}

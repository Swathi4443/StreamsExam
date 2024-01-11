package com.cnts.employee;

public class PatternProblems {
	
	public void boxPattern(int rows) {
		for(int value=1;value<=rows;value++) {
			for(int value1=1;value1<=rows;value1++) {
				if(value==1||value==rows||value1==1||value1==rows) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();     
		}
	}
	
	public void diamondPattern(int rows) {
		for(int value=1;value<=rows;value++) {
			for(int value1=1;value1<=rows-value;value1++) {
				System.out.print(" ");
				
			}
			for(int value1=1;value1<=value;value1++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}for(int value2=rows-1;value2>=1;value2--) {
			for(int value1=1;value1<=rows-value2;value1++) {
				System.out.print(" ");
				
			}
			for(int value1=1;value1<=value2;value1++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
	
			
			
			
		}
	}



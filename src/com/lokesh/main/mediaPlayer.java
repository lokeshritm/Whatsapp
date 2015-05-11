package com.lokesh.main;



public class mediaPlayer
{
	public static void main(String[] args) {
		int a=9,b=0;
		try{
			int c=a/b;
			System.out.print(c);
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
}
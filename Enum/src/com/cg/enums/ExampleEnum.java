package com.cg.enums;

public class ExampleEnum {
	public enum Season{
		WINTER,SPRING,SUMMER,AUTUM
	}
	public static void main(String[] args) {
		for(Season s: Season.values()) {
			System.out.println(s);
			System.out.println("The value of autum is:" +Season.valueOf("AUTUM"));
			System.out.println("The value of winter is:" +Season.valueOf("WINTER").ordinal() );
			System.out.println("The value of summer is:" +Season.valueOf("SUMMER") .ordinal() );
			
		}
		// TODO Auto-generated method stub

	}

}

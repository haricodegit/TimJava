package com.udemy.tim;

public class primitiveDataTypes {
	public static void main(String[] args) {
		/*8 primitive datatypes are as follow
		 * boolean,int,float,char,double,byte,long,short*/
		int myValue = 10000;
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Interger Minimum Value: "+myMinIntValue);
		System.out.println("Interger Maximum Value: "+myMaxIntValue);
		//Overflow
		System.out.println("Busted Integer Max Value: "+ (myMaxIntValue + 1));
		//Underflow
		System.out.println("Busted Integer Min Value: "+ (myMinIntValue - 1));
		
		//int myMaxIntTest = 2147483648;
		//System.out.println(myMaxIntTest);
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value: "+myMinByteValue);
		System.out.println("Byte Maximum Value: "+myMaxByteValue);
		
		Short myMinShortValue = Short.MIN_VALUE;
		Short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value: "+myMinShortValue);
		System.out.println("Short Maximum Value: "+myMaxShortValue);
		
		long myLongValue = 100;
		System.out.println("My long Value: " +myLongValue);
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value: "+myMinLongValue);
		System.out.println("Long Maximum Value: "+myMaxLongValue);
		
		long bigLongLiteralValue = 2147483647234L;
		System.out.println(bigLongLiteralValue);
		
		short bigShort = 32767;
		System.out.println(bigShort);
	}
}
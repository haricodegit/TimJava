package com.udemy.tim;

public class MegaBytesAndKiloBytes {
	public static void printMegaByteAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int megabytes = (kiloBytes / 1024);
			int remainingkiloBytes = (kiloBytes % 1024);
			System.out.println(+kiloBytes+" KB = " +megabytes+ " MB and "+remainingkiloBytes+ " KB");
		}
	}
}
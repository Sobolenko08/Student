package edu.examples.student.util;

public class GenerateId {
	private static int idCounter = 0;

	public static synchronized int generate() {
		return idCounter++;
	}
}
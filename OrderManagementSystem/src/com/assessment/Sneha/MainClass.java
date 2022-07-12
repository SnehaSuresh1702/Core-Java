package com.assessment.Sneha;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		try {
			OrderReader.readOrders();
			
			HomePage.display();
		
			OrderWriter.writeOrders();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


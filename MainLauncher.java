package com.shootSkill.DockerJavaApp;

import java.util.Scanner;

public class MainLauncher {

	public static int displayMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****************  Please choose the operation you want to execute *****************");
		System.out.println("1 - Addition ");
		System.out.println("2 - Multiplication ");
		return scanner.nextInt();
	}
	
	public static void execution(int a, int b, int opt) {
		while(true) {
			if(opt == 1) {
				int res = Operation.addition(a, b);
				System.out.println("The result is "+res);
				exitApp();

			}else if(opt ==2) {
				int res = Operation.multiplication(a, b);
				System.out.println("The result is "+res);
				exitApp();
			}else {
				System.out.println("*****************  You didn't choose the correct suggestion please try again *****************");
				opt = displayMenu();
			}
		}
	}
		

	public static void exitApp() {
		try {
			Thread.sleep(4000);
			System.out.println("*****************  Programe exit *****************");
			System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("***************** Hello This application is executed by Docker *****************");
		System.out.println("*****************  What is your name *****************");
		String username = scanner.nextLine();
		System.out.println("Welcome "+username);
		System.out.println("*****************  Please enter the first number *****************");
		int a = scanner.nextInt();
		System.out.println("*****************  Please enter the second number *****************");
		int b = scanner.nextInt();
		int opt = displayMenu();

		execution(a, b, opt);
		


	}

}

package Homework;

import java.util.Scanner;

public class restaurant {

	static Scanner input = new Scanner(System.in);
	static int calculate(int price , int quant){
		int t = price * quant ;
		return t ;
	}
	static public int quant (){ 
		int quant;
		System.out.print("Enter Quantity: ");
		quant = input.nextInt();
		return quant;
	}
	static public void totalTable() {}
	public static void main(String[] args) {
		int choice, quant1 = 0, quant2 = 0, quant3 = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0;
		System.out.printf("---------- Welcome to SKE Restaurant ----------");
		System.out.printf("\n1.) Pizza\t%5d\tBaht.", 250);
		System.out.printf("\n2.) Chickens\t%5d\tBaht.", 120);
		System.out.printf("\n3.) Coke\t%4d\tBaht.", 45);
		System.out.printf("\n4.) Total");
		System.out.printf("\n5.) Exit");
		System.out.println();

		while (true) {
			System.out.printf("\nEnter your Choice: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				t1 = calculate(250,quant());
				break;
			case 2:
				t2 = calculate(120,quant());
				break;
			case 3:
				t3 = calculate(45,quant());
				break;
			case 4:
				t4 = t1 + t2 + t3;

				System.out.println("\n+---------Menu----------+------QTY------+-----Price-----+");

				if (t1 != 0) {
					System.out.printf("| Pizza\t\t\t|\t%d\t|\t%d\t|\n", t1/250, t1);
				}
				if (t2 != 0) {
					System.out.printf("| Chickens\t\t|\t%d\t|\t%d\t|\n", t2/120, t2);
				}
				if (t3 != 0) {
					System.out.printf("| Coke\t\t\t|\t%d\t|\t%d\t|\n", t3/45, t3);
				}
				System.out.println("+-----------------------+---------------+---------------+");
				System.out.printf("| Total\t\t\t\t\t|\t%d\t|\n", t4);
				System.out.println("+-----------------------+---------------+---------------+");
			}
			if (choice == 5) {
				System.out.print("==========THANK YOU==========");
				break;
			}
		}

	}
}



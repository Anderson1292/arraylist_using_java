package vector;

import java.util.Locale;
import java.util.Scanner;

import entites.Products;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int number = sc.nextInt();
		double[] vector = new double[number];
		
		double sum = 0.0;
		for(int i = 0;i < number;i++) {
			vector[i] = sc.nextDouble();
			sum += vector[i];
		}
		double average = (double)sum/number;
		System.out.printf("Average = %.2f",average);
		
		//Example 02
		int x = sc.nextInt();
		Products[] vect = new Products[x];
		
		for(int i = 0;i < x;i++) {
			sc.nextLine();
			String products = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(products,price);
		}
		double sum_of_values = 0.0;
		for(int i = 0;i < x;i++) {
			sum_of_values += vect[i].getPrice();
		}
		double average_values = sum_of_values/x;
		System.out.printf("Average Heights = %.2f",average_values);
		
		sc.close();
	}

}

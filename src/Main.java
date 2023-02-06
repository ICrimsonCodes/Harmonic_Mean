import java.util.Scanner;                                        // import Scanner

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);              // make scanner object
		int n;
		System.out.print("Enter amount of Data: ");             // prompt user to Enter total amount of data
		n = scanner.nextInt();
		double[] user_data = new double[n];                     //making Dynamic Array
		double sum = 0.0;
		System.out.print("Enter Data: ");                       // prompt user to enter Data
		for (int i = 0; i < n; i++) {
			user_data[i] = scanner.nextInt();                   // Getting Data in array
			user_data[i] = 1 / user_data[i];                       // Getting reciprocal
			sum += user_data[i];                                // Calculating Sum
		}
		double HM = sum / n;                                       // Calculating Harmonic mean
		System.out.println(HM);                                 // Display Harmonic mean
	}
}

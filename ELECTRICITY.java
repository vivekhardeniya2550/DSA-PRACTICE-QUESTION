import java.util.Scanner;

public class ELECTRICITY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter electricity units consumed (kWh): ");
		int units = sc.nextInt();

		double bill = calculateBill(units);

		System.out.println("Electricity Bill:");
		System.out.println("Units consumed: " + units);
		System.out.println("Total amount: ₹" + bill);
	}

	public static double calculateBill(int units) {
		double totalBill = 0;

		if (units <= 0) {
			return 0;
		}


		if (units <= 100) {
			totalBill = units * 10;
		}

		else if (units <= 200) {
			totalBill = 100 * 10 + (units - 100) * 15;
		}

		else if (units <= 300) {
			totalBill = 100 * 10 + 100 * 15 + (units - 200) * 20;
		}

		else {
			totalBill = 100 * 10 + 100 * 15 + 100 * 20 + (units - 300) * 25;
		}

		return totalBill;
	}
}
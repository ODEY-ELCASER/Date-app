import java.util.Scanner;

public class xxl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("İlk sayıyı girin: ");
		double first = scanner.nextDouble();
		System.out.print("İşlemi girin (+, -, *, /): ");
		char operation = scanner.next().charAt(0);
		System.out.print("İkinci sayıyı girin: ");
		double second = scanner.nextDouble();

		double result;
		switch (operation) {
			case '+':
				result = first + second;
				break;
			case '*':
				result = first * second;
				break;
			case '/':
				if (second == 0) {
					System.out.println("Sıfıra bölme yapılamaz.");
					return;
				}
				result = first / second;
				break;
			default:
				System.out.println("Geçersiz işlem.");
				return;
		}

		System.out.println("Sonuç: " + result);
	}
}

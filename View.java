import java.util.Scanner;

class View {
	public static void main(String[] args) {
		Model people = new Model();
		Scanner read = new Scanner(System.in);
		System.out.print("Digite 1 para somar 2 números");
		System.out.println("Digite 2 para somar 3 números");
		people.name = read.next();		
	}
}

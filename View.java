import java.util.Scanner;

class View {
	public static void main(String[] args) {
		byte op;
		Model valor = new Model();
		int resultado;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite 1 para somar 2 números");
		System.out.println("Digite 2 para somar 3 números");
		System.out.print(">> ");		
		if(op == 1) {
			System.out.print("Digite o primeiro valor >> ");
			valor.valor1 = read.nextInt();
			System.out.print("Digite o segundo valor >> ");
			valor.valor2 = read.nextInt();
			resultado = Controller.soma(valor.valor1 + valor.valor2);
			System.out.println("A soma dos 2 valores é >> "+resultado);
		}else if (op == 2){
			System.out.print("Digite o primeiro valor >> ");
			valor.valor1 = read.nextInt();
			System.out.print("Digite o segundo valor >> ");
			valor.valor2 = read.nextInt();
			System.out.print("Digite o terceiro valor >> ");
			valor.valor3 = read.nextInt();
			resultado = Controller.soma(valor.valor1 + valor.valor2 + valor.valor3);
			System.out.println("A soma dos 3 valores é >> "+resultado);
		} else
			System.out.println("Opção inválida!");
	}
}

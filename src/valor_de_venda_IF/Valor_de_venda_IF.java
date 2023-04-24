package valor_de_venda_IF;

import java.util.Scanner;

public class Valor_de_venda_IF {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double valorCompra, valorVenda;
		
		System.out.println("Informe o valor da compra.");
		valorCompra = input.nextDouble();
		
		if (valorCompra < 10) {
			valorVenda = valorCompra + valorCompra * 0.7;
			System.out.println("O valor da venda com 70% de lucro deve ser " + valorVenda);
		}else if (valorCompra >=10 && valorCompra < 30) {
			valorVenda = valorCompra + valorCompra * 0.5;
			System.out.println("O valor da venda com 50% de lucro deve ser " + valorVenda);
		}else if (valorCompra >=30 && valorCompra < 50) {
			valorVenda = valorCompra + valorCompra * 0.4;
			System.out.println("O valor da venda com 40% de lucro deve ser " + valorVenda);
		}else {
			valorVenda = valorCompra + valorCompra * 0.3;
			System.out.println("O valor da venda com 30% de lucro deve ser " + valorVenda);
		}
		
		
		
		input.close();
	}

}

package program;

/*
beecrowd | 1116 - Dividindo X por Y

Escreva um algoritmo que leia 2 números e imprima o resultado da divisão
do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade
de pares de valores inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal,
ou “divisao impossivel” caso não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas
linguagens como o C e C++ gera outro inteiro. Utilize cast :)
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			if(y != 0) {
				System.out.printf("%.1f\n", (x / y));
			}
			else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}
}

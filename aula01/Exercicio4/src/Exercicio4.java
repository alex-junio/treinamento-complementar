import java.util.Scanner;

/*
Escreva um programa que exiba a tabuada do n�mero digitado pelo usu�rio.
Por exemplo, se o usu�rio digitar o valor 5, deve mostrar a tabuada no n�mero 5, como est� listado abaixo.
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
continua at�
5 x 10 = 50
*/

public class Exercicio4 {

public static void main(String[] args) {
System.out.println("� hora da tabuada");
Scanner teclado = new Scanner(System.in);
int numero, resultado;
System.out.println("Digite um n�mero para ver a tabuada. Mas s� at� o dez, hein. Pra que mais que isso, n�?");
numero = teclado.nextInt();
teclado.close();
for(int contador = 0; contador <= 10; contador++){
resultado = numero*contador;
System.out.println(numero + " vezes " + contador + ": " + resultado);
}
}
}

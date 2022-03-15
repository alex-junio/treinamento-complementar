import java.util.Scanner;

/*
Escreva um programa que exiba a tabuada do número digitado pelo usuário.
Por exemplo, se o usuário digitar o valor 5, deve mostrar a tabuada no número 5, como está listado abaixo.
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
continua até
5 x 10 = 50
*/

public class Exercicio4 {

public static void main(String[] args) {
System.out.println("É hora da tabuada");
Scanner teclado = new Scanner(System.in);
int numero, resultado;
System.out.println("Digite um número para ver a tabuada. Mas só até o dez, hein. Pra que mais que isso, né?");
numero = teclado.nextInt();
teclado.close();
for(int contador = 0; contador <= 10; contador++){
resultado = numero*contador;
System.out.println(numero + " vezes " + contador + ": " + resultado);
}
}
}

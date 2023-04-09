
// programa de soluções computacionais.
// Lista 2 ( atividade 5)
//Aluno: João Victor Maia Leite
//RA: 323124931


import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) throws Exception {
        
  // Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
  // celsius para Fahrenheit = multiplicar a temperatura em graus Celsius por 1,8 e somar 32.

   Scanner input = new Scanner(System.in);

  System.out.println("Qual a temperatura em celsius:?");

   int celsius = input.nextInt();

    double fahrenheit = celsius * 1.8 + 32;
    

 System.out.println("Transformando os graus Celsius Em graus Fahrenheit equivale a"  + fahrenheit);
    









    }
}

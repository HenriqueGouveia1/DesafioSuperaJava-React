package Questão1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Considerando a numeros de valores inteiros não negativos, ordene estes valores segundo 
o seguinte critério:

• Primeiro os Pares
• Depois os Ímpares

Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares 
em ordem decrescente.
numeros
A primeira linha de numeros contém um único inteiro positivo N (1 < N <= 105) Este é o 
número de linhas de numeros que vem logo a seguir. As próximas N linhas conterão, cada 
uma delas, um valor inteiro não negativo.
Saída
Apresente todos os valores lidos na numeros segundo a ordem apresentada acima. Cada 
número deve ser impresso em uma linha, conforme exemplo abaixo. */

public class Questao1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> Pares = new ArrayList<Integer>();
        ArrayList<Integer> Impares = new ArrayList<Integer>();

        //lendo a quantidade de números
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("");

        for (int i = 0; i < n; i++) {
            //adicionando números de acordo com a quantidade indicada
            in = new Scanner(System.in);
            numeros.add(in.nextInt());

            if (numeros.get(i) % 2 == 0) {
                Pares.add(numeros.get(i));
            } else {
                Impares.add(numeros.get(i));
            }
        }
        //ordenando os números em seus devidos lugares
        Collections.sort(Pares);
        Collections.sort(Impares);
        Collections.reverse(Impares);

        System.out.println("");

        for (int par : Pares) {
            System.out.println(par);
        }

        for (int impar : Impares) {
            System.out.println(impar);
        }
        in.close();
    }
}
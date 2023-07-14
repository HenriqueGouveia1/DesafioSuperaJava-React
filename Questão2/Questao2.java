package Questão2;

import java.util.Scanner;

/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor 
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor 
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas 
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
necessárias*/


//diclaimer: Sendo sincero, essa daqui em java me complicou um pouco
//tenho feita em JavaScript e nela foi bem mais fácil.
//Vou deixar meio incompleto mas é o que eu consegui com o tempo que tenho...
public class Questao2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float valor = in.nextFloat();

        int[] arr = { 100, 50, 20, 10, 5, 2, 1 };
        int[] arrMuedas = { 1, 0, 25, 10, 05, 01 };

        for (int nota : arr) {
            float qtd = (valor / nota);
            valor = (valor % nota);
            System.out.println(qtd + " nota(s) de R$ " + nota);
        }

        System.out.println(" Moedas ");
        for (int mueda : arrMuedas) {
            float qtdmueda;

            qtdmueda = (valor / mueda);

            qtdmueda = (valor / mueda);

            valor = valor % mueda;
            System.out.println(qtdmueda + " moeda(s) de R$ " + mueda);

        }
    }
}
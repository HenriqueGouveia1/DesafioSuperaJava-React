package Questão4;

import java.util.Scanner;

/*A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois 
de olhar para várias páginas impressas por um tempo, você percebe que ele está 
imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo 
modo, a metade direita de cada linha está sendo impressa à partir da margem direita e 
prosseguindo em direção ao centro da página.
Por exemplo a linha:
THIS LINE IS GIBBERISH
está sendo impressa como:
I ENIL SIHTHSIREBBIG S
Da mesma forma, a linha " MANGOS " está sendo impressa incorretamente como 
"NAM SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi 
impressa para a sua forma original. Você pode assumir que cada linha conterá um número 
par de caracteres*/

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		
		//
		for(int i = 0; i < n; i++){
		
			String frase = scanner.nextLine();
			int mid = frase.length()/2 ;
			
			//separa a frase em duas
			String[] partes = {
					frase.substring(0, mid)
					,frase.substring(mid)
					};
			
			//inverte as duas metades
			partes[0] = new StringBuilder(partes[0]).reverse().toString();
			partes[1] = new StringBuilder(partes[1]).reverse().toString();

			System.out.println(partes[0] + partes[1]);
		
		}
    }
}

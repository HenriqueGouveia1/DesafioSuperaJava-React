package Questão3;

public class Questao3 {
    // Dado um array de inteiros e um valor alvo, determine o número de pares entre
    // os elementos
    // do array em que a sua diferença seja igual ao valor alvo.

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int target = 1;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == target) {
                    
            
                    System.out.print("["+nums[j] +","+ nums[i]+"]");
                }
            }
        }
    }
}
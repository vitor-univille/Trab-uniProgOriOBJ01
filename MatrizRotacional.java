import java.util.Arrays;
import java.util.Scanner;

public class MatrizRotacional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe o tamanho da Matriz: ");
        int lincol = leitor.nextInt();
        int acum = 1;
        int[][] matriz = new int[lincol][lincol];
        int[][] matrizroda = new int[lincol][lincol];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = acum;
                acum += 1;
            }
        }
        System.out.println("Matriz:");
        for (int lin = 0; lin < matrizroda.length; lin++) {
            System.out.println(Arrays.toString(matriz[lin]));
        }
        System.out.printf("Agora, Informe o Grau que deseja rotacionar [0, 90, 180, 270, 360]: ");
        int grau = leitor.nextInt();
        
        switch (grau) {
            case 0:
            System.out.println("Matriz Rotacionada 0°:");
            for (int lin = 0; lin < matriz.length; lin++) {
                System.out.println(Arrays.toString(matriz[lin]));
            }
            break;
            case 90:
            for (int lin = 0; lin < matriz.length; lin++) {
                for (int col = 0; col < matriz[lin].length; col++) {
                    matrizroda[lin][col] = matriz[lincol - col - 1][lin];
                }
            }
            System.out.println("Matriz Rotacionada 90°:");
            for (int lin = 0; lin < matrizroda.length; lin++) {
                System.out.println(Arrays.toString(matrizroda[lin]));
            }
            break;
            case 180:
            for(int i = 0;i < 2; i++){
                for (int lin = 0; lin < matriz.length; lin++) {
                    for (int col = 0; col < matriz[lin].length; col++) {
                        matrizroda[lin][col] = matriz[lincol - col - 1][lin];
                    }
                }
                for (int j = 0; j < matrizroda.length;j++){
                    for (int k = 0;k < matrizroda[j].length;k++){
                        matriz[j][k] = matrizroda[j][k];
                    }
                }
            }
            System.out.println("Matriz Rotacionada 180°:");
            for (int lin = 0; lin < matrizroda.length; lin++) {
                System.out.println(Arrays.toString(matrizroda[lin]));
            }
            break;
            case 270:
            for(int i = 0;i < 3; i++){
                for (int lin = 0; lin < matriz.length; lin++) {
                    for (int col = 0; col < matriz[lin].length; col++) {
                        matrizroda[lin][col] = matriz[lincol - col - 1][lin];
                    }
                }
                for (int j = 0; j < matrizroda.length;j++){
                    for (int k = 0;k < matrizroda[j].length;k++){
                        matriz[j][k] = matrizroda[j][k];
                    }
                }
            }
            System.out.println("Matriz Rotacionada 270°:");
            for (int lin = 0; lin < matrizroda.length; lin++) {
                System.out.println(Arrays.toString(matrizroda[lin]));
            }
            break;
            case 360:
            System.out.println("Matriz Rotacionada 360°:");
            for (int lin = 0; lin < matriz.length; lin++) {
                System.out.println(Arrays.toString(matriz[lin]));
            }
            break;
            
        }
        
    }
}

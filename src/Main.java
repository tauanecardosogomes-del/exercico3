import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();
        char[] letras = nome.toCharArray();
        int inicio = 0;
        int fim= letras.length -1;
        while (inicio < fim){
            char aux = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = aux;

            inicio ++;
            fim --;

        }
        System.out.println(letras);
    }
}
import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        int opcao;
       
        Scanner scan = new Scanner(System.in);
        System.out.println("1-Domingo, 2-Segunda, 3-Terca, 4-Quarta, 5-Quinta, 6-Sexta, 7-Sabado");
        System.out.println("Digite um valor de 1 a 7, para representar os dias da semana:");
        opcao= scan.nextInt();
       scan.close();
      
       switch (opcao) {
            case 1:
                System.out.println("\n1-Domingo");
                break;
            case 2:
                System.out.println("\n2-Segunda-feira");
                break;
            case 3:
                System.out.println("\n3-Terca-feira");
                break;  
            case 4:
                System.out.println("\n4-Quarta-feira");
                break;
            case 5:
                System.out.println("\n5-Quinta-feira");
                break;
            case 6:
                System.out.println("\n6-Sexta-feira");
                break;
            case 7:
                System.out.println("\n7-Sabado");
                break;
            default:
                System.out.println("Caractere invalido, digite novamente um valor de 1 a 7.");
                break;
        }
      
    }
    
}
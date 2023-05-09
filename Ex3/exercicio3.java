
import java.util.Scanner;


public class N {
    static Scanner input = new Scanner(System.in);
    
    static void Mes(int numero){
       switch(numero){
            case 1: System.out.println("Janeiro");
                break;
            case 2: System.out.println("Fevereiro");
                break;
            case 3: System.out.println("Marco");
                break;
            case 4: System.out.println("Abril");
                break;
            case 5: System.out.println("Maio");
                break;  
            case 6: System.out.println("Junho");
                break;
            case 7: System.out.println("Julho");
                break;
            case 8: System.out.println("Agosto");
                break;
            case 9: System.out.println("Setembro");
                break;
            case 10: System.out.println("Outubro");
                break;
            case 11: System.out.println("Novembro");
                break;
            case 12: System.out.println("Dazembro");
                break;
            default: System.out.println("Mes invalido");
        }
    
    
    }
    
    public static void main(String[] args){
        
        System.out.println("Digite um numero de 1 a 12: ");
        int num = Integer.valueOf(input.nextLine());
        
         Mes(num);
         
    }
    
}

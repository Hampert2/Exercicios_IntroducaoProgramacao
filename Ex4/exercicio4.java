
import java.util.Scanner;


public class S {
    static Scanner input = new Scanner (System.in);
    
    static boolean palindromo(int numero){
        int milhar = numero / 1000;
        int resto = numero % 1000;
        int centena = resto / 100;
        resto = resto % 100;
        int dezena = resto / 10;
        int unidade = resto % 10;
        return milhar == unidade && centena == dezena;
    }
    
    public static void main(String[] args){
        
        System.out.println("Digite um numero");
        int num = Integer.valueOf(input.nextLine());
        
       boolean resultado = palindromo(num);
       
       if(resultado){
           System.out.println("o numero "+num+" e um palindromo");
       }else{
           System.out.println("o numero "+num+" nao e um palindromo");
       }
       
    }
}

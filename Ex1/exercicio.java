
import java.util.Scanner;


public class Exemplo_Atividade_FOR {
    static Scanner input = new Scanner (System.in);
    
    
    
    public static void main(String[] args){
        
        int soma = 0;
        int contP = 0, contN = 0;
        
        System.out.println("Quantos numeros deseja digitar: ");
        int n = Integer.valueOf(input.nextLine());
        
        for(int i=0;i<n;i++){
        System.out.println("Digite um numero:");
        int num = Integer.valueOf(input.nextLine());
        
        soma = soma + num;
        
        int quadrado = num * num;
        
        if(num >= 0){
            contP = contP + 1;
        }else{
            contN = contN + 1;
        }
        
        System.out.println("Quadrado: "+quadrado);
        }
        System.out.println("Soma final: "+soma);
        System.out.println("Os numeros positivos sera de: "+contP);
        System.out.println("Os numeros negativos sera de: "+contN);
        
    }
}

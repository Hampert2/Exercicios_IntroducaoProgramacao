import java.util.Scanner;


public class v6 {
    static Scanner input = new Scanner (System.in);
        
       static int leiaNumero(String mensagem){
           System.out.println(mensagem);
           return Integer.valueOf(input.nextLine());
       } 
        static int calculeFatorial(int x){
            int fatorialx = 1;
            
            for(int i=x;i>1;i--)
                fatorialx = fatorialx * i;
             
            return fatorialx;
        }
        
    public static void main(String[] args){
        
        int n = leiaNumero("Digite a quantidade de elemento (n)");
        int p = leiaNumero("Digite a quantidade de elementos por grupo (p)");
        int fatN = calculeFatorial(n);
        int fatP = calculeFatorial(p);
        int fatNP = calculeFatorial(n-p);
        int combinacoes = fatN / (fatP * fatNP);
        
        System.out.println("Quantidade de cominacoes de "+n+
                            "elementos agrupados "+p+" a "+p+": "
                             +combinacoes);
        
    }
}
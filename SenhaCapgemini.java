import java.util.*;

public class SenhaCapgemini {
       
    
    public static void main(String args[]){
    
        Scanner entrada = new Scanner(System.in);
    
        String senha1, senha2 = "";
        int NUM = 6;
        int numCarac1, numCarac2 = 0;
    
        System.out.println("Crie uma senha forte. Digite: ");
    
        senha1 = entrada.nextLine();
        numCarac1 = senha1.length();
        


        if (numCarac1 >= NUM)
        {
            System.out.println("Parabens!!! Você criou uma senha forte.");
        }
        else{
            System.out.println("Você deve criar uma senha forte com no mínimo 6 caracter.");
            System.out.println("Você digitou apenas: " + numCarac1);
            System.out.println("Complete sua senha com o mínimo de mais " + (6 - numCarac1 +" caracteres: "));
            senha2 = senha1 + entrada.nextLine();
            numCarac2 = senha2.length();
            if (numCarac2 >= NUM){
                System.out.println("Parabens!!! Você criou uma senha forte. Sua Senha: "+ senha2);
            }else{
                System.out.println("Faça um novo Login!!!!");
            }  
        }   
    }
}

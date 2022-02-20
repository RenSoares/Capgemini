import java.util.*;

public class anagramaCapgemini {
    
    

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
    
        String palavra = "";
        int numCarac, cont1, cont2, cont3, cont4, cont5, soma, qtd = 0;

        System.out.println("Digite a palavra com no máximo 10 caracteres: \n");
        palavra = entrada.nextLine();
        numCarac = palavra.length();
        if (numCarac > 10){
            System.out.println("Palavra maior que 10 caracteres, digite outra!!!");
        }
        Char[] palArray = palavra.toCharArray();

        do
            if(qtd == 0){
                for (int i = 0; i < numCarac; i++) {
                    char c = palavra.charAt(i);
                    for(int j = i+1; j < numCarac; j++){
                        if(c.equalsToIgnoreCase(palArray[j]))
                        cont1++;
                    }
                }
                qtd++;
            }
            else if(qtd == 1){
                for (int i = 0; i < numCarac; i++) {
                    char c = palavra.charAt(i) + palavra.charAt(i+1);
                    for(int j = i+2; j < numCarac; j++){
                        if(c.equalsToIgnoreCase(palArray[j]+palArray[j+1]))
                        cont2++;
                    }
                }
                qtd++;    
            }
            else if(qtd == 2){
                for (int i = 0; i < numCarac; i++) {
                    char c = palavra.charAt(i) + palavra.charAt(i+1) + palavra.charAt(i+2);
                    for(int j = i+3; j < numCarac; j++){
                        if(c.equalsToIgnoreCase(palArray[j]+palArray[j+1] + palArray[j+2]))
                        cont3++;
                    }
                }
                qtd++;    
            }
            else if(qtd == 3){
                for (int i = 0; i < numCarac; i++) {
                    char c = palavra.charAt(i) + palavra.charAt(i+1) + palavra.charAt(i+2) + palavra.charAt(i+3);
                    for(int j = i+4; j < numCarac; j++){
                        if(c.equalsToIgnoreCase(palArray[j]+palArray[j+1] + palArray[j+2] + palArray[j+3]))
                        cont4++;
                    }
                }
                qtd++;    
            }
            else {
                for (int i = 0; i < numCarac; i++) {
                    char c = palavra.charAt(i) + palavra.charAt(i+1) + palavra.charAt(i+2) + + palavra.charAt(i+3) + palavra.charAt(i+4);
                    for(int j = i+3; j < numCarac; j++){
                        if(c.equalsToIgnoreCase(palArray[j] + palArray[j+1] + palArray[j+2] + palArray[j+3] + palArray[j+4]))
                        cont5++;
                    }
                }
                qtd++;    
            }
            soma = cont1 + cont2 + cont3 + cont4 + cont5;
        while(qtd < numCarac/2)
        System.out.println("---------------------------------------------\n");
        System.out.println("Cont1: " + cont1);
        System.out.println("Cont2: " + cont2);
        System.out.println("Cont3: " + cont3);
        System.out.println("Cont4: " + cont4);
        System.out.println("Cont5: " + cont5);
        System.out.println("---------------------------------------------\n");
        System.out.println("Número de Anagramas: " + soma);
            
    }

}

       

    

   
    


import java.util.Scanner;

public class EscadaCapgemine{

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        String str1 = " ";
        String str2 = "*";
        int mult = 0;

        System.out.println("Entre com um número  inteiro (1-10): ");

        num = entrada.nextInt();

        for(int i = 1; i <= num; i++){

            mult = num-i;
            String repeatedStr1 = str1.repeat(mult);
            String repeatedStr2 = str2.repeat((num - (num-i)));
            System.out.println(repeatedStr1 + repeatedStr2);                 
        }


    }

}

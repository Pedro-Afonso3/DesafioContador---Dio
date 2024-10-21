package Mains;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o primeiro numero: ");
            int num1 = scan.nextInt();

            System.out.println("Digite o segundo numero: ");
            int num2 = scan.nextInt();

            try{
                contar(num1,num2);
            }catch (ParametrosInvalidosException e){
                System.out.println(e.getMessage());
            }finally {
                if (num1 >= num2) {
                   continue;
                }else{
                    break;
                }
            }
        }

    }

    static void contar(int num1,int num2) throws ParametrosInvalidosException{
        int contagem = num1 - num2;

        if (num1 >= num2) {
            throw new ParametrosInvalidosException(
                    "Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }

        for(int i = num1;i <= num2;i++){
            System.out.println(i);
        }
    }
}

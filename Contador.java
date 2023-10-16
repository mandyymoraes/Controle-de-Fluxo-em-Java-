package Desafio_ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número: ");
        int primeiroNumero = console.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = console.nextInt();
        console.close();
        try {
            contar(primeiroNumero, segundoNumero);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());

        }

    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if(primeiroNumero > segundoNumero){
            throw new ParametrosInvalidosException();
        }
        

        int intervalo = segundoNumero - primeiroNumero;

        for (int i = 1; i <= intervalo; i++) {

            System.out.println("Imprimindo o número " + i + "\n");

        }

    }
}

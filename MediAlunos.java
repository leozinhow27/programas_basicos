import java.util.Scanner;
import java.util.ArrayList;

public class MediAlunos
{
    public static void main (String[]args)
    {


        Scanner leitor = new Scanner (System.in);

        ArrayList < String > lista = new ArrayList <> ();
        while (true)
        {
            String entrada_inicial = leitor.nextLine ();

            String[] numeros = entrada_inicial.split (" ");
            if (numeros[0].equals ("-"))
            {
                break;
            }
            else
            {
                lista.add (numeros[1]);
            }
        }

        int soma = 0;
        int conta = 0;
        int conta_acima = 0;
        int conta_abaixo = 0;
        int maior = Integer.parseInt(lista.get(0));
        int menor = Integer.parseInt(lista.get(0));

        for (String elementos:lista) {
            int numero = Integer.parseInt (elementos);
            soma += numero;
            conta += 1;
            if (numero >= 700) {
                conta_acima += 1;
            } else {
                conta_abaixo += 1;
            }

            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }

        int media = soma / conta;

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println ("media: " + media);
        System.out.println ("acima: " + conta_acima);
        System.out.println ("abaixo: " + conta_abaixo);



    }

}
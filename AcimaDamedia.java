import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AcimaDamedia
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sequencias  = sc.nextLine();

        String[] separando_numeros = sequencias.split(" ");

        int somador = 0;
        int cont = 0;

        for (int i = 0; i < separando_numeros.length; i++){
            int transformador = Integer.parseInt(separando_numeros[i]);
            cont += 1;
            somador += transformador;
        }
        List lista_maiores = new ArrayList();
        int media = somador / cont;
        for (int x = 0; x < separando_numeros.length; x++){
            int transformador_dois = Integer.parseInt(separando_numeros[x]);
            if (transformador_dois > media){
                System.out.print(transformador_dois + " ");

            }
        }


    }

}
import java.util.Scanner;

public class teste{

    public static float media(int[] idades, int tam){
        float media = 0;
        int soma = 0, x;

        for(x=0;x<tam;x++){
            soma = soma+idades[x];
        }

        media = soma/tam;
        
        return media;
    }

    public static int acima_da_media(int[] idades, int tam, float media){
        int maior_q_media = 0, x;
        
        for(x=0;x<tam;x++){
            if(idades[x]>media){
                maior_q_media++;
            }
        }

        return maior_q_media;

    }

    public static void main(String[] args) {
        int tam, x, alunos_acima;
        float media_idades;
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Informe o numero de alunos");
        tam = leitor.nextInt();

        int idades[] = new int[tam];
        
        for(x=0;x<tam;x++){
            System.out.println(" Informe a idade do aluno " +(x+1)+ ":");
            idades[x] = leitor.nextInt();
        }

        media_idades = media(idades, tam);
        alunos_acima = acima_da_media(idades, tam, media_idades);

        System.out.println(" Media das idades: " +media_idades);
        System.out.println(" Numero de alunos com a idade acima da media: " +alunos_acima);
    }
}
import java.util.Scanner;


public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua nota para o Filme ");
        double avaliação = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliação);
    }
}

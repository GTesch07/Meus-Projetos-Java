public class Main {
    public static void main(String args[]){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
       /* boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;*/

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(String.format("%.2f", media));
        System.out.println(media);

        String sinopse1;
        String sinopse2;
        System.out.println("");
        sinopse1 = " Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha,\n Pete \"Maverick\" Mitchell está de volta, rompendo os limites como um piloto\n de testes corajoso. No mundo contemporâneo das guerras tecnológicas,\n Maverick enfrenta drones e prova que o fator humano ainda é essencial." + "\n" + anoDeLancamento;

        sinopse2 = String.format("""
                 Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha,
                 Pete "Maverick" Mitchell está de 
                 volta,rompendo os limites como um piloto
                 de testes corajoso. No mundo
                 contemporâneo das guerras tecnológicas,
                 Maverick enfrenta drones e prova que fator humano ainda é essencial.
                 %d
                """,anoDeLancamento);

        System.out.println(sinopse1 + "\n\n" + sinopse2);
        //Casting
        int classificacao = (int) (media/2);

        System.out.println(classificacao);

    }
}

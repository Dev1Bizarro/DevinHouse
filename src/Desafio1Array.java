public class Desafio1Array {
    public static void main(String[] args) {

        //String[] cores = {"vermelho", "preto", "Branco", "Roxo","Azul","Amarelo"};
        //System.out.println("tamanho" + cores.length);
        //System.out.println("terceiro elemento do Arrey " + cores[2]);
        //System.out.println("Priimeiro elemento Arrey é " + cores[0]);
        //System.out.println("O ultimo elemento do Arrey é " + cores[5]);

        //Desafio 2
        String[][] multicores = {
                {"Vermelho", "Preto", "Branco"},
                {"Roxo", "Azul"}
        };
        System.out.println("O primeiro elemento do primeiro ARRAY é:" + multicores[0][0]);
        System.out.println("O primeiro elemento do segundo ARRAY é:" + multicores[1][0]);
        System.out.println("Tamanho do ARRAY multidimensional:" + multicores.length);
        System.out.println("tamanho primeiro ARRAY:" + multicores[0].length);
    }
}
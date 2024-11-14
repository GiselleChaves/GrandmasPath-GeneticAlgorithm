import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Dell\\Desktop\\SemestreAtual\\Otimização_Algoritmos\\Trabalhos\\Desafio_Algoritmo_Genetico\\grandmasPath\\data.txt";
        GrandmasPath grandmasPath = new GrandmasPath();

        // Usando o método com BufferedReader
        List<String> linhasBufferedReader = grandmasPath.shortestPath(filePath);


        System.out.println("Conteúdo do arquivo (BufferedReader):");
        for (String linha : linhasBufferedReader) {
            System.out.println(linha);
        }
    }
}
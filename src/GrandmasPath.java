import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GrandmasPath {


    // Método para ler o arquivo usando BufferedReader
    public List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

//    public List<String> shortestPath(String filePath) {
    public String shortestPath(String filePath) {

        List<String> cities = readFile(filePath);
        String[] arrayOfWords = new String[0];
        String x1, y1 = null, city = null;
        
        for (int i = 1; i < cities.size(); i++) {
            String line = cities.get(i);
            arrayOfWords = line.split(" ");
            x1 = arrayOfWords[0];
            y1 = arrayOfWords[1];
            city = arrayOfWords[2];
            break;
        }
        return y1;
    }
}

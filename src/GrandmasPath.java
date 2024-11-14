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

    public List<String> shortestPath(String filePath) {
        int result = 0;

        List<String> cities = readFile(filePath);
        for(int i = 1; i < cities.size(); i++) {
            long x1 =
        }




        return cities;
    }
}

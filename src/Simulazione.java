import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Simulazione {

    public static List<String> loadLines(String filepath) throws IOException {
        /* FileReader fileReader = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fileReader);
        List<String> righe = new ArrayList<>();
        while (br.ready()) {
            righe.add(br.readLine());
        }
        br.close();
        return righe; */
        return Files.lines(new File(filepath).toPath()).toList();
    }

    public static HashMap<Integer, String> processLines(List<String> lines) {
        HashMap<Integer, String> mappa = new HashMap<>();
        for (String riga : lines) {
            if (riga.length() == 0) continue;
            int len = riga.strip().length();
            if (mappa.containsKey(len)) System.out.println("chiave già presente");
            else {
                mappa.put(len, riga.substring(0, riga.length()/2));
            }
        }
        return mappa;
    }

    public static void writeLines(String filePath, HashMap<Integer, String> entries) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (Integer key : entries.keySet()) {
            bw.write(key + " - " + entries.get(key).toUpperCase() + "\n");
        }
        bw.close();
    }

}

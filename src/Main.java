import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> righeTesto = Simulazione.loadLines("resources/example.txt");
        HashMap<Integer, String> mappa = Simulazione.processLines(righeTesto);
        Simulazione.writeLines("resources/out.txt", mappa);
    }

}

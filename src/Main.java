import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        Files.walkFileTree(Paths.get("src/Training"), textAnalyzer);

    }
}

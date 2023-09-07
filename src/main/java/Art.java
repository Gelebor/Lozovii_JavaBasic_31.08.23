import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Art {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\ingib\\IdeaProjects\\HW JavaBasic 31.08.23\\src\\main\\java\\ascii-art.txt";

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}

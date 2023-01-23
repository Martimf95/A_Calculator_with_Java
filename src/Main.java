import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            Window window = new Window();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
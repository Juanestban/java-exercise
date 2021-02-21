import java.nio.charset.Charset;
import java.util.Scanner;

public class Part3 {
    public Scanner scanner = new Scanner(System.in);
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO = Charset.forName("ISO-8859-1");

    public String encodeText(String text) {
        return new String(text.getBytes(ISO), UTF_8);
    }

    // question 21
    public void question21() {
        //
    }
}

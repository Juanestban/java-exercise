import java.nio.charset.Charset;
import java.util.Scanner;

public class Part4 {
    Scanner scanner = new Scanner(System.in);
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO = Charset.forName("ISO-8859-1");
    //

    public String decodeText(String text) {
        return new String(text.getBytes(ISO), UTF_8);
    }
}

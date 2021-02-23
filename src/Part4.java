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

    // question 31
    public void question31() {
        String name = "", result = "";
        int age = 0;

        System.out.println("Digitar su nombre:");
        name = scanner.nextLine();

        System.out.println("Digitar la edad");
        age = Integer.parseInt(scanner.nextLine());

        result = age >= 18
                ? "recordar que la docente de " + name + " esta jodidamente buenisima..."
                        + "\nque bien comera el perro que este con ella..."
                : "toc, toc, quien sabra que es... total numa me gusto este 'chiste'";

        System.out.println(result);
    }

    // question 32
    public void question32() {
        int age = 0, sex = 0;
        float weight = 0, height = 0;

        System.out.println("digitar su estatura");
        height = Integer.parseInt(scanner.nextLine());

        System.out.println("digitar la edad");
        age = Integer.parseInt(scanner.nextLine());

        System.out.println("digitar la sexo => masculino: 1 | femenino: 2");
        sex = Integer.parseInt(scanner.nextLine());

        weight = age > 30 && sex == 1 ? (height - 100) * 2 + 6
                : age < 30 && sex == 1 ? (height - 100) * 2
                        : age > 30 && sex == 2 ? (height - 110) * 2 + 3 : (height - 110) * 2;

        System.out.println("Peso: " + weight + "\nSexo: " + sex + "\nEdad:" + age);
    }

    // question 33
    public void question33() {
        int op = 0;
        float F = 0, Msg = 0, calcResult = 0;
        boolean start = true;

        do {
            System.out.println("1: Convertir °F a °C | 2: M/s a Km/h | 3: salir");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case 1:
                    System.out.println("digitar los °F");
                    F = Float.parseFloat(scanner.nextLine());
                    calcResult = (F - 32) / 1.8f;
                    break;
                case 2:
                    System.out.println("digitar los m/s");
                    Msg = Float.parseFloat(scanner.nextLine());
                    calcResult = Msg * 3.6f;
                case 3:
                    start = op == 3 ? false : true;
                    break;
            }
            System.out.println("Resultado: " + calcResult + (op == 1 ? " °C" : op == 2 ? " Km/h" : ""));
        } while (start);
    }

    // question 34
    public void question34() {
        int count = 0;
        float notas = 0, promedio = 0;
        String val = "";

        do {
            System.out.println("Digitar la nota:");
            val = scanner.nextLine();
            notas += Integer.parseInt(val);

            count++;
        } while (count < 3);

        if (notas >= 0 || notas <= 5) {
            promedio = notas / 3;
        }
        System.out.println("Promedio: " + promedio);
    }

    // question 35
    public void question35() {
        //
    }
}

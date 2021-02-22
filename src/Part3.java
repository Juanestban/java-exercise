import java.nio.charset.Charset;
import java.util.Scanner;

public class Part3 {
    public Scanner scanner = new Scanner(System.in);
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO = Charset.forName("ISO-8859-1");

    private String username;

    public String encodeText(String text) {
        return new String(text.getBytes(ISO), UTF_8);
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public void helloUser() {
        System.out.println("Hola usuario " + this.username);
    }

    public double calcWeight(float weight, float height) {
        double weightTotal = weight;
        double heightTotal = height;

        double result = weightTotal / Math.pow(heightTotal, 2);
        return result;
    }

    // question 21
    public void question21() {
        System.out.println("Bienvenido! me permites tu nombre?");
        setUsername(scanner.nextLine());
        helloUser();
    }

    // question 22
    public void question22() {
        System.out.println("Digitar su nombre:");
        setUsername(scanner.nextLine());
        System.out.println("que ilarante... estar en la pregunta #22 y que " + this.username
                + " se coloque hacer chistes, \nasi o mas desocupadito?"
                + "\n[por cierto... eso fue sarcasmo para el que no lo entendio ;v]");
    }

    // question 23
    public void question23() {
        String country = "";

        System.out.println("Digitar tu pais:");
        country = scanner.nextLine();

        String result = country.charAt(0) + "" + country.charAt(1);
        result = result.toUpperCase();

        System.out.println(result);
    }

    // question 24
    public void question24() {
        int lengthName;
        System.out.println("Digitar tu nombre:");
        setUsername(scanner.nextLine());

        lengthName = this.username.length();
        String result = this.username.charAt(lengthName - 2) + "" + this.username.charAt(lengthName - 1);

        System.out.println(result);
    }

    // question 25
    public void question25() {
        String lastName = "";
        String email = "";
        String concat = "Digita tu dominio de correo electronico: \bOpciones: ";
        String questOp[] = new String[4];
        questOp[0] = "hotmail.com";
        questOp[1] = "google.com";
        questOp[2] = "yahoo.es";
        questOp[3] = "utp.edu.co";
        int valueOp = 0;
        String ult, init;

        for (int i = 0; i < questOp.length; i++) {
            concat += questOp[i] + ": " + i + " | ";
        }

        System.out.println("Digitar tu nombre:");
        setUsername(scanner.nextLine());

        System.out.println("Digitar tu apellido:");
        lastName = scanner.nextLine();

        System.out.println(concat);
        valueOp = Integer.parseInt(scanner.nextLine());

        // resuslt
        init = this.username.charAt(0) + "" + this.username.charAt(1);
        init = init.toLowerCase();
        ult = lastName.charAt(lastName.length() - 2) + "" + lastName.charAt(lastName.length() - 1);
        ult = ult.toLowerCase();
        email = init + ult + "@" + questOp[valueOp];
        System.out.println("Tu email: " + email);
    }

    // question 26
    public void question26() {
        // formula = kg/m^2 || peso/altura^2
        float weight = 0, height = 0;
        double result = 0;
        String question = encodeText("Digitar el peso en libras del hombre de menor de 30 años:");

        System.out.println(question);
        weight = Float.parseFloat(scanner.nextLine());
        weight /= 2;

        System.out.println("Digitar la altura en centimentros *IMPORTANTE* => cm:");
        height = Float.parseFloat(scanner.nextLine());

        height /= 100;
        result = calcWeight(weight, height);

        System.out.println("Resultado: " + result + "kg/m^2");
    }

    // question 27
    public void question27() {
        // es el mismo pero con mujeres
        this.question26();
    }

    // question 28
    public void question28() {
        int quantityminutes = 0;
        int minutesToHours = 60;
        float hoursToDay = 0;
        float hoursToMounth = 0;
        String question = encodeText(
                "Cantidad de minutos invertidos en la conexión de las redes sociales durante este día:");

        System.out.println(question);
        quantityminutes = Integer.parseInt(scanner.nextLine());

        hoursToDay = (quantityminutes / minutesToHours) / 24;
        hoursToMounth = hoursToDay * 30;

        System.out.println("la cantidad de horas por cada mes en redes sociales son:" + hoursToMounth);
    }

    // question 29
    public void question29() {
        int quantityHours = 0;
        int priceForHour = 0;
        // int min = 3800;
        int salario = 0;

        System.out.println("Cantidad de horas de trabajo en la semana:");
        quantityHours = Integer.parseInt(scanner.nextLine());

        System.out.println("Presio de la hora de trabajo:");
        priceForHour = Integer.parseInt(scanner.nextLine());

        salario = quantityHours * priceForHour * 4;

        System.out.println("Salario por cada mes: " + salario);
    }

    // question 30
    // FALTA POR TERMINAR
    public void question30() {
        int presioPorUniddad = 0;
        float cantidad = 0;
        String question2 = encodeText(
                "Digitar la cantidad de cada uno de aquellos elementos a consumir en la fabricación");

        System.out.println("Digitar el presio por cada unidad de cada uno:");
        presioPorUniddad = Integer.parseInt(scanner.nextLine());

        System.out.println(question2);
        cantidad = Float.parseFloat(scanner.nextLine());

        //
    }
}

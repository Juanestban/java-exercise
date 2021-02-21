import java.util.Scanner;

public class Part1 {
    public Scanner scanner = new Scanner(System.in);

    public String methodBurbuja(int number1, int number2) {
        int primeNumb = number1, secNumb = number2;
        String value = "";

        if (primeNumb > secNumb)
            value = primeNumb + " " + secNumb;
        else
            value = secNumb + " " + primeNumb;

        return value;
    }

    // question 1:
    public void question1() {
        String sequence = "primer", entry = "";
        int num1 = 0, num2 = 0, count = 0;

        do {
            System.out.println("digitar el " + sequence + " numero");
            entry = scanner.nextLine();
            sequence = "segundo";
            if (count == 0)
                num1 = Integer.parseInt(entry);
            else
                num2 = Integer.parseInt(entry);
            count++;
        } while (count < 2);

        if (num1 > num2)
            System.out.println("el numero mayor es: " + num1 + "\ny el menor siendo: " + num2);
        else
            System.out.println("el numero mayor es: " + num2 + "\ny el menor siendo: " + num1);
    }

    // question 2:
    public void question2() {
        String response, value;
        int num1 = 0, num2 = 0, count = 0;

        do {
            System.out.println("digitar el primer valor:");
            value = scanner.nextLine();

            if (count == 0)
                num1 = Integer.parseInt(value);
            else
                num2 = Integer.parseInt(value);
            count++;
        } while (count < 2);

        response = this.methodBurbuja(num1, num2);
        System.out.println("+ <- " + response + " -> -");
    }

    // question 3
    public void question3() {
        String value = "";
        int POSITIVO, valNumeric;

        System.out.println("digitar primer dato numerico");
        value = scanner.nextLine();
        valNumeric = Integer.parseInt(value);

        if (valNumeric > 0) {
            POSITIVO = valNumeric;
            System.out.println("resultado: " + POSITIVO + " [MAYOR QUE 0]");
        } else {
            valNumeric *= valNumeric;
            System.out.println("resultado: " + valNumeric + " [MULTIPLICADO POR EL  MISMO]");
        }
    }

    // question 4
    public void question4() {
        String val = "";
        int condition = 100000;
        float value = 0;

        System.out.println("valor de su compra:");
        val = scanner.nextLine();
        value = Float.parseFloat(val);

        if (value > condition) {
            value = value * 0.8f;
            System.out.println("el valor de la compra con descuento del 20% es:");
            System.out.println(value);
        } else
            System.out.println("el valor de la compra es: " + value);
    }

    // question 5
    public void question5() {
        boolean start = true;
        int count = 1;
        float number = 0;
        String val = "", option = "", concat = "", discount = "";

        do {
            System.out.println("Presio de la camisa " + count + ":");
            val = scanner.nextLine();
            number += Integer.parseInt(val);
            concat += "Se agrego la camisa " + count + "\n";

            // finish part
            System.out.println("deseas seguir comprando? ==> S: Si | N: No");
            option = scanner.nextLine();
            option = option.toLowerCase();

            if (option.equals("n")) {
                if (count >= 3) {
                    number = number * 0.8f;
                    discount = "20%";
                } else {
                    number = number * 0.9f;
                    discount = "10%";
                }
                start = false;
            }
            count++;
        } while (start);

        System.out
                .println(concat + "\nPor un total de: " + number + "\nEl descuento que se agrego fue del " + discount);
    }
}

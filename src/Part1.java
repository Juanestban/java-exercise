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
            System.out.println("digitar el valor:");
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

        System.out.println("digitar dato numerico");
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

    // question 6
    public void question6() {
        String val = "";
        int quantity = 0, price = 80000, totalPrice = 0;

        System.out.println("digitar la cantidad de llantas a comprar");
        val = scanner.nextLine();
        quantity = Integer.parseInt(val);

        if (quantity < 5) {
            totalPrice = quantity * price;
        }

        if (quantity >= 5) {
            price = 70000;
            totalPrice = quantity * price;
        }

        System.out.println(
                "Presio por llanta individual: " + price + "\nEl presio total de la compra es de: " + totalPrice);
    }

    // question 7
    public void question7() {
        int number1 = 0, number2 = 0, count = 1, result = 0;
        String val = "";

        do {
            System.out.println("Digitar el dato numerico");
            val = scanner.nextLine();

            if (count == 1) {
                number1 = Integer.parseInt(val);
            } else {
                number2 = Integer.parseInt(val);

                if (number1 == number2)
                    result = number1 * number2;
                else if (number1 > number2)
                    result = number1 - number2;
                else
                    result = number1 + number2;
            }
            count++;
        } while (count <= 2);

        System.out.println("resultado: " + result);
    }

    public void question8() {
        int count = 0, number1 = 0, number2 = 0, number3 = 0;
        String val = "";

        do {
            System.out.println("Digitar numero" + (count + 1));
            val = scanner.nextLine();

            if (count == 0)
                number1 = Integer.parseInt(val);
            else if (count == 1)
                number2 = Integer.parseInt(val);
            else {
                number3 = Integer.parseInt(val);

                if (number1 > number2 && number1 > number3)
                    System.out.println("El numero mayor es:" + number1);
                else if (number2 > number1 && number2 > number3)
                    System.out.println("El numero mayor es:" + number2);
                else if (number3 > number1 && number3 > number2)
                    System.out.println("El numero mayor es:" + number3);
                else
                    System.out.println("no existe numbero mayor [todos son pares]:" + "\n" + number1 + " === " + number2
                            + " === " + number3);
            }
            count++;
        } while (count < 3);
    }

    // question 9
    public void question9() {
        String name = "";
        String stateCivil[];
        String concat = "Digitar Tu Estados Civiles:\n";
        // sex: 1 === MALE | 2 === FEMALE
        int age = 0, sex = 0;
        stateCivil = new String[6];
        stateCivil[0] = "Soltero/a";
        stateCivil[1] = "Casado/a";
        stateCivil[2] = "Union libre o union de hecho";
        stateCivil[3] = "Separado/a";
        stateCivil[4] = "Divorciado/a";
        stateCivil[5] = "Viudo/a";
        int stateCivilResult = 0;

        // name
        System.out.println("Digita tu nombre completo:");
        name = scanner.nextLine();
        // age
        System.out.println("Digita tu edad:");
        age = Integer.parseInt(scanner.nextLine());
        // sex
        System.out.println("digitar tu sexo: => MALE: 1 | FEMALE: 2");
        sex = Integer.parseInt(scanner.nextLine());
        String resultSex = sex == 1 ? "Masculino" : "Femenino";

        for (int i = 0; i < stateCivil.length; i++) {
            concat += stateCivil[i] + ": " + i + " | ";
        }

        System.out.println(concat);
        stateCivilResult = Integer.parseInt(scanner.nextLine());
        if (stateCivilResult == 0 && age >= 18) {
            System.out.println("nombre: " + name + "\nEdad: " + age + "\nSexo: " + resultSex + "\nEstado Civil: "
                    + stateCivil[stateCivilResult]);
        } else
            System.out.println("No cumples con los requisitos para mostrar los datos");
    }

    // question 10
    public void question10() {
        String name = "";
        String stateCivil[];
        String concat = "Digitar Tu Estados Civiles:\n";
        // sex: 1 === MALE | 2 === FEMALE
        int age = 0, sex = 0;
        stateCivil = new String[6];
        stateCivil[0] = "Soltero/a";
        stateCivil[1] = "Casado/a";
        stateCivil[2] = "Union libre o union de hecho";
        stateCivil[3] = "Separado/a";
        stateCivil[4] = "Divorciado/a";
        stateCivil[5] = "Viudo/a";
        int stateCivilResult = 0;

        // name
        System.out.println("Digita tu nombre completo:");
        name = scanner.nextLine();
        // age
        System.out.println("Digita tu edad:");
        age = Integer.parseInt(scanner.nextLine());
        // sex
        System.out.println("digitar tu sexo: => MALE: 1 | FEMALE: 2");
        sex = Integer.parseInt(scanner.nextLine());
        // String resultSex = sex == 1 ? "Masculino" : "Femenino";

        for (int i = 0; i < stateCivil.length; i++) {
            concat += stateCivil[i] + ": " + i + " | ";
        }

        System.out.println(concat);
        stateCivilResult = Integer.parseInt(scanner.nextLine());
        if (sex == 2 && age >= 18 && stateCivilResult == 1) {
            System.out.println("nombre: " + name + "\nEdad: " + age);
        } else if (sex == 1 && stateCivilResult == 0)
            System.out.println("nombre: " + name);
        else
            System.out.println("No cumples con los requisitos para mostrar los datos");
    }
}

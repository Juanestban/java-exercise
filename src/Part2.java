import java.nio.charset.Charset;
import java.util.Scanner;

public class Part2 {
    public Scanner scanner = new Scanner(System.in);
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO = Charset.forName("ISO-8859-1");

    public String decodeUTF_8(String text) {
        return new String(text.getBytes(ISO), UTF_8);
    }

    // question 11
    public void question11() {
        int id = 0;
        String result = "";
        String data = "Se ha identificado que eres un: ";
        String val = "";
        String question = "Digitar el valor al cual pertenece tu etapa de vida:" + "Adulto/a: 1 | Joven: 2 | Niño/a: 3";
        String encodedQuestion = new String(question.getBytes(ISO), UTF_8);

        System.out.println(encodedQuestion);
        val = scanner.nextLine();
        id = Integer.parseInt(val);

        if (id == 1)
            result = "Adulto/a";
        else if (id == 2)
            result = "Joven";
        else
            result = "Niño/a";
        String utf8EncondedString = new String(result.getBytes(ISO), UTF_8);

        System.out.println(data + utf8EncondedString);
    }

    // question 12
    public void question12() {
        float montoEfectuar = 0, percent = 0, priceEffect = 0;
        String val = "";
        String question = "Digitar el monto a efectúar para el seguro:";
        String encodedQuestion = new String(question.getBytes(ISO), UTF_8);

        System.out.println(encodedQuestion);
        val = scanner.nextLine();
        montoEfectuar = Integer.parseInt(val);

        if (montoEfectuar < 500000)
            percent = 0.03f;

        if (montoEfectuar >= 500000)
            percent = 0.02f;

        priceEffect = montoEfectuar - (montoEfectuar * percent);

        System.out.println("Cuota a pagar del " + (percent * 100) + "%");
        System.out.println("El costo a pagar es: " + priceEffect);
    }

    // question 13
    public void question13() {
        int NumberInscription = 0, patrimonio = 0, estratoSocial = 1;
        int rango = 2000000, valueConst = 500000;
        float totalPrice = 0;
        boolean isIncrement = false;
        String name = "";

        System.out.println("Numero de inscripcion:");
        NumberInscription = Integer.parseInt(scanner.nextLine());

        System.out.println("Digitar el nombre:");
        name = scanner.nextLine();

        System.out.println("Digitar el estrato social:");
        estratoSocial = Integer.parseInt(scanner.nextLine());

        System.out.println("Digitar su patrimonio:");
        patrimonio = Integer.parseInt(scanner.nextLine());
        totalPrice += patrimonio + valueConst;

        boolean isBetter = patrimonio > rango ? true : false;

        if (isBetter && estratoSocial > 3) {
            isIncrement = true;
            totalPrice = patrimonio * 0.03f;
        }

        System.out.println("Numero de indentificacion" + NumberInscription + "\nNombre: " + name + "\n"
                + (isIncrement ? "El incremento fue del 3%" : "No tubo incremento")
                + "\nCobro constante por instripcion añadido:" + valueConst + "\nPago de la matricula del estudiante:"
                + totalPrice);
    }

    // question 14
    public void question14() {
        String name = "", address = "";
        int numeroEstrato = 1, cargoFijo = 80000;
        float priceTotal = cargoFijo, percent = 0;

        System.out.println("Digitar su nombre:");
        name = scanner.nextLine();

        System.out.println("Tu direccion:");
        address = scanner.nextLine();

        System.out.println("Numero de estrato al que perteneces:");
        numeroEstrato = Integer.parseInt(scanner.nextLine());

        percent = numeroEstrato <= 2 ? 0.05f : numeroEstrato <= 4 ? 0.1f : 0.2f;
        priceTotal = priceTotal + (priceTotal * percent);

        System.out.println(
                "Nombre:" + name + "\nDireccion:" + address + "\nValor de la cuenta de servicio: " + priceTotal);
    }

    // question 15
    public void question15() {
        float iva = 0.1925f, descuentoAbaco = 0.05f;
        float presioLaptop = 0, result = 0, descuento = 0;
        // marca ABACO
        boolean esMarca = false, withoutIva = false;

        System.out.println("Digitar el presio del computador:");
        presioLaptop = Float.parseFloat(scanner.nextLine());

        System.out.println("es marca: ABACO ==>> Si: true | No: false");
        esMarca = Boolean.parseBoolean(scanner.nextLine());

        if (presioLaptop >= 1000000) {
            descuento = presioLaptop * 0.1f;
            withoutIva = true;
        }

        result = presioLaptop - descuento + (presioLaptop * (withoutIva ? 0 : iva)) - (esMarca ? descuentoAbaco : 0);
        System.out.println("Su presio total por el equipo de computo es:" + "\n" + result);
    }

    // question 16
    public void question16() {
        int sueldo = 0, hoursWorked = 0, pagoTotal = 0;

        System.out.println("Ingresar sueldo por hora de trabajo");
        sueldo = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresar el numero de horas trabajadas");
        hoursWorked = Integer.parseInt(scanner.nextLine());

        if (hoursWorked <= 48) {
            pagoTotal = hoursWorked * sueldo;
        }
        if (hoursWorked > 48 && hoursWorked < 80) {
            sueldo *= 2;
            pagoTotal = hoursWorked * sueldo;
        }
        if (hoursWorked >= 80) {
            sueldo *= 3;
            pagoTotal = hoursWorked * sueldo;
        }

        System.out.println("Sueldo total: " + pagoTotal);
    }

    // question 17
    public void question17() {
        float descuento = 0, priceBuy = 0;
        int quantityPears = 0;

        System.out.println("Digitar la cantidad de peras a comprar:");
        quantityPears = Integer.parseInt(scanner.nextLine());

        System.out.println("Digitar el presio por pera:");
        priceBuy = Integer.parseInt(scanner.nextLine());

        if (quantityPears <= 2)
            descuento = 0;
        else if (quantityPears <= 5)
            descuento = 0.1f;
        else if (quantityPears <= 10)
            descuento = 0.15f;
        else
            descuento = 0.18f;
        priceBuy = quantityPears * priceBuy * (1 - descuento);

        System.out.println("Cantidad de peras: " + quantityPears + "\nDescuento: " + (descuento * 100) + "%"
                + "\ntotal a pagar: " + priceBuy);
    }

    // question 18
    public void question18() {
        int salario = 0, op = 0;
        float percent = 0, salarioAnual = 0;
        String concat = "Digitar la cantidad de antiguedad en la empresa:\n";
        String antiguedad[] = new String[5];
        antiguedad[0] = decodeUTF_8("Menos de 1 año");
        antiguedad[1] = decodeUTF_8("1 año o más y menos de 2 años");
        antiguedad[2] = decodeUTF_8("2 años o más y menos de 5 años");
        antiguedad[3] = decodeUTF_8("5 años o más y menos de 10 años");
        antiguedad[4] = decodeUTF_8("10 años o más");

        System.out.println("Digitar el salario mensual");
        salario = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < antiguedad.length; i++) {
            concat += antiguedad[i] + ": " + i + " | ";
        }

        System.out.println(concat);
        op = Integer.parseInt(scanner.nextLine());

        switch (op) {
            case 0:
                percent = 0.05f;
                break;
            case 1:
                percent = 0.07f;
                break;
            case 2:
                percent = 0.1f;
                break;
            case 3:
                percent = 0.15f;
                break;
            case 4:
                percent = 0.2f;
                break;
        }
        salarioAnual = salario * 12;
        salarioAnual += salarioAnual * percent;

        System.out.println("Porcentaje del " + (percent * 100) + "%"
                + "\nSalario total anual con el porcentaje añadido: " + salarioAnual);
    }

    // question 19
    public void question19() {
        int price = 0, cantLlantas = 0;

        System.out.println("Digitar la cantidad de llantas");
        cantLlantas = Integer.parseInt(scanner.nextLine());

        price = cantLlantas < 5 ? 30000 : cantLlantas < 10 ? 25000 : 20000;

        System.out.println("Cantidad de llantas: " + cantLlantas + "\nPrecio por llanta individual:" + price
                + "\nTotal a pagar: " + (cantLlantas * price));
    }

    // question 20
    public void question20() {
        int age = 0, sex = 0, type = 0, nationality = 0;
        String questionNationality = decodeUTF_8("1: Latino | 2: Alemán | 3: Hindú | 4: Colombiano");
        String questionType = "1: Alto | 2: Bajo | 3: Mediano";
        String questionSex = "1: Hombre | 2: Mujer";
        float value = 0;

        //
        System.out.println("Digitar su Edad:");
        age = Integer.parseInt(scanner.nextLine());

        System.out.println("Digitar su Sexo: ==> " + questionSex);
        sex = Integer.parseInt(scanner.nextLine());

        System.out.println("Digitar su Tipo: ==> " + questionType);
        type = Integer.parseInt(scanner.nextLine());

        System.out.println("Digitar su Nacionalidad: ==> " + questionNationality);
        nationality = Integer.parseInt(scanner.nextLine());

        System.out.println("Su valor:");
        value = Float.parseFloat(scanner.nextLine());

        value = sex == 2 && type == 1 && age >= 35 || age <= 45 ? value * 3
                : sex == 1 && nationality == 1 && type == 3 && age < 30 ? value / 3
                        : sex == 2 && nationality == 3 && age > 55 ? value - 50000 : value;

        System.out.println("El valor resultante de la persona fue:\n" + value);
    }
}

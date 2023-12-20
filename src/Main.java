public class Main {
    public static void main(String[] args) {

        //1. Calcular el area de un circulo
        float radio=5, pi=3.1416f, area;
        area= (radio*radio)*pi;
        System.out.println("El area es: " +area);


        //2. Conversion de temperatura de Celsios a Fahrenheit
        float cel=20, fah;
        fah= (9/5f*cel)+32;
        System.out.println("La conversion C a F es: "+fah);


        //3. Volumen de una esfera
        float volu, radio2=3.50f, pi2=3.1416f;
        volu= (4/3f)*pi2*(radio2*radio2);
        System.out.println("El volumen de una esfera es: "+volu);


        //4. Operaciones matematicas
        float num1=10.20f, num2=4.20f,
                result1,
                result2,
                result3,
                result4;
        result1 = num1+num2;
        result2 = num1-num2;
        result3 = num1*num2;
        result4 = num1/num2;

        System.out.println("La suma es: "+result1);
        System.out.println("La resta es: "+result2);
        System.out.println("La multiplicacion es: "+result3);
        System.out.println("La division es: "+result4);


        //5. Conversion de moneda
        float cantidadDolares=20,tipoCambioDolarEuro=0.91f,cantidadEuros=20,tipoCambioEuroDolar=1.10f,resul1,resul2;

        //Cambio de dolar a euros
        resul1= cantidadDolares*tipoCambioDolarEuro;
        System.out.println("Cambio de dolares a euros es: "+resul1);

        //Cambio de euro a dolares
        resul2 = cantidadEuros/tipoCambioEuroDolar;
        System.out.println("Cambio de euros a dolares es: "+resul2);

    }
}
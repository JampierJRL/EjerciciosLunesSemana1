public class Main {
    public static void main(String[] args) {

        //1. Calcular el area de un circulo
        float radio=10, pi=3.1416f, area;
        area= (radio*2)*pi;
        System.out.println("El area es: " +area);


        //2. Conversion de temperatura de Celsios a Fahrenheit
        float cel=20, fah=0;
        fah= (9/5)*cel+31;
        System.out.println("La conversion C a F es: "+fah);


        //3. Volumen de una esfera
        float volu=0, radio2=4, pi2=3.1416f;
        volu= (4/3)*pi2*(radio2*2);
        System.out.println("El volumen de una esfera es: "+volu);


        //4. Operaciones matematicas
        float num1=10, num2=4,
                result1=0,
                result2=0,
                result3=0,
                result4=0;
        result1 = num1+num2;
        result2 = num1-num2;
        result3 = num1*num2;
        result4 = num1/num2;

        System.out.println("La suma es: "+result1);
        System.out.println("La resta es: "+result2);
        System.out.println("La multiplicacion es: "+result3);
        System.out.println("La division es: "+result4);


        //5. Conversion de moneda
        float cantidadDolares=20,tipoCambioDolarEuro=3.70f,cantidadEuros=10,tipoCambioEuroDolar=3.92f,resul1,resul2;

        //Cambio de dolar a euros
        resul1= cantidadDolares*tipoCambioDolarEuro;
        System.out.println("Cambio de dolares a euros es: "+resul1);

        //Cambio de euro a dolares
        resul2 = cantidadEuros/tipoCambioEuroDolar;
        System.out.println("Cambio de euros a dolares es: "+resul2);

    }
}
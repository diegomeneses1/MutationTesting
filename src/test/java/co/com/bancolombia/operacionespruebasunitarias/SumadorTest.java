package co.com.bancolombia.operacionespruebasunitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SumadorTest {

    @Test
    public void sumarDosNumeros() {
        //  Arrange
        Sumador sumador = new Sumador();
        double param1 = 4;
        double param2 = 2.5;
        double resultadoEsperado = 6.5;

        //  Act
        double resultado = sumador.sumar(param1, param2);

        //  Assert
        Assertions.assertEquals(resultado, resultadoEsperado);

    }

    @Test
    public void sumarArreglo() {
        //  Arrange
        Sumador sumador = new Sumador();
        double param[] = {1.2, 3, 10.1};
        double resultadoEsperado = 14.3;

        //  Act
        double resultado = sumador.sumar(param);

        //  Assert
        Assertions.assertEquals(resultado, resultadoEsperado);
    }

}

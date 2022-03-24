package es.curso;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        /*
            Hay 3 posibles estados de salida de una prueba unitaria:
                - EXITO
                - FALLO, la prueba no ha salido como se esperaba
                - EXPLOSION
            Se basan en el concepto de ASEVERACION: ASSERT
            Quiero asegurar que se cumple algo... 
                Si ese algo se cumple, doy la prueba por satisfecha
        */
    }

    
    @Test
    public void pruebaDoblar(){
        int resultado=App.doblar(5);
        assertEquals( resultado, 10 );
    }

    @Test
    public void pruebaDoblarCero(){
        int resultado=App.doblar(0);
        assertEquals( resultado, 0 );
    }
    @Test
    public void pruebaDoblarNegativo(){
        int resultado=App.doblar(-5);
        assertEquals( resultado, -10 );
    }

    @Test
    public void pruebaMayorPrimero(){
        int resultado=App.mayor(10, 5);
        assertEquals( resultado, 10 );
    }

    @Test
    public void pruebaMayorSegundo(){
        int resultado=App.mayor(5,10);
        assertEquals( resultado, 10 );
    }
    @Test
    public void pruebaMayorIguales(){
        int resultado=App.mayor(5,5);
        assertEquals( resultado, 5 );
    }
    @Test
    public void pruebaMayorNegativos(){
        int resultado=App.mayor(5,-10);
        assertEquals( resultado, 5 );
    }
    
    @Test
    public void pruebaMenorNegativos(){
        int resultado=App.menor(5,-10);
        assertEquals( resultado, -10 );
    }
    @Test
    public void pruebaMenorNumero1(){
        int resultado=App.menor(5,8);
        assertEquals( resultado, 5 );
    }
    @Test
    public void pruebaMenorNumero2(){
        int resultado=App.menor(5,2);
        assertEquals( resultado, 2 );
    }
    @Test
    public void pruebaMenorIguales(){
        int resultado=App.menor(5,5);
        assertEquals( resultado, 5 );
    }

    /*
        METODOLOGIA Test Driven Development
    */
}
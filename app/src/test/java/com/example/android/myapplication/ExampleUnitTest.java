package com.example.android.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void hombre_zapatilla_puma() {
        assertEquals(130.000, Metodos.calular(0, 0, 0), 0);
    }

    @Test
    public void hombre_zapatilla_adidas() {
        assertEquals(140.000, Metodos.calular(0, 0, 1), 0);
    }

    @Test
    public void hombre_zapatilla_nike() {
        assertEquals(120.000, Metodos.calular(0, 0, 2), 0);
    }

    @Test
    public void hombre_clasico_puma() {
        assertEquals(100.000, Metodos.calular(0, 1, 0), 0);
    }

    @Test
    public void hombre_clasico_adidas() {
        assertEquals(80.000, Metodos.calular(0, 1, 1), 0);
    }

    @Test
    public void hombre_clasico_nike() {
        assertEquals(50.000, Metodos.calular(0, 1, 2), 0);
    }

    @Test
    public void mujer_zapatilla_puma() {
        assertEquals(110.000, Metodos.calular(1, 0, 0), 0);
    }

    @Test
    public void mujer_zapatilla_adidas() {
        assertEquals(130.000, Metodos.calular(1, 0, 1), 0);
    }

    @Test
    public void mujer_Zapatilla_nike() {
        assertEquals(100.000, Metodos.calular(1, 0, 2), 0);
    }

    @Test
    public void mujer_clasico_puma() {
        assertEquals(120.000, Metodos.calular(1, 1, 0), 0);
    }

    @Test
    public void mujer_clasico_adidas() {
        assertEquals(70.000, Metodos.calular(1, 1, 1), 0);
    }

    @Test
    public void mujer_clasico_nike() {
        assertEquals(60.000, Metodos.calular(1, 1, 2), 0);
    }


    @Test
    public void hombre_zapatilla_puma_incorrecto() {
        assertNotEquals(230.000, Metodos.calular(0, 0, 0), 0);
    }

    @Test
    public void hombre_zapatilla_adidas_incorrecto() {
        assertNotEquals(240.000, Metodos.calular(0, 0, 1), 0);
    }

    @Test
    public void hombre_zapatilla_nike_incorrecto() {
        assertNotEquals(220.000, Metodos.calular(0, 0, 2), 0);
    }

    @Test
    public void hombre_clasico_puma_incorrecto() {
        assertNotEquals(200.000, Metodos.calular(0, 1, 0), 0);
    }

    @Test
    public void hombre_clasico_adidas_incorrecto() {
        assertNotEquals(280.000, Metodos.calular(0, 1, 1), 0);
    }

    @Test
    public void hombre_clasico_nike_incorrecto() {
        assertNotEquals(250.000, Metodos.calular(0, 1, 2), 0);
    }

    @Test
    public void mujer_zapatilla_puma_incorrecto() {
        assertNotEquals(210.000, Metodos.calular(1, 0, 0), 0);

    }
    @Test
    public void mujer_clasico_nike_incorrecto() {
        assertNotEquals(200.000, Metodos.calular(1, 1, 2), 0);
    }

}
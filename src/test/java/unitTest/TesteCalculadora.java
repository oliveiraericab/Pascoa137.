package unitTest;//Bibliotecas

import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Classe
public class TesteCalculadora {
    //Atributos

    //Funções e Métodos

    @Test
    public void testeSomarDoisNumeros(){

        //Configura
        //Valores de entrada
        double num1 = 7;
        double num2 = 5;
        // Valores de saída
        double resultadoEsperado = 12;

        //Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "20, 10, 30",
            "36, 2, 38",
            "10, 0, 10",
            "15, -5, 10"
    }, delimiter = ',')
    public void testeSomarDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado) {

        //Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        //Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/massaSomar.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeSomarDoisNumerosLendoArquivo(String txtNum1, String txtNum2, String resultadoEsperado) {

        //Configura: Os dados de entrada e saída vem da lista.

        //Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        //Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
    }

    @Test
    public void testeSubtrairDoisNumeros(){

        //Configura
        //Valores de entrada
        double num1 = 10;
        double num2 = 4;
        // Valores de saída
        double resultadoEsperado = 6;

        //Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }
    @ParameterizedTest
    @CsvSource(value = {
            "20, 10, 10",
            "36, 2, 34",
            "10, 0, 10",
            "15, -5, 20"
    }, delimiter = ',')
    public void testeSubtrairDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado) {

        //Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        //Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/subtrairDoisNumeros.csv", delimiter = ',')
    public void testeSubtrairDoisNumerosLendoArquivo(String txtNum1, String txtNum2, String resultadoEsperado) {

        //Configura: Os dados de entrada e saída vem da lista.

        //Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        //Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
    }
    @Test
    public void testeMultiplicarDoisNumeros() {

        //Configura
        //Valores de entrada
        double num1 = 7;
        double num2 = 5;
        // Valores de saída
        double resultadoEsperado = 35;

        //Executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "20, 10, 200",
            "36, 2, 72",
            "10, 0, 0",
            "15, -5, -75"
    }, delimiter = ',')
    public void testeMultiplicarDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado) {

        //Executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        //Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/multiplicarDoisNumeros.csv", delimiter = ',')
    public void testeMultiplicarDoisNumerosLendoArquivo(String txtNum1, String txtNum2, String resultadoEsperado) {

        //Configura: Os dados de entrada e saída vem da lista.

        //Executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        //Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
    }

    @Test
    public void testeDividirDoisNumeros() {

        //Configura
        //Valores de entrada
        double num1 = 75;
        double num2 = 3;
        // Valores de saída
        double resultadoEsperado = 25;

        //Executa
        double resultadoAtual = Calculadora.dividirDoisNumeros(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testeDividirDoisNumerosInteiros() {
        int numA = 8;
        int numB = 0;

        String resultadoEsperado = "Não é possível dividir por zero!";

        String resultadoAtual = Calculadora.dividirDoisNumerosInteiros(numA, numB);

        assertEquals(resultadoEsperado, resultadoAtual);
    }


}

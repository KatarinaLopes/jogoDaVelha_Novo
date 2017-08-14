/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.business;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Katarina
 */
public class TabuleiroTest {
    Tabuleiro t = new Tabuleiro(1);
    
    public TabuleiroTest() {
    }

    @Test
    public void deveTestarEstaCheioComTabuleiroVazioRetornandoFalse() {
        boolean resultado = t.estaCheio();
        
        assertFalse(resultado);
    }
    
    @Test
    public void deveTestarEstaCheioComTabuleiroComPrimeiraPecaNaoNulaRetornandoFalse(){
        t.setarCasaSelecionada(1);
        
        boolean resultado = t.estaCheio();
        
        assertFalse(resultado);
    }
    
    @Test
    public void deveTestarEstaCheioComTabuleiroCheioRetornandoTrue(){
        t.setarCasaSelecionada(1);
        t.setarCasaSelecionada(2);
        t.setarCasaSelecionada(3);
        t.setarCasaSelecionada(4);
        t.setarCasaSelecionada(5);
        t.setarCasaSelecionada(6);
        t.setarCasaSelecionada(7);
        t.setarCasaSelecionada(8);
        t.setarCasaSelecionada(9);
        
        boolean resultado = t.estaCheio();
        
        assertTrue(resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveTestarVerificarCasaSelecionadaPassandoCasaInvalida0RetornandoIllegalArgumentException(){
        t.verificarCasaSelecionada(0);
    }
    
    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaSelecionada1RetornandoTrue() {
        t.setEscolhidas(new int[9]);
        
        //Método testado
        t.setarCasaSelecionada(1);
        
        boolean resultado = t.verificarCasaSelecionada(1);
        
        assertTrue(resultado);
    }
    
    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaSelecionada2RetornandoTrue(){
        t.setarCasaSelecionada(2);
        
        boolean resultado = t.verificarCasaSelecionada(2);
        
        assertTrue(resultado);
    }
    
    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaSelecionada8RetornandoTrue(){
        t.setarCasaSelecionada(8);
        
        boolean resultado = t.verificarCasaSelecionada(8);
        
        assertTrue(resultado);
    }
    
    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaSelecionada9RetornandoTrue(){
        t.setarCasaSelecionada(9);
        
        boolean resultado = t.verificarCasaSelecionada(9);
        
        assertTrue(resultado);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deveTestarVerificarCasaSelecionadaPassandoCasaInvalida10RetornandoIllegalArgumentException(){
        t.verificarCasaSelecionada(10);
    }
    
    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaNaoSelecionada1RetornandoFalse(){
        t.setEscolhidas(new int[9]);
        
        boolean resultado = t.verificarCasaSelecionada(1);
        
        assertFalse(resultado);
    }
    
    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaNaoSelecionada2RetornandoFalse(){
        
        boolean resultado = t.verificarCasaSelecionada(2);
        
        assertFalse(resultado);
    }
    
    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaNaoSelecionada8RetornandoFalse(){
        
        boolean resultado = t.verificarCasaSelecionada(8);
        
        assertFalse(resultado);
    }

    @Test
    public void deveTestarVerificarCasaSelecionadaPassandoCasaNaoSelecionada9RetornandoFalse(){
        
        boolean resultado = t.verificarCasaSelecionada(9);
        
        assertFalse(resultado);
    }
    @Test
    public void deveTestarSetarCasaSelecionadaSetandoCasa1VerificandoSePosicaoCorrespondenteNaoENula() {
        t.setEscolhidas(new int[9]);
        t.setarCasaSelecionada(1);
        
        int resultado = t.getEscolhidas()[0];
        
        assertEquals(1, resultado);
    }
    
    @Test
    public void deveTestarSetarCasaSelecionadaSetandoCasa2VerificandoSePosicaoCorrespondenteNaoENula(){
        t.setarCasaSelecionada(2);
        
        int resultado = t.getEscolhidas()[1];
        
        assertEquals(2, resultado);
    }
    
    @Test
    public void deveTestarSetarCasaSelecionadaSetandoCasa8VerificandoSePosicaoCorrespondenteNaoENula(){
        t.setarCasaSelecionada(8);
        
        int resultado = t.getEscolhidas()[7];
        
        assertEquals(8, resultado);
    }
    
    @Test
    public void deveTestarSetarCasaSelecionadaSetandoCasa9VerificandoSePosicaoCorrespondenteNaoENula(){
        t.setarCasaSelecionada(9);
        
        int resultado = t.getEscolhidas()[8];
        
        assertEquals(9, resultado);
    }
    
    @Test
    public void deveTestarSetarPecaNoQuadroPassandoCasaValida1() {
        
        t.setarPecaNoQuadro(1, "X");
        
        Peca resultado = t.getQuadro()[0][0];
        
        assertNotNull(resultado);
    }
    
}

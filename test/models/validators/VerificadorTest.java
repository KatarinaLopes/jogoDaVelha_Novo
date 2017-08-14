/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.validators;

import models.business.Jogador;
import models.business.Jogo;
import models.business.Tabuleiro;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Katarina
 */
public class VerificadorTest {

    Verificador v;

    public VerificadorTest() {
        Jogo j = new Jogo(1, new Jogador(), new Jogador(), new Tabuleiro(1));

        v = new Verificador(j);
    }

    @Test
    public void deveTestarVerificarSeGanhouLinhaPassandoTabuleiroComLinhaPreenchidaIgualRetornando2() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(2, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");

        int r = v.verificarSeGanhouLinha(1);

        assertEquals(2, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouLinhaPasandoTabuleiroComLinhaComPrimeiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(2, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(0, r);

    }

    @Test
    public void deveTestarVerificarSeGanhouLinhaPasandoTabuleiroComLinhaComSegundoValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(2, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(0, r);

    }

    @Test
    public void deveTestarVerificarSeGanhouLinhaPasandoTabuleiroComLinhaComTerceiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(2, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(0, r);

    }

    @Test
    public void deveTestarVerificarSeGanhouLinhaPassandoTabuleiroComLinhaComPrimeiroValorSimboloDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(2, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");

        int r = v.verificarSeGanhouLinha(1);

        assertEquals(1, r);

    }

    @Test
    public void deveTestarVerificarSeGanhouLinhaPassandoTabuleiroComLinhaComSegundoValorSimboloDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(2, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");

        int resultado = v.verificarSeGanhouLinha(1);

        assertEquals(1, resultado);
    }

    @Test
    public void deveTestarVerificarSeGanhouLinhaPassandoTabuleiroComLinhaComTerceiroValorSimboloDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(2, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "O");

        int r = v.verificarSeGanhouLinha(1);

        assertEquals(1, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouColunaPassandoTabuleiroComColunaComValoresIguaisRetornando2() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(4, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(2, r);

    }

    @Test
    public void deveTestarVerificarSeGanhouColunaPassandoTabuleiroComColunaComPrimeiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(4, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(0, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouColunaPassandoTabuleiroComColunaComSegundoValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(4, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int result = v.verificarSeGanhouLinha(1);

        assertEquals(0, result);
    }

    @Test
    public void deveTestarVerificarSeGanhouColunaPassandoTabuleiroComColunaComTerceiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(4, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, " ");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(0, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouColunaPassandoTabuleiroComColunaComPrimeiroValorDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(4, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(1, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouColunaPassandoTabuleiroComColunaComSegundoValorDiferenteRetornando2() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(4, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(1, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouColunaPassandoTabuleiroComColunaComTerceiroValorDiferenteRetornando2() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(4, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "O");

        int r = v.verificarSeGanhouColuna(1);

        assertEquals(1, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouDiagonal00PassandoTabuleiroComDiagonalPreenchidaRetornando2() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(9, "X");

        int r = v.verificarSeGanhouDiagonal00();

        assertEquals(2, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouDiagonal00PassandoTabuleiroComDiagonalComPrimeiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(9, "X");

        int r = v.verificarSeGanhouDiagonal00();

        assertEquals(0, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouDiagonal00PassandoTabuleiroComDiagonalComSegundoValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(9, "X");

        int r = v.verificarSeGanhouDiagonal00();

        assertEquals(0, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouDiagonal00PassandoTabuleiroComDiagonalComTerceiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(9, " ");

        int r = v.verificarSeGanhouDiagonal00();

        assertEquals(0, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouDiagonal00PassandoTabuleiroComDiagonalComPrimeiroValorDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(9, "X");

        int r = v.verificarSeGanhouDiagonal00();

        assertEquals(1, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal00PassandoTabuleiroComDiagonalComSegundoValorDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(9, "X");

        int r = v.verificarSeGanhouDiagonal00();

        assertEquals(1, r);
    }

    @Test
    public void deveTestarVerificarSeGanhouDiagonal00PassandoTabuleiroComDiagonalComTerceiroValorDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(1, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(9, "O");

        int r = v.verificarSeGanhouDiagonal00();

        assertEquals(1, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal20PassandoTabuleiroComDiagonalPreenchidaRetornando2() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouDiagonal20();

        assertEquals(2, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal20PassandoTabuleiroComDiagonalComPrimeiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouDiagonal20();

        assertEquals(0, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal20PassandoTabuleiroComDiagonalComSegundoValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, " ");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouDiagonal20();

        assertEquals(0, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal20PassandoTabuleiroComDiagonalComTerceiroValorNuloRetornando0() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, " ");

        int r = v.verificarSeGanhouDiagonal20();

        assertEquals(0, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal20PassandoTabuleiroComDiagonalComPrimeiroValorDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouDiagonal20();

        assertEquals(1, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal20PassandoTabuleiroComDiagonalComSegundoValorDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "O");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "X");

        int r = v.verificarSeGanhouDiagonal20();

        assertEquals(1, r);
    }
    
    @Test
    public void deveTestarVerificarSeGanhouDiagonal20PassandoTabuleiroComDiagonalComTerceiroValorDiferenteRetornando1() {
        v.getJogo().getTabuleiro().setarPecaNoQuadro(3, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(5, "X");
        v.getJogo().getTabuleiro().setarPecaNoQuadro(7, "O");

        int r = v.verificarSeGanhouDiagonal20();

        assertEquals(1, r);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.validators;

import models.business.Jogador;
import models.business.Jogo;
import models.business.Peca;

/**
 *
 * @author Katarina
 */
public class Verificador {
    
    private Jogo jogo;

    @Deprecated
    public Verificador() {
    }

    public Verificador(Jogo jogo) {
        this.jogo = jogo;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    /**
     * This method receives an int <b>inical</b> which is the id of the initial play
     * of the verification. This method must verify the line of this mentioned play
     * by assimilating its symbols.
     * 
     * It returns 0 if there's a null value for a play, which means the "true table"
     * of the player won't be altered. If there's a different symbol of the player's
     * symbol, it'll return 1, which means the table must be altered. Although, if
     * it returns 2, it means that the line is already completed, which means victory
     * @param inicial
     * @return 0 to a null value, no alterations needed; 1 to a unmatch symbol,
     * alterations needed; 2 to victory.
     */
    public int verificarSeGanhouLinha(int inicial){
        String p1 = "", p2 = "", p3 = "";
        Peca[][] tabuleiro = jogo.getTabuleiro().getQuadro();
        
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if(tabuleiro[i][j].getId() == inicial){
                    p1 = tabuleiro[i][j].getSimbolo();
                    p2 = tabuleiro[i][j+1].getSimbolo();
                    p3 = tabuleiro[i][j+2].getSimbolo();
                    
                    break;
                }
                
            }
        } 
        
        return fazerVerificacaoComPecas(p1, p2, p3);
        
    }
    
    /**
     * This method receives an int <b>inical</b> which is the id of the initial play
     * of the verification. This method must verify the column of this mentioned play
     * by assimilating its symbols.
     * 
     * It returns 0 if there's a null value for a play, which means the "true table"
     * of the player won't be altered. If there's a different symbol of the player's
     * symbol, it'll return 1, which means the table must be altered. Although, if
     * it returns 2, it means that the column is already completed, which means victory
     * @param inicial
     * @return 0 to a null value, no alterations needed; 1 to a unmatch symbol,
     * alterations needed; 2 to victory.
     */       
    public int verificarSeGanhouColuna(int inicial){
        String p1 = "", p2 = "", p3 = "";
        Peca[][] tabuleiro = jogo.getTabuleiro().getQuadro();
        
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if(tabuleiro[i][j].getId() == inicial){
                    p1 = tabuleiro[i][j].getSimbolo();
                    p2 = tabuleiro[i+1][j].getSimbolo();
                    p3 = tabuleiro[i+2][j].getSimbolo();
                    
                    break;
                }                
            }
            
        }
        
        return fazerVerificacaoComPecas(p1, p2, p3);
    }
    
    /**
     * This method verify the first diagonal starting by [0][0] in the array.
     * 
     * It must return 0 if there's some play with a null value for the symbol, meaning
     * that no alterations are needed in the player's table; 1 if there's a symbol
     * whose value unmatch the player's symbol, meaning that an alteration on the
     * player's table is needed; or 2 if the diagonal is complete, meaning victory.
     * 
     * @return 0 to a null value, no alterations needed; 1 to an unmatch value, 
     * alterations needed; 2 to victory.
     */
    public int verificarSeGanhouDiagonal00(){
        Peca[][] tabuleiro = jogo.getTabuleiro().getQuadro();
        
        String p1 = tabuleiro[0][0].getSimbolo();
        String p2 = tabuleiro[1][1].getSimbolo();
        String p3 = tabuleiro[2][2].getSimbolo();
        
        return fazerVerificacaoComPecas(p1, p2, p3);
    }
    
    /**
     * This method verify the second diagonal starting by [2][0] in the array.
     * 
     * It must return 0 if there's some play with a null value for the symbol, meaning
     * that no alterations are needed in the player's table; 1 if there's a symbol
     * whose value unmatch the player's symbol, meaning that an alteration on the
     * player's table is needed; or 2 if the diagonal is complete, meaning victory.
     * 
     * @return 0 to a null value, no alterations needed; 1 to an unmatch value, 
     * alterations needed; 2 to victory.
     */
    public int verificarSeGanhouDiagonal20(){
        Peca[][] tabuleiro  = jogo.getTabuleiro().getQuadro();
        
        String p1 = tabuleiro[2][0].getSimbolo();
        String p2 = tabuleiro[1][1].getSimbolo();
        String p3 = tabuleiro[0][2].getSimbolo();
        
        return fazerVerificacaoComPecas(p1, p2, p3);
    }
    
    public int fazerVerificacaoComPecas(String p1, String p2, String p3){
        if(p1.equals(" ") || p2.equals(" ") || p3.equals(" ")){
            return 0;
        }else if(!p1.equals(p2) || !p1.equals(p3)){
            return 1;
        }else{
            return 2;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Katarina
 */
public class Jogador {
    private int id;
    private String nome;
    private String simbolo;
    private int jogadas;
    private int jogadasSucedidas;
    private boolean[][] tabelaVerificacao = new boolean[3][5];

    @Deprecated
    public Jogador() {
    }

    public Jogador(int id, String nome, String simbolo) {
        this.id = id;
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getJogadas() {
        return jogadas;
    }

    public void setJogadas(int jogadas) {
        this.jogadas = jogadas;
    }

    public int getJogadasSucedidas() {
        return jogadasSucedidas;
    }

    public void setJogadasSucedidas(int jogadasSucedidas) {
        this.jogadasSucedidas = jogadasSucedidas;
    } 
   
    public int realizarJogada(int casa, String simbolo, Tabuleiro tabuleiro){
        
        if(tabuleiro.verificarCasaSelecionada(casa)){
            return 0; //Erro 0 - Casa já selecionada
        }
        
        tabuleiro.setarCasaSelecionada(casa);
        tabuleiro.setarPecaNoQuadro(casa, simbolo);
        
        return 1; //Código 1 - Jogada realizada;
        
    }
}

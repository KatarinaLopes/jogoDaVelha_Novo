/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Scanner;

/**
 *
 * @author Katarina
 */
public class Jogo {

    private int id;
    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;
    private static int vez;

    @Deprecated
    public Jogo() {
    }

    public Jogo(int id, Jogador jogador1, Jogador jogador2, Tabuleiro tabuleiro) {
        this.id = id;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = tabuleiro;
    }

    public int getId() {
        return id;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void jogar(int casa) {

        if (vez == 0) {
            int resultado = jogador1.realizarJogada(casa, jogador1.getSimbolo(), tabuleiro);

            if (resultado == 0) {
                System.out.println("Esta casa já foi selecionada!!!");
            } else {
                vez++;
            }
        }else if (vez == 1) {
            int resultado = jogador2.realizarJogada(casa, jogador2.getSimbolo(), tabuleiro);

            if (resultado == 0) {
                System.out.println("Esta casa já foi selecionada!!!");
            } else {
                vez--;
            }
        }

    }
    
    
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         
         Tabuleiro t = new Tabuleiro(1);
         
         Jogo j = new Jogo(1, new Jogador(1, "amor", "X"), new Jogador(2, "ódio", "O"), t);
         
         while(!j.getTabuleiro().estaCheio()){
             //System.out.println(j.getTabuleiro().imprimirTabuleiro());
             j.jogar(s.nextInt());
             System.out.println(j.getTabuleiro().imprimirTabuleiro());
         }
        
    }

}

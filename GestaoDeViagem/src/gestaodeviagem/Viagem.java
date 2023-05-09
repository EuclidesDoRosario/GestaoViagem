/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeviagem;

import java.util.Date;


/**
 *
 * @author Ulai
 */
public class Viagem {
    private int IDviagem;
    private Date data_partida;
    private Date data_chegada;
    private String ponto_partida;
    private String ponto_chegada;
    private float preco;
    
    public Viagem(int id, Date dp, Date dc, String pp, String pc, float p) {
        this.IDviagem = id;
        this.data_partida = dp;
        this.data_chegada = dc;
        this.ponto_partida = pp;
        this.ponto_chegada = pc;
        this.preco = p;
    }
    
    public void setID(int IDviagem) {
        this.IDviagem = IDviagem;
    }
    
    public int getID() {
        return this.IDviagem;
    }

    public void print() {
        System.out.println("==============================================");                
        System.out.println("ID: " + this.IDviagem );
        System.out.println("Data Partida: " + this.data_partida);
        System.out.println("Data Chegada: " + this.data_chegada);
        System.out.println("Ponto Partida: " + this.ponto_partida);
        System.out.println("Ponto Chegada: " + this.ponto_chegada);
        System.err.println("Preco: " + this.preco + "€");
    }
    
}

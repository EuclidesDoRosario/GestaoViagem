/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeviagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ulai
 */
public class Aluno {
    private int nCC;
    private String nome;
    private int tel;
    private List<Integer> listaViagens = new ArrayList<Integer>();
    
    public Aluno( int nCC,String nome, int tel){ 
        this.nCC = nCC;
        this.nome = nome;
        this.tel = tel;
    }
    
    public void setID(int nCC){
        this.nCC = nCC;
    }
    
    public void setNome(String nome){
        this.nome = nome;
       
    }
    
    public void setTel(int tel){
        this.tel = tel;
    }
    
    public int getID(){ 
        return this.nCC;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getTel(){
        return this.tel;
    }
    
    public void adicionar_viagem(int IDviagem) {
        
        Viagem viagem = new Viagem(nCC, null, null, nome, nome, nCC);
        
    }
    
    public void remover_viagem(int IDviagem) {
            
    }
    
    public void print() {
        System.out.println("================================================");
        System.out.println("Numero Cartao de Cidadao: " + this.getID());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTel());
    }
    
}
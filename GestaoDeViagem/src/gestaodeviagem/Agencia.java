/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeviagem;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.crypto.Data;

/**
 *
 * @author Ulai
 */
public class Agencia {
    
    private static List<Aluno> listaAlunos = new ArrayList<Aluno>();
    private List<Viagem> listaViagem = new ArrayList<Viagem>();
    private List<Inscricao> listInscricao = new ArrayList<Inscricao>();
    

    public static void inserir_aluno(int nCC, String nome, int tel) {
        Aluno aluno = new Aluno(nCC, nome, tel);
        listaAlunos.add(aluno);
    }
    
    public void inserir_viagem(int IDviagem, Date dataIn,Date dataOut, String partida, String chegada, float preco) {
        Viagem viagem = new Viagem(IDviagem, dataIn, dataIn, partida, partida, preco);
        listaViagem.add(viagem);
    }
    
    public void remover_viagem(int IDviagem) {
        Viagem viagem = find_viagem(IDviagem);
        
        if (viagem != null) {
            listaViagem.remove(viagem);
        }
    }
    
    public void remover_aluno(int nCC) {
        Aluno aluno = find_aluno(nCC);
        
        if (aluno != null){
            listaAlunos.remove(aluno);
        }
        
    }
    
    public Viagem find_viagem(int IDviagem) {
        for (Viagem viagem: listaViagem) {
            if(viagem.getID() == IDviagem) {
                return viagem;
            }
        }
        return null;
    }
    
    public Aluno find_aluno(int nCC) {
        
        for (Aluno aluno: listaAlunos) {
            if(aluno.getID() == nCC) {
                return aluno;
            }
        }
        return null;
    }
    
    public void inscrever_aluno_viagem(int nCC, int IDViagem) {
        
        //adicionar_viagem
        //inscrver_aluno
        
        Inscricao inscricao = new Inscricao(IDViagem, nCC);
        listInscricao.add(inscricao);
        
    }
    
    public void remover_insclicao_aluno(int nCC,int IDviagem) {
        
        //remover_incricao
        //remover_viagem
        
        for (Inscricao inscricao : listInscricao) {
            if(inscricao.getIDaluno() == nCC && inscricao.getIDaluno() == IDviagem) {
                listInscricao.remove(inscricao);
            }
        }   
    }
    
    public int verificar_n_inscricoes_viagem(int IDviagem) {
        
        int numeroIncricoes = 0;
        
        for (Inscricao inscricao: listInscricao) {
            if(inscricao.getIDviagem() == IDviagem) {
                numeroIncricoes += 1;
            }
        } 
        
        return numeroIncricoes;
    }
    
    
    public void listar_viagens() { 
        for (Viagem viagem: listaViagem) {
            viagem.print();
        } 
    }
    
    public void listar_Alunos() {
        for (Aluno aluno: listaAlunos) {
            aluno.print();
        }
    }
    
    public void consultar_viagens_aluno(int nCC) {
       
        Viagem viagem;
        
        for (Inscricao inscricao: listInscricao) {            
            if(inscricao.getIDaluno() == nCC) {                
                viagem = find_viagem(inscricao.getIDviagem());                
                viagem.print();
            }   
        }
    }

}

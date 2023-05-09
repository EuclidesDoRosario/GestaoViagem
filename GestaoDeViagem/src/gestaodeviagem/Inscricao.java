/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeviagem;

import java.util.Date;
import sun.util.resources.LocaleData;

/**
 *
 * @author Ulai
 */
public class Inscricao {
    private Date data;
    private boolean pago;
    private int IDviagem; //cahve estrageira da viagem
    private int IDaluno;  //cahve estrageira da aluno
                          // Porconta do relacionamento muito para muito do Aluno e Viage
    
    public Inscricao(int IDviagem, int IDaluno){
        this.IDviagem = IDviagem;
        this.IDaluno = IDaluno;
        this.data = new Date(); //verificar
        this.pago = false;
    }
    
    public Date getData() {
        return this.data;
    }
    
    public boolean getPago() {
        return this.pago;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    public int getIDviagem() {
        return this.IDviagem;
    }
    
    public int getIDaluno() {
        return this.IDaluno;
    }
    
}

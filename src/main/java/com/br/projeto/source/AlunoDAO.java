/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.source;

/**
 *
 * @author kelvinPompeu
 */
public class AlunoDAO {
    
    public boolean Cadastrar_Aluno(Aluno a){
        System.out.print("Cadastra aluno");
        if (a.getNome() == null){
            return false;
        }else{
            return true;
        }
    }
    
}

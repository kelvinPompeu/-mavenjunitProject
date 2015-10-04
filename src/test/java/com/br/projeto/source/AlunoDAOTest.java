/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.source;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kelvinPompeu
 */
public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Cadastrar_Aluno method, of class AlunoDAO.
     */
    @Test
    public void testCadastrar_Aluno() {
        System.out.println("Cadastrar_Aluno");
        AlunoDAO dao = new AlunoDAO();
        Aluno a = new Aluno();
        a.setNome("Kelvin");
        assertTrue(dao.Cadastrar_Aluno(a));
    }
    
}

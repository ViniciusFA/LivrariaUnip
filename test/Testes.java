/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import TrabalhoAlpooLivraria.Codigo.Livro;
import VIEW.TelaMenuPrincipal;
import TrabalhoAlpooLivrariaJDBC.LivroJDBC;
import java.sql.SQLException;

/**
 *
 * @author viniciusfa
 */
public class Testes {
    
    public static void main(String[] args) {
        LivroJDBC con = new LivroJDBC();
        TelaMenuPrincipal tmp= new TelaMenuPrincipal();
        tmp.setVisible(true);
    }
    
}

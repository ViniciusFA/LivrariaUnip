/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivrariaDAO;

import TrabalhoAlpooLivraria.Codigo.Incluir;
import TrabalhoAlpooLivraria.Codigo.Livro;
import java.util.ArrayList;

/**
 *
 * @author viniciusfa
 */
public interface Dao {
    
    public ArrayList listarLivro(Livro l);
    public ArrayList buscarTitulo(Livro l);
    public ArrayList buscarNomeAutor(Livro l);
    public ArrayList buscarSobrenomeAutor(Livro l);
    public ArrayList buscarNomeEdit(Livro l);
    
    public void cadastrarLivro(Livro l);
    public void alterarLivro(Livro l);
    public void excluirLivro(Livro l);

}

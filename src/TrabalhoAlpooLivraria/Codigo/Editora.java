/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivraria.Codigo;

/**
 *
 * @author viniciusfa
 */
public class Editora {
    private int idEditora;
    private String nome;
    private String url;

    public Editora() {
        super();
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Editora{" + "idEditora=" + idEditora + ", nome=" + nome + ", url=" + url + '}';
    }

   
    
    
    
    
}

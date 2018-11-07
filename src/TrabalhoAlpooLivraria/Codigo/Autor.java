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
public class Autor {
    
    private int idAutor;
    private String nome;
    private String Fnome;

    public Autor() {
        super();
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getFnome() {
        return Fnome;
    }

    public void setFnome(String Fname) {
        this.Fnome = Fnome;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nome=" + nome + ", Fnome=" + Fnome + '}';
    }
    
    
    
    
    
}

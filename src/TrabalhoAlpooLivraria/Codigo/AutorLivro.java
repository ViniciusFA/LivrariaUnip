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
public class AutorLivro {
    private int isbn;
    private int idAutor;
    private int seqNum;

    public AutorLivro() {
        super();
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(int seqNum) {
        this.seqNum = seqNum;
    }

    @Override
    public String toString() {
        return "AutorLivro{" + "isbn=" + isbn + ", idAutor=" + idAutor + ", seqNum=" + seqNum + '}';
    }
    
    
    
    
}

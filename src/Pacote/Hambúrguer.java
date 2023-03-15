package Pacote;

public class Hambúrguer {
    public String nome;
    public Double valor;
    public Boolean artesanal;

    public Boolean seArtesanal(Boolean artesanal){
        this.artesanal = artesanal;

        return this.artesanal;
    }

    public Double valor(Double valor){
        this.valor = valor;
        if(artesanal == true){
            this.valor += 8.00;
        }
        return this.valor;
    }
    public String nome(String nome){
        return this.nome;
    }
}

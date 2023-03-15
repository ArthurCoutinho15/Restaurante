package Pacote;

public class Pizza {
    public String nome;
    public Double valor;
    public Boolean borda;

    public Double CalculaValor(Double valor){
        this.valor = valor;
        if(borda == true){
            this.valor += 5.00;
        }
        return this.valor;

    }
    public Boolean SeBorda(Boolean borda){
        this.borda = borda;

        return this.borda;
    }

    public String nome(String nome){
        return this.nome;
    }
}

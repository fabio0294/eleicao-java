package Pessoas;


public class Eleitor {

    private String nomeEleitor;
    private String numeroTitulo;
    private String dataNascimento;


    public Eleitor(String nomeEleitor, String numeroTitulo, String dataNascimento) {
        this.nomeEleitor = nomeEleitor;
        this.numeroTitulo = numeroTitulo;
        this.dataNascimento = dataNascimento;
    }
    public String getNomeEleitor() {
        return nomeEleitor;
    }
    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }
    public String getNumeroTitulo() {
        return numeroTitulo;
    }
    public void setNumeroTitulo(String numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "\nDados do Eleitor" +
                "\nEleitor: " + nomeEleitor +
                "\nTítulo de Eleitor: " + numeroTitulo +
                "\nData de Nascimento: " + dataNascimento; 
    }
}
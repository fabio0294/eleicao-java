package Pessoas;

public class Candidato {

    private String nomeCandidato;
    private String partidoPolitico;
    private int idade;
    private int votos = 0;

    public String toString() {
        return "\nDados do Candidato" +
                "\nCandidato: " + this.nomeCandidato +
                "\nPartido Politico: " + this.partidoPolitico +
                "\nIdade: " + this.idade +
                "\nVotos: " + this.votos;
        
    }

    public void votar(){
        this.votos ++;
    }

    public Candidato(String nomeCandidato, String partidoPolitico, int idade) {
        this.nomeCandidato = nomeCandidato;
        this.partidoPolitico = partidoPolitico;
        this.idade = idade;
    }

    public String getNomeCandidato() {
        return this.nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getPartidoPolitico() {
        return this.partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getVotos() {
        return this.votos;
    }
}
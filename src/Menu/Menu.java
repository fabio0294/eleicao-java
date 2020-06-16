package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pessoas.Candidato;
import Pessoas.Eleitor;

public class Menu {

    public static void main(String[] args) {
    	
        List<Candidato> candidatoList = new ArrayList<Candidato>();
        List<Eleitor> eleitorList = new ArrayList<Eleitor>();
    	
    
    		int op=1;
    	
    		
    		Scanner ler = new Scanner(System.in);
    		while(op != 0)
    		{
    			System.out.println("\nFavor, escolher uma Opção");
    			System.out.println("1-Cadastrar Candidato");
    			System.out.println("2-Cadastrar Eleitor");
    			System.out.println("3-Votar");
    			System.out.println("4-Estatísticas");
    			System.out.println("0-Sair");
    			op = ler.nextInt();
    			
    			switch(op){
    			
	    			case 0:
	    				System.out.println("Saiu do Sistema!!!");
	    				System.exit(0);
	    				break;
	    			
	    			case 1: 
	    				System.out.printf("Digite o nome do candidato: ");
	    				String nomeCandidato = ler.next();
	    				
	    				System.out.printf("Digite o partido do candidato: ");
	    				String partidoPolitico = ler.next();
	    				
	    				System.out.printf("Digite a idade do candidato: ");
	    				int idade = ler.nextInt();

	    				
	    				candidatoList.add(new Candidato(nomeCandidato, partidoPolitico, idade));
	    			  
	    				break;
	    				
	    			case 2:
	    				System.out.printf("Digite o nome do eleitor: ");
	    				String nomeEleitor = ler.next();
	    				
	    				System.out.printf("Digite o numero do eleitor: ");
	    				String numeroEleitor = ler.next();
	    				
	    				System.out.printf("Digite a data de nascimento do eleitor: ");
	    				String dataNascimento = ler.next();

	    				
	    				eleitorList.add(new Eleitor(nomeEleitor, numeroEleitor, dataNascimento));
	    			  
	    				break;
	    				
	    			case 3:
	    				int contador = 0;
	    				for(Candidato candidato: candidatoList) {
	    					contador++;
	    					System.out.println("Candidato " + contador);
	    					
	    					System.out.println("\nNome: " + candidato.getNomeCandidato());
	    					System.out.println("\nPartido: " + candidato.getPartidoPolitico());
	    					System.out.println("\nIdade: " + candidato.getIdade());
	    					System.out.println("\n--------------------------------\n");	    					
	    				}
	    				
	    				System.out.printf("Digite o numero do candidato que deseja votar: ");
	    				int voto = ler.nextInt();
	    				
    					candidatoList.get((voto-1)).votar();
    					
	    				break;
	    				
	    			case 4:
	    				Candidato jovem = candidatoList.get(0);
	    				Candidato velho = candidatoList.get(0);
	    				Candidato maisVotado = candidatoList.get(0);
	    				Candidato menosVotado = candidatoList.get(0);
	    				int totalVotos = 0;
	    				
	    				for(Candidato candidato: candidatoList) {
	    				
	    					if(candidato.getIdade() < jovem.getIdade()) {
	    						jovem = candidato;
	    					}
	    					
	    					if(candidato.getIdade() > velho.getIdade()) {
	    						velho = candidato;
	    					}
    					
	    					
	    					if(candidato.getVotos() < menosVotado.getVotos()) {
	    						menosVotado = candidato;
	    					}
	    					
	    					if(candidato.getVotos() > maisVotado.getVotos()) {
	    						maisVotado = candidato;
	    					}
	    					
	    					totalVotos += candidato.getVotos();	
    					}	    				

	    				System.out.println("\nCANDIDATO MAIS JOVEM: " + jovem.toString());
	    				System.out.println("\nCANDIDATO MAIS VELHO: " + velho.toString());
	    				System.out.println("\nCANDIDATO MENOS VOTADO: " + menosVotado.toString());
	    				System.out.println("\nCANDIDATO MAIS VOTADO: " + maisVotado.toString());
	    				System.out.println("\nTOTAL DE VOTOS: " + totalVotos);
	    				System.out.println("\nMEDIA DE VOTOS: " + (totalVotos / candidatoList.size()));
	    				
	    				break;

	    			default: 
	    				System.out.println("Opção Invalida!");
	    				break;
    			}
    		}
    }
}

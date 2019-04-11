package cachorros;

import java.util.ArrayList;
import java.util.Random;

public class Cachorros {

    static final String LATIDO = " \'barks!'.";
    private int idade;
    private String nome;

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
   
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    Cachorros(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println(this.getNome()+"\t has been spawned...");
    }//fim construtor

    public static void main(String[] args) {
        //lista de nomes...
        String[] listaNomes = new String[]{"Prometeus", "Goliath", "Thor", "Titan", "Colossus"};

        //lista de idades...
        int[] listaIdades = new int[5];

        //preenche lista de idades aleatoriamente...
        Random IDADE_ALEATORIA = new Random();
        for(int i = 0; i < listaIdades.length; i++){
            listaIdades[i] = IDADE_ALEATORIA.nextInt(12);// 12 media de vida cachorro;            
        }//fim for preenche lista de idades aleatoriamente...
        
        //lista de cahorros(objetos)...
        ArrayList<Cachorros> listaCachorros = new ArrayList();
        for(int i=0; i < 5 ; i++){
            listaCachorros.add(new Cachorros(listaNomes[i],listaIdades[i]));            
        }
        
        System.out.println("\n");
        
        //for mostra idades e nomes
        for(Cachorros i: listaCachorros){
            System.out.println(i.getNome() + " disse" + LATIDO);
            System.out.println("ele tem "+i.getIdade()+" anos\n");
        }//fim for mostra iade nome
    
        
    }// fim main...
    
}//fim class


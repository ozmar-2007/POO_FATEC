package cachorros;

import java.util.ArrayList;
import java.util.Random;

class Cachorros {

    static final String LATIDO = "barks!\n";
    private int idade;
    private String nome;

    public String getNome{
        return this.nome;
    }

    public int getIdade{
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
        System.out.println(LATIDO);
    }//fim construtor

    public static void main(String[] args) {
        //lista de nomes...
        String[] listaNomes = new String[]{"Prometeus", "Goliath", "Thor", "Titan", "Colossus"};
        //lista de idades...
        int[] listaIdades = new int[5];
        //preenche lista idades aleatoriamente...
        private static final Random IDADE_ALEATORIA = new Random
        for(int i = 0;i < listaIdades.lenght;i++){
            listaIdades[i] = IDADE_ALEATORIA.nextInt(12);// 12 media de vida cachorro;            
        }//fim for...
        
        //lista de cahorros(objetos)...
        ArrayList<Cachorros> listaCachorros = new ArrayList<Cachorros>();
        for(int i; listaCachorros){
            listaCachorros.add(new Cachorros(listaNomes[i],listaIdade[i]));            
        }
        
        
        //for mostra iade nome
        for(int i; listaCachorros){
            System.out.println(listaCachorro[i].getNome()+"disse"+ LATIDO);
            System.out.println("ele tem %d anos",listaCachorro[i].getidade());
        }//fim for mostra iade nome
    
        
    }// fim main...

}// fim classCachoro


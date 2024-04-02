
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Projeto {
    
    public static void main(String[] args) {
        ArrayList <BemInformada> pessoab = new ArrayList<>(); 
        //cria um array list onde serão armazenadas as pessoas 
        
        Mundo m = new Mundo(); //cria o mundo (matriz 30x60) onde ocorrerá a animação
        
        Date tempo = new Date();
        
        //variáveis que armazenam a quantidade de pessoas bem e mal informadas0
        int quantFake = 0;
        int quant = 0;
        
        //cria as pessoas e as armazena na lista 
        for(int i = 0; i<100; i++){
            pessoab.add(new BemInformada(i));
            
        }
        
        
        while(true){
            //cria a matriz
            m.refazMp();
            for(int i = 0; i<pessoab.size();i++){
                pessoab.get(i).move(); // faz as pessoas se moverem dentro do mapa (mundo)
                
            }
            
            quant =0;
            quantFake = 0;
            
            //chama a função que verifica a colisaão das pessoas e adiciona os IDs nas agendas
            m.adicionaMp(pessoab);
            //loop de contagem
            for (int i = 0; i < pessoab.size(); i++) {
                if(pessoab.get(i).getCor() == 6){
                    quantFake++;
                }
                else{
                    quant++;
                }
            }
            
            Date time = new Date();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("********************");
            System.out.println("Timer: "+ (time.getTime() - tempo.getTime())/1000 + "segundos."); //mostra o tempo em que a animação está rodando
            System.out.println();
            System.out.println("Total de pessoas: " + (int)pessoab.size() + "      "); // mostra o total de pessoas criadas
            System.out.println("\u001b[44m \033[0m Pessoas bem informadas: " // exibe o total de bem informadas
                + quant);
            System.out.println("\u001b[41m \033[0m Pessoas mal Informadas: " +quantFake); //exibe o total de mal informadas
            System.out.println();
            System.out.println("********************");
            System.out.println();
            System.out.println();
            
            m.desenhaMundo();
            
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
}

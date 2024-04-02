
import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pessoa implements Move {
    private Random nAleatorio = new Random();
    
    private int x;
    private int y;
    private int velocidade = 1;
    private int cor;
    private int ID;
    ArrayList <Integer> Agenda = new ArrayList();
    
    public void addAgenda(int ID){
        Agenda.add(ID);
    }

    public ArrayList<Integer> getAgenda() {
        return Agenda;
    }

    public void setAgenda(ArrayList<Integer> Agenda) {
        this.Agenda = Agenda;
    }
    
    
    public Pessoa(int ID){
        setX(nAleatorio.nextInt(30));
        setY(nAleatorio.nextInt(60));
        setID(ID);
    }

    public Random getnAleatorio() {
        return nAleatorio;
    }

    public void setnAleatorio(Random nAleatorio) {
        this.nAleatorio = nAleatorio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void move(){
        int mover = nAleatorio.nextInt(4);
        switch (mover){
            case 0: //sobe
                y -= getVelocidade();
                if(y<0){
                    y+=60;
                    
                }
                if(y>59){
                    y-=60;
                    
                }
                break;
            
            case 1: //desce
                y+= getVelocidade();
                if(y<0){
                    y+=60;
                }
                if(y>59){
                    y-=60;
                }
                break;
            
            case 2: //direita
                x+= getVelocidade();
                if(x<30){
                    x+=30;
                }
                if(x>29){
                    x-=30;
                }
                break;
            
            case 3: //esquerda
                x-= getVelocidade();
                if(x<30){
                    x+=30;
                }
                if(x>29){
                    x-=30;
                }
                break;
            default:
                break;
        }
    }
    
}

package matrizes;
import java.util.Random;


// @author TioLen

public class Matrizes01 {
    
    public static void main(String[] args) {
        int[][] matriz=new int[0][100];
        
        
        
        matrizFunc(matriz);
    }
    
    public static void aleatorio( int m[][]){
        
    }
    
    
    
    public static void matrizFunc( int m[][]){
        
        
                
        for(int i=0; i < m.length; i++){ // indice i anda na linha
            
            for(int j=0; j < m[0].length; j++){ // indice j anda na coluna
                
                 System.out.print("digite o elemento matriz["+i+"]["+j+"]:");
                 
                 m[i][j]=(int) Math.random();
            }
        }
        int num =  m.length*m[0].length;
    }
}

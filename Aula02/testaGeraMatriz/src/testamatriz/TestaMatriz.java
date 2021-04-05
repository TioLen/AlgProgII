
package testamatriz;

import java.util.Random;
import java.util.Scanner;


public class TestaMatriz {
    public static void main(String[] args) {
        // declara uma variavel que sera uma matriz
        int matriz[][];
        int lin,col; //quantidade de linhas e colunas
        Scanner ler = new Scanner (System.in); //leitura
        
        System.out.println("Digite o nr de lin");
        lin = ler.nextInt(); // lê quantidade de linhas
        System.out.println("digite o nr de col");
        col = ler.nextInt(); //lê quantidade de colunas
        
        matriz = geraMatriz (lin,col);  // invoca a função geraMatriz e bota nela
                                        // os valores lin e col definidos aqui para
                                        // que ela trabalhe em sua fórmula.
        
        imprimeMatriz( matriz );        // chama função imprimeMatriz e "matriz" será utilizada na função chamada.
    }
    
    //função para gerar matriz de números aleatórios, retorna um valor inteiro
    public static int [][] geraMatriz( int lin, int col){
        
        int mat[][]; //declara a variável que recebe os valores lin e col citados no parâmetro acima
        
        mat = new int[lin][col]; //aloca na matriz os valoers de lin e col:
        
        Random random = new Random(); // cria um gerador de nuns randoms:
         
        //for (int[] mat1 : mat) {
        for (int i = 0; i < mat.length; i++) {
            
            
            for (int j = 0; j < mat[0].length; j++) { // indice i anda na linha
                // anda na coluna
                
                
                mat[i][j] = random.nextInt(100); // gera um numero aleatorio
                //mat1[j] = random.nextInt(100); // gera um numero aleatorio
            }
        }
        return mat;
    }
    // fiz uma impressora de matriz, uau
    public static void imprimeMatriz(int m[][]){
        
        
        //for (int[] m1 : m) {
        for (int i = 0; i < m.length; i++) {
            
            
            // indice i anda na linha
            for (int j = 0; j<m[0].length; j++) {
                // indice j anda na coluna
                
                
                //System.out.printf("%3d", m1[j]);
                System.out.printf("%3d", m[i][j]);
                
            }
            System.out.println();
        }
    
}
    }
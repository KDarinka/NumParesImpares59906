/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares59906;

/**
 *
 * @author carri
 */
public class NumParesImpares59906 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        int SumPar = 0;
        int SumImp = 0;
        
        while (n <101){
            if (n % 2== 0){
              SumPar = (SumPar + n);  
            }
            else if (n % 2 != 0){
                SumImp = n + SumImp;
            }
            ++n;
        }
        System.out.println("La suma de los numeros pares es: " + SumPar);
        System.out.println("La suma de los numeros impares es: " + SumImp);
      
    }
    
}

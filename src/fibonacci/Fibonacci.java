/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
/**
 *
 * @author yasuri
 */
public class Fibonacci {

    //Recursivo
    public static int Recursivo (int n) {
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
	if (n == 1 || n == 2) {
			return 1;
		}
		}
	return Recursivo(n-2) + Recursivo(n-1);
	}
    
    
    
    
    //Memoized///
    int[] cache;

    Fibonacci(int[] cache){
        this.cache = cache;
    }

    int fibonacci(int n) {
        if (cache[n] == 0) {
            if (n < 2) cache[n] = n;
            else cache[n] = fibonacci(n-1) + fibonacci( n-2);
            System.out.print(cache[n] + " ");
        }
        return cache[n];
        
       
    }
    
    
    
    
    //Botton-Up///
    int fibonacciB(int n) {
        int[] cacheB = new int[n+1];
        cacheB[0] = 0;
        cacheB[1] = 1;

        for (int i = 2; i <= n; i++) {
            cacheB[i] = cacheB[i-1] + cacheB[i-2];
            System.out.print(cacheB[i] + " ");
        }

        return cacheB[n];
    }
	
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Recursivo
       int maxNumber = 10;
	System.out.print ("serie " + maxNumber + " numero: ");
	for(int i = 0; i < maxNumber; i++){
			System.out.print(Recursivo(i) +" ");
		}
        System.out.println();
        
        //Memoized
         
        int z = 9;
        System.out.println("ultimo numero: " + new Fibonacci(new int[z+1]).fibonacci(z));

        //Botton-Up
        int nu = 10;
        System.out.println("Ultimo numero: " + new Fibonacci(new int[nu]).fibonacciB(z));
    }
    
}

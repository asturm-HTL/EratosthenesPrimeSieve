/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.eratosthenesprimesieve;

import net.htlgrieskirchen.asturm.eratosthenesprimesieve.PrimeSieve;

/**
 *
 * @author asturm
 */
public class EratosthenesPrimeSieve implements PrimeSieve
{      
        
    //------------------------Constructor--------------------------
        public EratosthenesPrimeSieve(int upperBorder)
        {
             isPrime(upperBorder);
        }
    //-------------------------------------------------------------
        
    //---------------------abstract methods------------------------
        @Override
        public boolean isPrime(int p) 
        {
            
            boolean prime[] = new boolean[p+1];
            
            for(int i = 2; i <= p; i++)
            {
                prime[i] = true;
            }
            
            for(int j = 2; j <= Math.sqrt(p); j++)
            {
                if(prime[j])
                {
                    for(int k = j; k*j <= p; k++)
                    {
                        prime[k*j] = false;
                    }
                }
            }
            
            for(int x = 2; x<=p; x++)
            {
                if(prime[x]) 
                {
                    System.out.println(x + " ");
                }
            }
            return true;
            
        }
        
        
        @Override
        public void printPrimes() 
        {

            
            
        }
    //-------------------------------------------------------------
        
    //------------------------------main-----------------------------
        public static void main(String[] args) 
        {
            EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(100);
            
        }
    //---------------------------------------------------------------
    

    
}

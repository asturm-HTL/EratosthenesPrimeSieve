/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.eratosthenesprimesieve;

import net.htlgrieskirchen.asturm.git.eratosthenesprimesieve.PrimeSieve;

/**
 *
 * @author asturm
 */
public class EratoshenesPrimeSieve implements PrimeSieve 
{

//-----------------------Interface-----------------------------
        public interface PrimeSieve
        {
            //Überprüft ob p eine Primzahl ist oder nicht.
                public boolean isPrime(int p);
            //Gibt alle Primzahlen bis zur Obergrenze auf der Konsole aus.
                public void printPrimes();
        }
    //-------------------------------------------------------------

        int upperBorder;
        
    //------------------------Constructor--------------------------
        public EratoshenesPrimeSieve(int upperBorder)
        {
            this.upperBorder = upperBorder;
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
        }

        @Override
        public void printPrimes() 
        {

            
            
        }
    //-------------------------------------------------------------
    

    
}

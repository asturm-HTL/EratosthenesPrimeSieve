/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.eratosthenesprimesieve;

import java.util.ArrayList;
import net.htlgrieskirchen.asturm.eratosthenesprimesieve.PrimeSieve;

/**
 *
 * @author asturm
 */
public class EratosthenesPrimeSieve implements PrimeSieve
{      
        
    ArrayList primeList = new ArrayList();
    
    //------------------------Constructor--------------------------
        public EratosthenesPrimeSieve(int upperBorder)
        {
             isPrime(upperBorder);
             naturalNumberDivider(upperBorder);
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
                                primeList.add(x);
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
    
    //----------------NaturalNumbersXPrimeNumbers--------------------
        
        public void naturalNumberDivider(int m)     
        {
            //m ist Obergrenze
            int x = 0;
            int y = 0;
            
            for(int i = 2; i < m; i+=2)
            {
                   
                if(primeList.contains(i))
                {
                    System.out.println(i + " = " + i);
                    
                }
                else
                {
                    int zwischenspeicher = i;
                    int zwischenspeicher2 = i;
                    for(int j = zwischenspeicher2; j!= 0; j-=1)
                    {
                        if(primeList.contains(j))
                        {
                           if(primeList.contains(zwischenspeicher - j))
                           {
                            y = zwischenspeicher - j;
                            x = j;
                            System.out.println(i + " = " + x + " + " + y);
                           }
                           
                            
                           
                            zwischenspeicher2 = 0;
                        }
                        
                        
                    }
                    
                }
            }
                
        }
    }


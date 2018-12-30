/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author jdiamond
 */
public class Book {
    public int number;
    public String name;
   
    
    public Book (int theNum, String theName)
    {
        number = theNum;
        name = theName;
    }
    
    public int getNum ()
    {
        return number;
    }
    
    public String getName ()
    {
        return name;
    }
    
    
}

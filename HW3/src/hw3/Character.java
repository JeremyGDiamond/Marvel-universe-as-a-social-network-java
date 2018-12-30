/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.*;
/**
 *
 * @author jdiamond
 */
public class Character {
    
    //.memeber vars
    public int number;
    public String name;
    public int spiderNum = 7;//grater then the diamoiter of the graph
    public ArrayList connections = new ArrayList();//will be made of bools
    
    
    public Character (int theNum, String theName)
    {
        number = theNum;
        name = theName;
        for (int i = 0; i <= 12942; i++ )
        {
            connections.add(false);// places bools in arraylist
        }
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

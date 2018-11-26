/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_assignment.BG_COLOR;

/**
 *
 * @author Janek
 */
public class BACKGROUND_COLOR {
        
    public static java.awt.Color color; 
    
    public BACKGROUND_COLOR()
    {
        setColor(255, 255, 255);
    }
    
    public static void setColor(java.awt.Color col)
    {
        color = col;
    }
    
    public static void setColor(int r, int g, int b)
    {
        if((r>0 && r<256) && (g>0 && g<256) && (b>0 && g<256))
        {
            setColor(new java.awt.Color(r, g, b));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_assignment.Controller;

/**
 *
 * @author Janek
 */
class UserInputHolder {
    private boolean ans;
    private char charAns;
    
    public boolean getBooleanValue()
    {
        return ans;
    }
    
    public void setBooleanValue(boolean ans)
    {
        this.ans = ans;
    }
    
    public void setCharacter(char x)
    {
        charAns = x;
    }
    
    public char getCharacter()
    {
        return charAns;
    }
}

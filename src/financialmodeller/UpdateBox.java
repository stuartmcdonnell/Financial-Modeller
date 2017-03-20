/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialmodeller;

import javax.swing.JTextArea;

/**
 *
 * @author Stuart
 */
public class UpdateBox extends JTextArea{
    
    public void update(String message){
        this.append("\n..."+message);
    } 
}

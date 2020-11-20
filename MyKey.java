/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author pc
 */
public class MyKey extends Applet {

    int x=10;
    int y=70;
    @Override
    public void init() {
        this.addKeyListener(
        
                new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                

            }

            @Override
            public void keyPressed(KeyEvent e) {
               if( e.getKeyCode()  == KeyEvent.VK_LEFT)
               {
                 x=x-10;
                     if(x<= 0){x=getWidth();}
               }     
                if( e.getKeyCode()  == KeyEvent.VK_RIGHT)
               {
                 x=x+10;
                 if(x>= getWidth()){x=0;}
               } 
                  if( e.getKeyCode()  == KeyEvent.VK_UP)
               {
                 y=y-10;
                  if(y<= 0){y=getHeight();}
               } 
                    if( e.getKeyCode()  == KeyEvent.VK_DOWN)
               {
                 y=y+10;
                 if(y>= getHeight()){y=0;}
               } 
                    repaint();
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
                    
                }
        );
    }

    @Override
    public void paint (Graphics g)
    {
        g.drawString("jav", x, y);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;
import model.animado;

/**
 *
 * @author gato
 */
public class dibujartodo extends JComponent{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private animado anima;

       public dibujartodo(JComponent contenedor,JPanel j){
                 super();
       this.setBounds(0, 0,contenedor.getWidth() , contenedor.getHeight());
       contenedor.add(this);
       anima= new animado(j);
       }
       
       public void cuadraelpanel(JPanel t){
       anima.setPanel(t);
       }
        public boolean llevarfalse(){
       return anima.isChocapuerta();
       }
       public void animacion(){
       anima.animacion();
       }
       public boolean isalivehilo(){
      return anima.getHilo2().isAlive();
       }
       
         @Override
    public void paint(Graphics g){
        super.paint(g);
        anima.paint(g);
    }
         
         public void animarchochapuerta(){
         anima.setChocapuerta(true);
         }
          public void noanimarchochapuerta(){
         anima.setChocapuerta(false);
         }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgm2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author xaxbe
 */
public class FigurasGM2 {
    double Area;
    DecimalFormat Decim = new DecimalFormat("#00000.00000");
    public void Circulo(double Rad){
    Area = Math.PI*Math.pow(Rad,2);
    
    }
    public void Cuadrado(double Lad){
        Area = Lad * Lad;
        
    }
    public void Triangulo(double Base, double Alt){
        Area = (Base * Alt) / 2;
        
    }
    public void Rectangulo(double Base2, double Alt2){
        Area = Base2* Alt2;
        
    }
    public void Esfera(double Rad2){
        Area = 4 *(Math.PI)*Math.pow(Rad2,2);
        
    }
    public void Cubo(double Lad2){
        Area = 6 * Math.pow(Lad2, 2);
        
    }

    public void Resultado (){
        JOptionPane.showMessageDialog(null,"El area da la figura es: "+ Decim.format(Area)+"\n");
    }
    


    
}

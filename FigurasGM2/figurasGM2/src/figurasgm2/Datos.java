/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgm2;

import javax.swing.JOptionPane;

/**
 *
 * @author xaxbe
 */
public class Datos {
    int Rad,Lad,Base,Alt,Rad2,Lad2;
    double Base2,Alt2;
    int opcion;
    FigurasGM2 Fig = new FigurasGM2();
    public void Proceso (){
        opcion=Integer.parseInt(JOptionPane.showInputDialog("escoge alguna figura en la cual quiera conocer su area\n"
                +"1 para el circulo\n"
                +"2 para el circulo\n"
                +"3 para el circulo\n"
                +"4 para el circulo\n"
                +"5 para el circulo\n"
                +"6 para el circulo\n"));
        
        switch (opcion) {
            case 1:
                Rad = Integer.parseInt(JOptionPane.showInputDialog("cual es el radio del circulo?\n"));
                Fig.Circulo(Rad);
                break;
            case 2:
                Lad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto mide cada lado del cuadrado?\n"));
                Fig.Cuadrado(Lad);
                break;
            case 3:
                Base=Integer.parseInt(JOptionPane.showInputDialog("¿Cual el la medida de la base del triangulo?\n"));
                Alt=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es la altura del triangulo?\n"));
                Fig.Triangulo(Base,Alt);
                break;
            case 4:
                Base2=Double.parseDouble(JOptionPane.showInputDialog("¿Cual el la medida de la base del rectangulo?\n"));
                Alt2=Double.parseDouble(JOptionPane.showInputDialog("¿Cual el la medida de la base del triangulo"));
                Fig.Rectangulo(Base2, Alt2);
                break;
            case 5:
                Rad2=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el radio de tus esfera?\n"));
                Fig.Esfera(Rad2);
                break;
            case 6:
                Lad2=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto mide los lados del cuadrado?\n"));
                Fig.Cubo(Lad2);
                break;
            default:
                break;
        }
    Fig.Resultado();
    }
}

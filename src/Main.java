
import cm_circulo.CM_Circulo;
import cm_circulo.CM_Rectangulo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlamorales
 */
public class Main {
    public static void main(String[] args){
        
    // instanciamos un cuadrado y un circulo
    
    CM_Circulo circulo1 = new CM_Circulo(3, 4, "verde");
    CM_Rectangulo rectangulo1 = new CM_Rectangulo(3, 5, 5, "rojo");
    
    
    //calcula area cuadrado ladoA * ladoB
    double ladoA = rectangulo1.getLadoA();
    double ladoB = rectangulo1.getLadoB();
    double area1 = ladoA * ladoB;
    System.out.println("Area cuadrado: " + area1);
    
    
    // calcular area circulo pi*R2
    double radio1 = circulo1.getRadio();
    double area2 = radio1*3.14;
    System.out.println("Area circulo: " + area2);
    
    //diferencia entre areas de rectangulo y circulo
    double diferencia = area1-area2;
    System.out.println("Diferencia areas: " + diferencia);
    
    
    // imprimir datos
    
    System.out.println("rectangulo: "+ rectangulo1);
    System.out.println("Circulo: "+ circulo1);
    System.out.println("Diferencia: "+ diferencia);
    
    } 
    
}

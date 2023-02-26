/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion14;
import java.util.Scanner;

/**
 *
 * @author kkmie
 */
public class EjercicioN14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double num;
        double result[];
        
        System.out.println("Ingrese el número a operar:");
        num = entrada.nextDouble();
        result = cuadrado_cubo(num);
        
        System.out.println("El cuadrado de " + num + " es: " + result[0]);
        System.out.println("El cubo de " + num + " es: " + result[1]);
    }
    
    static double[] cuadrado_cubo(double num){
        double cuadrado_cubo[] = new double[2];
        cuadrado_cubo[0] = Math.pow(num, 2);
        cuadrado_cubo[1] = num*cuadrado_cubo[0];
    
        return cuadrado_cubo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class Television extends Electrodomestico {
    double resolución;
    boolean sintonizadorTDT;
    final double RESOLUCION = 20;
    final boolean SINTONIZADORTDT = false;

    public Television(double precio, double peso) {
        super(precio, peso);
        this.resolución =  RESOLUCION;
        this.sintonizadorTDT = SINTONIZADORTDT;
        
    }

    public Television(double resolución, boolean sintonizadorTDT, double precioBase, double peso, String color, char consumoEnergetico) {
        super( precioBase,  peso,  color,  consumoEnergetico);
        this.resolución = resolución;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television() {
        super();
        this.resolución =  RESOLUCION;
        this.sintonizadorTDT = SINTONIZADORTDT;
        
    }

    public double getRESOLUCION() {
        return RESOLUCION;
    }

    public boolean isSINTONIZADORTDT() {
        return SINTONIZADORTDT;
    }
    
    //precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene
    //un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase
    //Electrodomestico también deben afectar al precio.
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (resolución > 40) {
            precioFinal = precioFinal*1.3;
            
        }
        if (sintonizadorTDT) {
            precioFinal = precioFinal + 50;
            
        }
        return precioFinal;
    }
    
    
    
    
    
    
    
}

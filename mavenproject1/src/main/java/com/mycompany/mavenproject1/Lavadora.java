/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class Lavadora extends Electrodomestico {
    
    final double CARGA = 5;
    
    public double carga;
    
   

    public Lavadora() {
        super();
        this.carga = CARGA;
       
        
    }
    public Lavadora(double peso, double precio){
        super(precio, peso);
        this. carga = CARGA;
    }
    public Lavadora (double precioBase, double peso, String color, char consumoEnergetico,double carga){
        super( precioBase,  peso,  color,  consumoEnergetico);
        this.carga = carga;
        
    }

    public double getCarga() {
        return carga;
    }
    public double precioFinal(){
       
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal = precioFinal + 50;
        }
        
        return precioFinal;
        
    }
    
    
    
    
    
}

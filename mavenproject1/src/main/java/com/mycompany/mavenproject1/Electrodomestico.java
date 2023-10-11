/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author tarde
 */
public class Electrodomestico {
    double precioBase;
    String color;
    char consumoEnergetico;
    double peso;
    
    final static double PRECIOBASE = 100;
    final static String COLOR = "blanco";
    final static char CONSUMOENERGETICO = 'F';
    final static double PESO = 5;

    public Electrodomestico() {
        this. precioBase = PRECIOBASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.peso = PESO;
    }
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    
    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this. precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    private char comprobarConsumoEnergetico(){
        char consumo = Character.toLowerCase(consumoEnergetico);
        
        switch (consumo) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                break;
                
                
            default:
                return CONSUMOENERGETICO;
                
        }
        return 0;
        
  
    }
    
    String comprobarColor(String color){
        switch (color.toLowerCase()) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color ;
                
                
                
            default:
                return COLOR;
    }
}

    private double precioFinal(){
        
        
        double precioConsumo;       
        switch (consumoEnergetico) {
            case 'a': precioConsumo = 100; break;
            case 'b': precioConsumo = 80; break;
            case 'c': precioConsumo = 60; break;
            case 'd': precioConsumo = 50; break;
            case 'e': precioConsumo = 30; break;
            case 'f': precioConsumo = 10; break;
                
                
            default:
                precioConsumo = 0; break;
        }
        double precioPorPeso = 0;
        if (peso >= 0 && peso < 20) {
            precioPorPeso = 10;
            
            
        }else if(peso >= 20 && peso < 50){
            precioPorPeso = 50;
            
        }else if(peso >= 50 && peso < 80){
            precioPorPeso = 80;
            
        }else if(peso >= 80){
            precioPorPeso = 100;
        }
        double precioFinal = precioBase + precioConsumo + precioPorPeso;
        return precioFinal;

}
    
}    
    



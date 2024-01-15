/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public class Coche {
    
    //Creaión de atributos encapsulados
    private int numRuedas;
    private float cv;
    private String matricula;
    
    //Constructor parametrizado
    public Coche(int numRuedas, float cv, String matricula) {
        this.numRuedas = numRuedas;
        this.cv = cv;
        this.matricula = matricula;
    }
    
    //Constructor por defecto
    public Coche(){
        
    }
    
    //Añadimos getter y setter

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public float getCv() {
        return cv;
    }

    public void setCv(float cv) {
        this.cv = cv;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}

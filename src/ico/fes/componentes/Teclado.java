/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author elies
 */
public class Teclado {
    private String marca;
    private int numeroTeclas;

    public Teclado() {
    }

    public Teclado(String marca, int numeroTeclas) {
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + '}';
    }
    
    
}

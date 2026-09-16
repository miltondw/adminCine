/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admincine;

/**
 *
 * @author milton
 */
public class Funcion {

    private String codigo;
    private String pelicula;
    private String hora;
    private boolean[] puestos;
    private int numeroPuestos = 20;

public Funcion(String codigo, String pelicula, String hora) {
        this.codigo = codigo;
        this.pelicula = pelicula;
        this.hora = hora;
        this.puestos = new boolean[numeroPuestos]; 
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getHora() {
        return hora;
    }

    public boolean[] getPuestos() {
        return puestos;
    }

    public boolean comprarPuesto(int numeroPuesto) {
        int i = numeroPuesto - 1;
        if (i >= 0 && i < numeroPuestos) {
            if (!puestos[i]) {
                puestos[i] = true;
                return true;
            }
        }
        return false;
    }

    public int getCantidadOcupados() {
        int cantidad = 0;
        for (boolean puesto : puestos) {
            if (puesto) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int getCantidadDisponibles() {
        return numeroPuestos - getCantidadOcupados();
    }
}

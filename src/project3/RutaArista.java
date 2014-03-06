/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author josehernandez
 */
public class RutaArista {

    ////Atributos////
    private String airline;
    private double cost;

    public RutaArista(String airline, double cost) {
        this.airline = airline;
        this.cost = cost;
    }

    public String getAirline() {//Retorna la aerolinea
        return airline;
    }

    public double getCost() {//Retorna el costo de traversar la arista
        return cost;
    }

    @Override
    public String toString() {
        return airline + ", $" + cost;
    }

}

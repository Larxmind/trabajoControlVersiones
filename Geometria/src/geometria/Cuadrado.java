/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 * 29/11/2021
 * v 1.01
 */
/**
 * Clase donde se implementan los atributos y métodos para calcular el área de
 * un cuadrado.
 * @author alumnado
 * @version 1.0
 * @since 30/12/2021
 */
public class Cuadrado implements FiguraGeometrica
{
    private double lado;
    private double areaCuadrado;
    
    /**
     * Método constructor de la clase cuadrado
     * @param lado del cuadrado
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    /**
     * Método consultor del atribulo lado
     * @return Lado
     */
    public double getLado() 
    {
        return lado;
    }
    
    /**
     * Método modificador de lado 
     * @param lado Lado del cuadrado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    
    /**
     * Consultor del atributo areCuadrado
     * @return areaCuadrado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Operacion {
    private String Nombre;
    private Integer Monto;
    private Character Tipo; 
    //Ingreso //Gasto   
    public Operacion(String nombre, Integer monto, Character tipo) 
    {
        this.Nombre = nombre;
        this.Monto = monto;
        this.Tipo = tipo;
    }
    public String getNombre() 
    {
        return Nombre;
    }
    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }
    public Integer getMonto() 
    {
        return Monto;
    }
    public void setMonto(Integer Monto)
    {
        this.Monto = Monto;
    }
    public Character getTipo(){
        return Tipo;
    }
    public void setTipo(Character Tipo) {
        this.Tipo = Tipo;
    }
}

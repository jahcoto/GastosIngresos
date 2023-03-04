/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.awt.List;
import java.util.ArrayList;
import java.util.Objects;
public class Movimientos {
    
    private String Nombre;
    private ArrayList<Operacion> Info;
    
    public Movimientos()
    {
        this.Nombre = "Personal";
        this.Info = new ArrayList<Operacion>();
    }
    
    public void RegistrarOperacion(Operacion operacion)
    {
        //Almacena en la lista una operacion
        Info.add(operacion);
    }
    
    public int TotalIngresos()
    {
        Integer total = 0;        
        for (Integer i = 0; i < Info.size(); i++)
        {
            Character tipo = Info.get(i).getTipo();
            if (tipo == 'I')
            {
                total = total + Info.get(i).getMonto();
            }            
        }        
        return total;
    }
    
    public Integer TotalGastos()
    {
        Integer total = 0;
        for (Integer i = 0; i < Info.size(); i++)
        {
            Character tipo = Info.get(i).getTipo();
            if (tipo == 'G')
            {
                total = total + Info.get(i).getMonto();
            }            
        }
        return total;
    }
    
    public Integer Saldo(Integer TotalGastos, Integer TotalIngresos)
    {
        Integer Total = 0;
        Integer g = TotalGastos;
        Integer i = TotalIngresos;
        Total = i - g;
        return Total;
    }    
}

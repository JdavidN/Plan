package modelo;

public class Plan
{
    //--------------
    //Atributos
    //--------------
    private int telefono;
    private int totalMinutos;
    private int costoPlan;
    private String operador;
   

    //--------------
    //Metodos
    //--------------

    public Plan(int i, int j, int k, String string) {
    }

    //Constructor por defecto
    public void Telefonia()
    {
        telefono= 0;
        totalMinutos= 0;
        costoPlan=0;
        operador= "";
    }

    //Contructor Común u Ordinario 
    public void Telefonia( int tel, int min, int precio, String opera)
    {
        this.telefono = tel;
        this.totalMinutos = min;
        this.costoPlan= precio;
        this.operador= opera;
    }

    //Constructor de copia
    public void Telefonia(Telefonia f)
    {
        telefono = f.telefono;
        totalMinutos = f.totalMinutos;
        costoPlan = f.costoPlan;
        operador = f.operador;
    }

    // Metodos de acceso
    public int getTelefono()
    {
        return telefono;
    }
    public void setTelefono(int telefono)
    {
        this.telefono= telefono;
    }
    public int getTotalMinutos()
    {
        return totalMinutos;
    }
    public void setTotalMinuto(int totalMinutos)
    {
        this.totalMinutos= totalMinutos;
    }
    public int getCostoPlan()
    {
        return costoPlan;
    }
    public void setCostoPlan(int costoPlan)
    {
        this.costoPlan= costoPlan;
    }
    public String getOperador()
    {
        return operador;
    }






    public String toString()
    {
        return telefono +"/" +  calcularPlan(); 
    }

    //calcular
    public Double calcularPlan()
    {
        
        double Plan= costoPlan*totalMinutos;
        if (operador.equals("Movilujo"))
        {
          Plan = Plan - Plan*0.5;
        }
        return Plan;

    }




}
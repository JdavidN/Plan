package ejecutable;

import controlador.Controlador;
import modelo.Plan;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Plan miModelo = new Plan(0, 0, 0, "");
        Controlador miControlador = new Controlador(miVentana, miModelo);
    }
        //Telefonia f1 = new Telefonia(313338008,15,80000,"Movillijo");
        //System.out.println("telefono 1: " + f1);
        //Telefonia f2 = new Telefonia(313338008, 300, 100, "Movilujo");
        //System.out.println("telefono 2: " + f2);
    }


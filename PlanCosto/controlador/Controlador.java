package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Plan;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //--------------
    //Atributos
    //--------------
    private VentanaPrincipal vista;
    private Plan modelo;

    //--------------
    //Metodos
    //--------------

    //Metodo constructor
    public Controlador(VentanaPrincipal pVista, Plan pModelo)
    {
        this.vista = pVista;
        this.modelo = pModelo;
        this.vista.miPanelOperaciones.btHallar.addActionListener(this);
        this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
        this.vista.miPanelOperaciones.btSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comando generado [hallar, borrar, salir]
        String comando = ae.getActionCommand();

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
        if(comando.equals("borrar"))
        {
            this.vista.miPanelEntradaDatos.borrar();
            this.vista.miPanelResultados.borrar();
        }

        if(comando.equals("hallar"))
        {
            modelo.setTelefono(Integer.parseInt(vista.miPanelEntradaDatos.getTfTelefono()));
            modelo.setTotalMinuto(Integer.parseInt(vista.miPanelEntradaDatos.getTfTotalMinuto()));
            modelo.setCostoPlan(Integer.parseInt(vista.miPanelEntradaDatos.getTfCosotoPlan()));
            modelo.setOperador(Integer.parseInt(vista.miPanelEntradaDatos.getTfOperador()));
            modelo.calcularPlan();
            vista.miPanelResultados.mostrarResultado(modelo.getPlan());
        }
    }
}

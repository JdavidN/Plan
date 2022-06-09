package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //--------------------
    // Atributos
    //--------------------
    private JLabel lTelefono;
    private JLabel lTotalMinutos;
    private JLabel lCostoPlan;
    private JLabel lOperador;
    private JLabel lImagen;
    private ImageIcon iImagen;
    private JTextField tfTelefono;
    private JTextField tfTotalMinutos;
    private JTextField tfCostoPlan;
    private JTextField tfOperador;

    //--------------------
    // Métodos
    //--------------------

    /*Método constructor*/
    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar imagen
        iImagen = new ImageIcon(getClass().getResource("mayor.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(10,50,128,128);
        this.add(lImagen);

        //Crear y agregar etiqueta Telefono
        lTelefono = new JLabel("Telefono = ");
        lTelefono.setBounds(240, 30, 120, 20);
        this.add(lTelefono);

        //Crear y agregar caja de texto Telefono
        tfTelefono = new JTextField();
        tfTelefono.setBounds(360, 30, 80, 20);
        this.add(tfTelefono);

        //Crear y agregar etiqueta TotalMinutos
        lTotalMinutos = new JLabel("Numero de Minutos = ");
        lTotalMinutos.setBounds(240, 70, 120, 20);
        this.add(lTotalMinutos);

        //Crear y agregar caja de texto TotalMinutos
        tfTotalMinutos = new JTextField();
        tfTotalMinutos.setBounds(360, 70, 80, 20);
        this.add(tfTotalMinutos);

        //Crear y agregar etiqueta  CostoPlan
        lCostoPlan = new JLabel("Costo del Plan = ");
        lCostoPlan.setBounds(240, 105, 120, 20);
        this.add(lCostoPlan);

        //Crear y agregar caja de texto CostoPlan
        tfCostoPlan = new JTextField();
        tfCostoPlan.setBounds(360, 105, 80, 20);
        this.add(tfCostoPlan);

        //Crear y agregar etiqueta Operador
        lOperador = new JLabel("Operador = ");
        lOperador.setBounds(240, 150, 120, 20);
        this.add(lOperador);

        //Crear y agregar caja de texto Operador
        tfOperador = new JTextField();
        tfOperador.setBounds(360, 150, 80, 20);
        this.add(tfOperador);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // Métodos de acceso a la informacion

    public String getTfOperador() {
        return tfOperador.getText();
    }

    public String getTfCosotoPlan() {
        return tfCostoPlan.getText();
    }

    public String getTfTotalMinuto() {
        return tfTotalMinutos.getText();
    }

    public String getTfTelefono() {
        return tfTelefono.getText();
    }


    // Metodo borrar cajas de text
    public void borrar()
    {
        tfTelefono.setText("");
        tfTotalMinutos.setText("");
        tfCostoPlan.setText("");
        tfOperador.setText("");
    }
}
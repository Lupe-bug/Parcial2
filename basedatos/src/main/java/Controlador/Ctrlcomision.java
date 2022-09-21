/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Comision;
import Modelo.consultas;
import Vista.frmcomision;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author barah
 */

//las intrucciones para que podamos detectar la activación de los botones
//enviar los valores de la caja de texto y insertar a la base de datos 

public class Ctrlcomision implements ActionListener { //Ctrl es d econtrolador
    
    private Comision mod;
    private consultas modC;   //aqui estamos llamando las clases 
    private frmcomision frm;

    public Ctrlcomision(Comision mod, consultas modC, frmcomision frm) {
        this.mod = mod;
        this.modC = modC;    //aqui tenemos el contructor y igualamos las variables
        this.frm = frm;
        
        //es necesario declarar los acction para los botenes aqui los llamamos mediante la vista.
        this.frm.botbuscar.addActionListener(this);
        this.frm.boteliminar.addActionListener(this);
        this.frm.botlimpiar.addActionListener(this);
        this.frm.botmodificar.addActionListener(this);
         
    }

    //metodo para poder arrancar la vista
    // no recibe nada pero va a establecer el titulo para el formulario
    public void iniciar()
    {
        frm.setTitle("Comisiones");
        frm.setLocationRelativeTo(null); // es la localizacion que sera centrado 
        frm.txtnum.setVisible(false);// aqui volvemos invisible la etiqueta idd o num 
    }
    
    //metodos que van a escuchar los clic de los botones
    @Override
    public void actionPerformed (ActionEvent e)
    {
       if (e.getSource()== frm.botmodificar) //el if dectectara boton presionado 
                                             //si se presiona este boton agarrara los valores d elas cajas de texto y metera al modelo
                                            //y asi llamara al metodo de cada boton y modificara la base de datos
       {
           mod.setNum(Integer.parseInt(frm.txtnum.getText()));
           mod.setIDvendedor(Integer.parseInt(frm.txtid.getText()));
           mod.setNomvendedor(frm.txtnombre.getText());
           mod.setEnero(Integer.parseInt(frm.txtenero.getText()));
           mod.setFebrero(Integer.parseInt(frm.txtfebrero.getText()));
           mod.setMarzo(Integer.parseInt(frm.txtmarzo.getText()));
           mod.setAbril(Integer.parseInt(frm.txtabril.getText()));
           mod.setMayo(Integer.parseInt(frm.txtmayo.getText()));
           mod.setJunio(Integer.parseInt(frm.txtjunio.getText()));
         
           if (modC.modificar(mod))
           {
               JOptionPane.showMessageDialog(null, "registro modificado");
               limpiar();
           }else
           {
               JOptionPane.showMessageDialog(null, "Error modificado");
               limpiar();
           }   
       }
       
       
        if (e.getSource()== frm.boteliminar) //el if dectectara boton presionado 
                                             //si se presiona este boton agarrara los valores d elas cajas de texto y metera al modelo
                                            //y asi llamara al metodo de cada boton y modificara la base de datos
       {
           mod.setIDvendedor(Integer.parseInt(frm.txtid.getText()));
          
         
           if (modC.eliminar(mod))
           {
               JOptionPane.showMessageDialog(null, "registro eliminado");
               limpiar();
           }else
           {
               JOptionPane.showMessageDialog(null, "error al borrar");
               limpiar();
           }   
       }
       
        
        
         if (e.getSource()== frm.botbuscar) //el if dectectara boton presionado 
                                             //si se presiona este boton agarrara los valores d elas cajas de texto y metera al modelo
                                            //y asi llamara al metodo de cada boton y modificara la base de datos
       {
           mod.setIDvendedor(Integer.parseInt(frm.txtid.getText()));
          
         
           if (modC.buscar(mod))
           {
               frm.txtnum.setText(String.valueOf(mod.getNum()));
               frm.txtid.setText(String.valueOf(mod.getIDvendedor()));
               frm.txtnombre.setText(mod.getNomvendedor());
               frm.txtenero.setText(String.valueOf(mod.getEnero()));
               frm.txtfebrero.setText(String.valueOf(mod.getFebrero()));
               frm.txtmarzo.setText(String.valueOf(mod.getMarzo()));
               frm.txtabril.setText(String.valueOf(mod.getAbril()));
               frm.txtmayo.setText(String.valueOf(mod.getMayo()));
               frm.txtjunio.setText(String.valueOf(mod.getJunio()));
               
      
           }else
           {
               JOptionPane.showMessageDialog(null, "error al encontrar");
               limpiar();
           }   
       }
        
        
    
        if (e.getSource()== frm.botlimpiar)
        {
             limpiar();
        }
        
        
       
       
    }
    
    public void limpiar ()
    {
        frm.txtabril.setText(null);
        frm.txtenero.setText(null);
        frm.txtfebrero.setText(null);
        frm.txtid.setText(null);
        frm.txtjunio.setText(null);
        frm.txtmarzo.setText(null);
        frm.txtmayo.setText(null);
        frm.txtnombre.setText(null);
        frm.txtnum.setText(null);
        frm.txtsuma.setText(null);
    }
    
    
}

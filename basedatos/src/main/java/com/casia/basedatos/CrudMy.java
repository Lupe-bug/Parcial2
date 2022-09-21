/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casia.basedatos;

import Controlador.Ctrlcomision;
import Modelo.Comision;
import Modelo.consultas;
import Vista.frmcomision;

/**
 *
 * @author barah
 */
public class CrudMy {
    
    
    public static void main (String[] args){
        
    
    
    Comision mod = new Comision();
    consultas modC = new consultas();
    frmcomision frm = new frmcomision();
    
    Ctrlcomision ctrl = new Ctrlcomision(mod, modC, frm);
    ctrl.iniciar();
    frm.setVisible(true);
    
    }
   
    
}

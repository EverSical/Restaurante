package Tabla;
import Formulario.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 
 * @author MasterYny
 */
public class Tablas extends Conexion{
   ResultSet rs;

public DefaultTableModel mostar(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NIT");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("CORREO");
        try {
        CallableStatement cmd = getConection().prepareCall("Call lcl");
        rs = cmd.executeQuery();
        while(rs.next()){
            Object dato [] = new Object [4];
            for(int i=0; i<4;i++){
            dato[i]=rs.getString(i+1);
            }
            modelo.addRow(dato);
        }
    } catch (Exception e) {
    }
return modelo;
}

public DefaultTableModel mostar2(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID EMPLEADO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("DPI");
        try {
        CallableStatement cmd = getConection().prepareCall("Call lem");
        rs = cmd.executeQuery();
        while(rs.next()){
            Object dato [] = new Object [4];
            for(int i=0; i<4;i++){
            dato[i]=rs.getString(i+1);
            }
            modelo.addRow(dato);
        }
    } catch (Exception e) {
    }
return modelo;
}

public DefaultTableModel mostar3(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID MENU");
        modelo.addColumn("NOMBRE MENU");
        modelo.addColumn("PRECIO");
        try {
        CallableStatement cmd = getConection().prepareCall("Call lme");
        rs = cmd.executeQuery();
        while(rs.next()){
            Object dato [] = new Object [3];
            for(int i=0; i<3;i++){
            dato[i]=rs.getString(i+1);
            }
            modelo.addRow(dato);
        }
    } catch (Exception e) {
    }
return modelo;
}

public DefaultTableModel mostar4(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NO. MESA");
        try {
        CallableStatement cmd = getConection().prepareCall("Call lmes");
        rs = cmd.executeQuery();
        while(rs.next()){
            Object dato [] = new Object [1];
            for(int i=0; i<1;i++){
            dato[i]=rs.getString(i+1);
            }
            modelo.addRow(dato);
        }
    } catch (Exception e) {
    }
return modelo;
}


}
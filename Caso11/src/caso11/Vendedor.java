/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso11;

import javax.swing.JOptionPane;

public class Vendedor {

    public String Nombre_vendedor;
    int cedula;
    int codigo;
    public String sucursal;
    public String vehiculo;

    //información del vendedor
    public String NombreV() {
        String n;
        n = JOptionPane.showInputDialog("Ingrese su nombre");
        Nombre_vendedor = (n);
        return Nombre_vendedor;
    }

    public int cedulaV() {
        String lectura;
        lectura = JOptionPane.showInputDialog("Ingrese su cedula");
        cedula = Integer.parseInt(lectura);
        return cedula;
    }

    public int codigoV() {
        String lectura1;
        lectura1 = JOptionPane.showInputDialog("Ingrese su codigo");
        codigo = Integer.parseInt(lectura1);
        return codigo;
    }

    public String sucursalV() {
        String s;
        s = JOptionPane.showInputDialog("Ingrese su sucursal");
        sucursal = (s);
        return sucursal;
    }

    public String vehiculoV() {
        String f;
        f = JOptionPane.showInputDialog("Tiene vehiculo propio?");
        vehiculo = (f);
        return vehiculo;
    }

}

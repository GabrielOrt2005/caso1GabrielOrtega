/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso11;

import javax.swing.JOptionPane;

public class Cliente {

    public String nombreC;
    public int cedulaC;
    public int codigoC;
    private double MontoF;
    private int Mes;
    public int productosE;
    public int productosA;
    public int productosC;

    //información Factura
    public String nombreCli() {
        String n;
        n = JOptionPane.showInputDialog("Ingrese su nombre");
        nombreC = (n);
        return nombreC;
    }

    public int cedulaCli() {
        String lectura3;
        lectura3 = JOptionPane.showInputDialog("Ingrese su cedula");
        cedulaC = Integer.parseInt(lectura3);
        return cedulaC;

    }

    public int codigoCli() {
        String lectura5;
        lectura5 = JOptionPane.showInputDialog("Ingrese su codigo");
        codigoC = Integer.parseInt(lectura5);
        return codigoC;
    }

    public double MontoFactura() {
        String lectura;
        lectura = JOptionPane.showInputDialog("Ingrese el monto de la factura:");
        MontoF = Integer.parseInt(lectura);
        return MontoF;
    }

    public int mess() {
        char mess = JOptionPane.showInputDialog(null,
                "Digite la inicial del mes:\n\n(1)enero\n(2)febrero\n(3)marzo\n(4)abril\n(5)mayo\n(6)junio\n(7)julio\n(8)agosto\n(9)septiembre\n(10)octubre\n(11)noviembre").charAt(0);
        switch (mess) {
            case '1': {
                JOptionPane.showMessageDialog(null, "Enero");
                break;
            }
            case '2': {
                JOptionPane.showMessageDialog(null, "febrero");
                break;
            }
            case '3': {
                JOptionPane.showMessageDialog(null, "marzo");
                break;

            }
            default: {
                JOptionPane.showMessageDialog(null, "numero incorrecto!");
                break;
            }
        }
        return 0;
    }

    public int productosEcli() {
        String lectura6;
        lectura6 = JOptionPane.showInputDialog("Ingrese la cantidad de productos electricos:");
        productosE = Integer.parseInt(lectura6);
        return productosE;
    }

    public int productosAcli() {
        String lectura7;
        lectura7 = JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices:");
        productosA = Integer.parseInt(lectura7);
        return productosA;
    }

    public int productosCcli() {
        String lectura8;
        lectura8 = JOptionPane.showInputDialog("Ingrese la cantidad de productos construccion:");
        productosC = Integer.parseInt(lectura8);
        return productosC;
    }

}

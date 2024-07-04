/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso11;

import javax.swing.JOptionPane;

public class Caso11 {

    public static void main(String[] args) {
        // pedir Informacion del empleado
        Vendedor trabajador = new Vendedor();
        trabajador.NombreV();
        trabajador.cedulaV();
        trabajador.codigoV();
        trabajador.vehiculoV();
        trabajador.sucursalV();
        //informacion de la factura
        Cliente info = new Cliente();
        info.mess();
        // Print de la información
        JOptionPane.showMessageDialog(null, "El agente vendedor:" + trabajador.Nombre_vendedor + "con cedula:\n" + trabajador.cedula + "\ncodigo de trabajador:\n" + trabajador.codigo + "que" + trabajador.vehiculo + "tiene vehiculo propio\n" + "en la sucursal de" + trabajador.sucursal);

    }

}

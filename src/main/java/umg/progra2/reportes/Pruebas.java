package umg.progra2.reportes;

import umg.progra2.DaseDatos.Service.ProductoService;
import umg.progra2.DaseDatos.model.Producto;

import javax.swing.*;
import java.util.List;

public class Pruebas {

    public static void main(String[] args) {

        try {
            List<Producto> prod = new ProductoService().obtenerTodosLosProductos();
            new PdfReport().generateProductReport(prod, "C:\\tmp\\reporte.pdf");
            //mostrar un mensaje de que se general el reporte
            //con jpanel
            JOptionPane.showMessageDialog(null, "Reporte generado en \"C:\\tmp\\reporte.pdf");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paq_logica;
import javax.swing.JLabel;
import javax.swing.table.TableCellEditor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Component;


public class activarBoton extends AbstractCellEditor implements TableCellEditor, ActionListener {

    Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable tabla;
    private int num_proyecto;

         public activarBoton(JTable tabla) {
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.tabla = tabla;
    }

    public void actionPerformed(ActionEvent e) {

         num_proyecto=Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0))) ;
         paq_ventanas.ven_nuevo_proyecto nuevo= new paq_ventanas.ven_nuevo_proyecto();
               paq_ventanas.ven_MDI.Panel_escritorio.add(nuevo);
               nuevo.llenar_proyecto_existente(num_proyecto);
               nuevo.show();
               nuevo.toFront();
           fireEditingStopped();
    }

    public int getNumProyectoSeleccionado()
    {
        return this.num_proyecto;
    }

    public Object getCellEditorValue() {
        return currentValue;
    }

    //Implement the one method defined by TableCellEditor.
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        // Va a mostrar el botón solo en la última fila.
        // de otra forma muestra un espacio en blanco.
        if (row != table.getModel().getRowCount() ) {
            currentValue = (Boolean) value;
            return button;
        }
        return new JLabel();
    }
}

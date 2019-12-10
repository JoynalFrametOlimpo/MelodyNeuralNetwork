

package paq_logica;
import javax.swing.JLabel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Color;


public class dibujaBoton extends JLabel implements TableCellRenderer {

    boolean isBordered = true;

    public dibujaBoton(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {
       JButton boton= new JButton("");
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/page_find.png")));
        boton.setOpaque(true);
        
        if (row != table.getModel().getRowCount() ) {
            return boton;

        } else {
            
            return this;
        }
    }
}
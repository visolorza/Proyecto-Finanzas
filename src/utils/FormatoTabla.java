package utils;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */

public class FormatoTabla extends DefaultTableCellRenderer {

    private final SimpleDateFormat sdf;

    public FormatoTabla(String dateFormat) {
        this.sdf = new SimpleDateFormat(dateFormat);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof Date) {
            value = sdf.format((Date) value);
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}

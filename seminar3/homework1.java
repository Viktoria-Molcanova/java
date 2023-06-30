import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

//1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».

public class PY {
     public static void main(String args[]) {
          JFrame frame = new JFrame("JTable");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          Object rows[][] = { { "Яйца", "1", 80 }, { "Молоко", "2", 120 }, { "Мясо", "высшая 1", 200 },
                    { "Масло", "высшая 2", 80 }, { "Мука", "3", 77 } };
          String columns[] = { "Название", "Категория", "Цена" };
          TableModel model = new DefaultTableModel(rows, columns) {

               public Class getColumnClass(int column) {
                    Class returnValue;
                    if ((column >= 0) && (column < getColumnCount())) {
                         returnValue = getValueAt(0, column).getClass();
                    } else {
                         returnValue = Object.class;
                    }
                    return returnValue;
               }
          };
    
          final JTable table = new JTable(model);
          final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
          table.setRowSorter(sorter);
          JScrollPane pane = new JScrollPane(table);
          frame.add(pane, BorderLayout.CENTER);
          JPanel panel = new JPanel(new BorderLayout());
          JLabel label = new JLabel("Filter");
          panel.add(label, BorderLayout.WEST);
          final JTextField filterText = new JTextField("A");
          panel.add(filterText, BorderLayout.CENTER);
          frame.add(panel, BorderLayout.NORTH);
          JButton button = new JButton("Filter");
          button.addActionListener(new ActionListener() {

               public void actionPerformed(ActionEvent e) {
                    String text = filterText.getText();
                    if (text.trim().length() == 0) {
                         sorter.setRowFilter(null);
                    } else {
                         sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                    }
               }
          });
          frame.add(button, BorderLayout.SOUTH);
          frame.setSize(300, 250);
          frame.setVisible(true);
     }
}

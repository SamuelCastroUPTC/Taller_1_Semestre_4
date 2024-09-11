package co.edu.uptc.view.dialogs.geographicalAnalysisDialog.PanelsAnalysis.PanelsAnalysisBody;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelTableBodyA extends JPanel {
    
    public PanelTableBodyA() {
        initPanel();
        createTable();
    }

    private void initPanel() {
        this.setLayout(new BorderLayout()); // Establecer el diseño del panel
        this.setBackground(ConfigGlobalView.BODY_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.BODY_TEXT_COLOR);
        setVisible(true);
    }

    private void createTable() {
        Object[][] data = {
            {"Fila 1, Columna 1", "Fila 1, Columna 2"},
            {"Fila 2, Columna 1", "Fila 2, Columna 2"},
            {"Fila 3, Columna 1", "Fila 3, Columna 2"}
        };
        Object[] columnNames = {"Columna 1", "Columna 2"};
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);
    }
    
}

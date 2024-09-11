package co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelsAnalysisBody;

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
        // Datos de ejemplo para la tabla
        Object[][] data = {
            {"Fila 1, Columna 1", "Fila 1, Columna 2"},
            {"Fila 2, Columna 1", "Fila 2, Columna 2"},
            {"Fila 3, Columna 1", "Fila 3, Columna 2"}
        };

        // Encabezados de las columnas
        Object[] columnNames = {"Columna 1", "Columna 2"};

        // Crear la tabla con los datos y encabezados
        JTable table = new JTable(data, columnNames);

        // Envolver la tabla en un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Agregar el JScrollPane al panel
        this.add(scrollPane, BorderLayout.CENTER);
    }
    
}

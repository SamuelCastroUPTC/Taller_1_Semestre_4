package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelVehicleAnalysisBody extends JPanel {
    
    private GridBagConstraints gbc = new GridBagConstraints();

    public PanelVehicleAnalysisBody() {
        initPanel();
        addButtons();
        createTable();
        begin();
    }

    public void initPanel() {
        this.setBackground(ConfigGlobalView.BODY_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.BODY_TEXT_COLOR);
        this.setLayout(new GridBagLayout());
    }

    private void begin() {
        this.setVisible(true);
    }

    private void createButtonByModel() {
        JButton btnByModel = new JButton("Consultar por modelo");
        btnByModel.setFont(ConfigGlobalView.BODY_FONT);
        btnByModel.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        this.add(btnByModel, gbc);
    }

    private void createButtonByProducer() {
        JButton btnByProducer = new JButton("Consultar por fabricante");
        btnByProducer.setFont(ConfigGlobalView.BODY_FONT);
        btnByProducer.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        this.add(btnByProducer, gbc);
    }

    private void createButtonByElectricRange() {
        JButton btnByElectricRange = new JButton("Consultar por rango eléctrico");
        btnByElectricRange.setFont(ConfigGlobalView.BODY_FONT);
        btnByElectricRange.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        this.add(btnByElectricRange, gbc);
    }

    private void createTable() {
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        Object[][] data = {
            {"Fila 1, Columna 1", "Fila 1, Columna 2"},
            {"Fila 2, Columna 1", "Fila 2, Columna 2"}
        };
        Object[] columnNames = {"Columna 1"};
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, gbc);
    }

    private void addButtons() {
        createButtonByModel();
        createButtonByProducer();
        createButtonByElectricRange();
    }
}

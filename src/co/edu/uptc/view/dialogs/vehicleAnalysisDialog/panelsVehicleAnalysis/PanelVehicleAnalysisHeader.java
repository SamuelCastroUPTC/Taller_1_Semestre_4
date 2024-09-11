package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelVehicleAnalysisHeader extends JPanel {

    public PanelVehicleAnalysisHeader(){
        initPanel();
        createTittle();
        begin();
    }
    
    public void initPanel() {
        this.setBackground(ConfigGlobalView.HEADER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.HEADER_TEXT_COLOR);
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(ConfigGlobalView.HEADER_DIMENSION_DIALOG));
    }

    public void begin() {
        setVisible(true);
    }

    private void createTittle() {
        JLabel title = new JLabel("Consultas De Cantidad De Vehículos");
        title.setFont(ConfigGlobalView.HEADER_FONT);
        title.setForeground(ConfigGlobalView.HEADER_TEXT_COLOR);
        // GridBagConstraints gbc = new GridBagConstraints();
        // gbc.gridx = 0;
        // gbc.gridy = 0;
        // gbc.weightx = 1.0;
        // gbc.weighty = 1.0;
        // gbc.anchor = GridBagConstraints.CENTER;
        // gbc.fill = GridBagConstraints.NONE;
        this.add(title);
    }
}

package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogVehicle;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelDialogVehicle extends JPanel{

    private GridBagConstraints gbc = new GridBagConstraints();
        

    public PanelDialogVehicle() {
        initPanel();
        createLblVehicle();
        createComboBox();
        begin();
    }

    public void initPanel() {
        this.setLayout(new GridBagLayout());
    }

    private void begin() {
        this.setVisible(true);
    }

    private void createLblVehicle(){
        JLabel lblSelectVehicle = new JLabel("Seleccione un vehículo:");
        lblSelectVehicle.setFont(ConfigGlobalView.BODY_FONT);
        lblSelectVehicle.setForeground(ConfigGlobalView.BODY_TEXT_COLOR);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        this.add(lblSelectVehicle, gbc);
    }

    private void createComboBox(){
        String[] vehicles = {"Carro", "Moto", "Bicicleta", "Camión"};
        JComboBox<String> comboBoxVehicles = new JComboBox<>(vehicles);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        this.add(comboBoxVehicles, gbc);
    }
}

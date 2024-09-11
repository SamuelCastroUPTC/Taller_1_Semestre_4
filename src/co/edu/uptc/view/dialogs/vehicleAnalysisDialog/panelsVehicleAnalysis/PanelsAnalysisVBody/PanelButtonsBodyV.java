package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogElectric.DialogElectric;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogManufacturer.DialogManufacturer;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogVehicle.DialogVehicle;

public class PanelButtonsBodyV extends JPanel{
    
    private GridBagConstraints gbc = new GridBagConstraints();

    public PanelButtonsBodyV() {
        initPanel();
        createButtonStatus();
        createButtonCounty();
        createButtonVehicles();
        begin();
    }
    
    public void initPanel() {
        this.setLayout(new GridBagLayout());
    }

    private void begin() {
        setVisible(true);
    }

    private void createButtonStatus() {
        JButton buttonStatus = new JButton("<html>Modelo Del<br>Vehiculo</html>");
        buttonStatus.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonStatus.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonStatus.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION); 
        createGridBagStatus();
        buttonStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogVehicle dialogVehicle = new DialogVehicle();
                dialogVehicle.begin();
            }
        });
        this.add(buttonStatus, gbc);
    }

    private void createGridBagStatus(){
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
    }

    private void createButtonCounty() {
        JButton buttonCounty = new JButton("<html>Vehiculo Del<br>Fabricante</html>");
        buttonCounty.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonCounty.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonCounty.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION);
        createGridBagCountry();
        buttonCounty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogManufacturer dialogManufacturer = new DialogManufacturer();
                dialogManufacturer.begin();
            }
        });
        this.add(buttonCounty, gbc);
    }

    private void createGridBagCountry(){
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
    }

    private void createButtonVehicles() {
        JButton buttonVehicles = new JButton("<html>Rango<br>Electrico</html>");
        buttonVehicles.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonVehicles.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonVehicles.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION);
        createGridBagVehicle();
        buttonVehicles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogElectric dialogElectric = new DialogElectric();
                dialogElectric.begin();
            }
        });
        this.add(buttonVehicles, gbc);
    }
    
    private void createGridBagVehicle(){
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
    }
}

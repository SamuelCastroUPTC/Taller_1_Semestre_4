package co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelsAnalysisBody;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelButtonsBodyA extends JPanel {
    
    public PanelButtonsBodyA() {
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
        JButton buttonStatus = new JButton("<html>Análisis<br>Geográfico</html>");
        buttonStatus.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonStatus.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonStatus.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(buttonStatus, gbc);
    }

    private void createButtonCounty() {
        JButton buttonCounty = new JButton("<html>Análisis<br>De Condados</html>");
        buttonCounty.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonCounty.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonCounty.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(buttonCounty, gbc);
    }

    private void createButtonVehicles() {
        JButton buttonVehicles = new JButton("<html>Análisis<br>De Vehiculos</html>");
        buttonVehicles.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonVehicles.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonVehicles.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(buttonVehicles, gbc);
    }
    
}

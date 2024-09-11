package co.edu.uptc.view.main.mainPanels.PanelsMainBody; 

import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import co.edu.uptc.globals.ConfigGlobalView;
import co.edu.uptc.view.dialogs.geographicalAnalysisDialog.MainDialogAnalysis;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.MainDialogVehicleAnalysis;
import co.edu.uptc.view.main.mainPanels.PanelMainBody;

public class PanelButtonsBody extends JPanel{ 

    public PanelMainBody panelMainBody;

    public PanelButtonsBody(PanelMainBody panelMainBody) {
        this.panelMainBody = panelMainBody;
        initPanel();
        createLblConsult(); 
        createButtonGeographical();
        createButtonVehicle();
    }

    private void initPanel() {
        this.setLayout(new GridBagLayout());
    }

    private void createLblConsult(){
        JLabel lblConsult = new JLabel("Consultar Por:");
        lblConsult.setFont(ConfigGlobalView.HEADER_FONT);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 20, 0);
        this.add(lblConsult, gbc);
    }
    
    private void createButtonGeographical() {
        JButton buttonGeographical = new JButton("Análisis Geográfico");
        buttonGeographical.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonGeographical.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonGeographical.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; 
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.LINE_START; 
        gbc.insets = new Insets(0, 20, 10, 0); 
        buttonGeographical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDialogAnalysis mainPanelAnalysis = new MainDialogAnalysis(getPanelButtonsBody());
                mainPanelAnalysis.begin();
            }
        });
        this.add(buttonGeographical, gbc);
    }

    private void createButtonVehicle() {
        JButton buttonVehicle = new JButton("<html>Análisis<br>de Vehículos</html>");
        buttonVehicle.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonVehicle.setFont(ConfigGlobalView.BUTTON_FONT);
        buttonVehicle.setPreferredSize(ConfigGlobalView.BUTTON_DIMENSION); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1; 
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.LINE_END; 
        gbc.insets = new Insets(0, 0, 10, 20); 
        buttonVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDialogVehicleAnalysis();
            }
        });
        this.add(buttonVehicle, gbc);
    }

    private PanelButtonsBody getPanelButtonsBody() {
        return this;
    }

    public void createDialogVehicleAnalysis() {
        MainDialogVehicleAnalysis mainDialogVehicleAnalysis = new MainDialogVehicleAnalysis(this);
        mainDialogVehicleAnalysis.begin();
    }
    
}

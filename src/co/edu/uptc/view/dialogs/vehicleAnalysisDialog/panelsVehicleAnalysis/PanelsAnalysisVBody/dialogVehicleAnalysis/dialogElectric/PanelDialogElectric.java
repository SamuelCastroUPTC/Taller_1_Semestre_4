package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogElectric;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelDialogElectric extends JPanel{
    
    private GridBagConstraints gbc = new GridBagConstraints();
        

    public PanelDialogElectric() {
        initPanel();
        createLblVehicle();
        createTxtMin();
        createTxtMax();
        begin();
    }

    public void initPanel() {
        this.setLayout(new GridBagLayout());
    }

    private void begin() {
        this.setVisible(true);
    }

    private void createLblVehicle(){
        JLabel lblSelectVehicle = new JLabel("Digite un rango");
        lblSelectVehicle.setFont(ConfigGlobalView.BODY_FONT);
        lblSelectVehicle.setForeground(ConfigGlobalView.BODY_TEXT_COLOR);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        this.add(lblSelectVehicle, gbc);
    }

    private void createTxtMin(){
        JTextField textField1 = new JTextField(30);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        this.add(textField1, gbc);
    }

    private void createTxtMax(){
        JTextField textField2 = new JTextField(30);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        this.add(textField2, gbc);
    }
}

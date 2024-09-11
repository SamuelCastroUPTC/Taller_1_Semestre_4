package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelLabelBodyV extends JPanel{
    
    public PanelLabelBodyV() {
        initPanel();
        createLblResult();
        begin();
    }
    
    public void initPanel() {
        this.setLayout(new GridBagLayout());
    }

    private void begin() {
        setVisible(true);
    }

    private void createLblResult() {
        JLabel lblResult = new JLabel("Hay un total de:");
        lblResult.setFont(ConfigGlobalView.HEADER_FONT);
        lblResult.setForeground(ConfigGlobalView.HEADER_TEXT_COLOR);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(lblResult, gbc);
    }
}

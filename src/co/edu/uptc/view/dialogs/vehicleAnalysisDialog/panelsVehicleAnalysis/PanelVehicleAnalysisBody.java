package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.PanelButtonsBodyV;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.PanelLabelBodyV;

public class PanelVehicleAnalysisBody extends JPanel {


    public PanelVehicleAnalysisBody() {
        initPanel();
        addButtons();
        createLblResult();
        begin();
    }

    public void initPanel() {
        this.setBackground(ConfigGlobalView.BODY_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.BODY_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        this.setVisible(true);
    }
    

    private void createLblResult() {
        PanelLabelBodyV panelLabelBodyV = new PanelLabelBodyV();
        this.add(panelLabelBodyV, BorderLayout.CENTER);
    }

    private void addButtons() {
        PanelButtonsBodyV panelButtonsBodyV = new PanelButtonsBodyV();
        this.add(panelButtonsBodyV, BorderLayout.WEST);
    }
}

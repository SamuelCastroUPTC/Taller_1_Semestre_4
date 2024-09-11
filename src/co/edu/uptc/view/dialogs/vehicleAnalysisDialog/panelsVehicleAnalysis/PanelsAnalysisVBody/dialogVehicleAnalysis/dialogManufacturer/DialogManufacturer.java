package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogManufacturer;

import javax.swing.JDialog;

public class DialogManufacturer extends JDialog{
    
    public DialogManufacturer() {
        initDialog();
        createPanelVehicleAnalysis();
    }

    private void initDialog() {
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void begin() {
        this.setVisible(true);
    }

    private void createPanelVehicleAnalysis() {
        PanelDialogManufacturer panelDialogManufacturer = new PanelDialogManufacturer();
        this.add(panelDialogManufacturer);
    }
}

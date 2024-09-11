package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogVehicle;

import javax.swing.JDialog;

public class DialogVehicle extends JDialog{

    public DialogVehicle() {
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
        PanelDialogVehicle panelDialogVehicle = new PanelDialogVehicle();
        this.add(panelDialogVehicle);
    }
    
}
package co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelsAnalysisVBody.dialogVehicleAnalysis.dialogElectric;

import javax.swing.JDialog;


public class DialogElectric extends JDialog{
    
    public DialogElectric() {
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
        PanelDialogElectric panelDialogElectric = new PanelDialogElectric();
        this.add(panelDialogElectric);
    }
}

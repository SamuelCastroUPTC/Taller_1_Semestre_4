package co.edu.uptc.view.dialogs.vehicleAnalysisDialog;

import java.awt.BorderLayout;

import javax.swing.JDialog;

import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelVehicleAnalysisBody;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelVehicleAnalysisFooter;
import co.edu.uptc.view.dialogs.vehicleAnalysisDialog.panelsVehicleAnalysis.PanelVehicleAnalysisHeader;
import co.edu.uptc.view.main.mainPanels.PanelsMainBody.PanelButtonsBody;

public class MainDialogVehicleAnalysis extends JDialog{
    public PanelButtonsBody panelButtonsBody;

    public MainDialogVehicleAnalysis(PanelButtonsBody panelButtonsBody) {
        super(panelButtonsBody.panelMainBody.mainView, true);
        this.panelButtonsBody = panelButtonsBody;
        initDialog();
        createPanels();
    }
    
    public void begin() {
        this.setVisible(true);
    }

    private void initDialog() {
        setTitle("Electric Vehicle Population Data");
        this.setSize(1200, 800);
        this.setLocationRelativeTo(panelButtonsBody.panelMainBody.mainView);
        this.setLayout(new BorderLayout());
    }

    private void createHeader() {
        PanelVehicleAnalysisHeader panelVehicleAnalysisHeader = new PanelVehicleAnalysisHeader();
        this.add(panelVehicleAnalysisHeader, BorderLayout.NORTH);
    }

    private void createBody() {
        PanelVehicleAnalysisBody panelVehicleAnalysisBody = new PanelVehicleAnalysisBody();
        this.add(panelVehicleAnalysisBody, BorderLayout.CENTER);
    }

    private void createFooter() {
        PanelVehicleAnalysisFooter panelVehicleAnalysisFooter = new PanelVehicleAnalysisFooter();
        this.add(panelVehicleAnalysisFooter, BorderLayout.SOUTH);
    }

    private void createPanels() {
        createHeader();
        createBody();
        createFooter();
    }
}

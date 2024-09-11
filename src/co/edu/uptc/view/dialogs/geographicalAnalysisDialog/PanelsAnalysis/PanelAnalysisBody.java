package co.edu.uptc.view.dialogs.geographicalAnalysisDialog.PanelsAnalysis;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;
import co.edu.uptc.view.dialogs.geographicalAnalysisDialog.PanelsAnalysis.PanelsAnalysisBody.PanelButtonsBodyA;
import co.edu.uptc.view.dialogs.geographicalAnalysisDialog.PanelsAnalysis.PanelsAnalysisBody.PanelTableBodyA;

public class PanelAnalysisBody extends JPanel{
    
    public PanelAnalysisBody() {
        initPanel();
        begin();
        createPanels();
        createPanelTable();
    }

    public void initPanel() {
        this.setBackground(ConfigGlobalView.BODY_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.BODY_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        this.setVisible(true);
    }

    private void createPanels() {
        createPanelButtons();
    }

    private void createPanelButtons(){
        PanelButtonsBodyA panelButtonsBodyA = new PanelButtonsBodyA();
        this.add(panelButtonsBodyA, BorderLayout.WEST);
    }

    private void createPanelTable(){
        PanelTableBodyA panelTableBodyA = new PanelTableBodyA();
        this.add(panelTableBodyA, BorderLayout.CENTER);
    }

}

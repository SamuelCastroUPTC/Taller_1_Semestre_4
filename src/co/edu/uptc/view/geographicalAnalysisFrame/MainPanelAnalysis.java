package co.edu.uptc.view.geographicalAnalysisFrame;

import javax.swing.JDialog;

import co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelAnalysisBody;
import co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelAnalysisFooter;
import co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelAnalysisHeader;
import co.edu.uptc.view.mainPanels.PanelsMainBody.PanelButtonsBody;

import java.awt.BorderLayout;

public class MainPanelAnalysis extends JDialog{
    
    public PanelButtonsBody panelButtonsBody;

    public MainPanelAnalysis(PanelButtonsBody panelButtonsBody) {
        super(panelButtonsBody.panelMainBody.mainView);
        this.panelButtonsBody = panelButtonsBody;
        initFrame();
        createPanels();
    }

    private void initFrame() {
        setTitle("Electric Vehicle Population Data");
        this.setSize(1200, 800);
        this.setLocationRelativeTo(panelButtonsBody.panelMainBody.mainView);
        this.setLayout(new BorderLayout());
    }

    public void begin() {
        this.setVisible(true);
    }

    private void createPanels() {
        createHeader();
        createBody();
        createFooter();
    }
    
    private void createHeader() {
        PanelAnalysisHeader panelAnalysisHeader = new PanelAnalysisHeader();
        this.add(panelAnalysisHeader, BorderLayout.NORTH);
    }

    private void createBody() {
        PanelAnalysisBody panelAnalysisBody = new PanelAnalysisBody();
        this.add(panelAnalysisBody, BorderLayout.CENTER);
    }

    private void createFooter() {
        PanelAnalysisFooter panelAnalysisFooter = new PanelAnalysisFooter();
        this.add(panelAnalysisFooter, BorderLayout.SOUTH);
    }
}

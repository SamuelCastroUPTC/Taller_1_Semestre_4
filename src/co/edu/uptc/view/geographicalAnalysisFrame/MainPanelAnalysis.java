package co.edu.uptc.view.geographicalAnalysisFrame;

import javax.swing.JDialog;
import javax.swing.JFrame;

import co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelAnalysisBody;
import co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelAnalysisFooter;
import co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis.PanelAnalysisHeader;
import co.edu.uptc.view.mainPanels.PanelMainBody;

import java.awt.BorderLayout;

public class MainPanelAnalysis extends JDialog{

    public PanelMainBody panelMainBody;
    
    public MainPanelAnalysis(PanelMainBody panelMainBody) {
        this.panelMainBody = panelMainBody;
        initFrame();
        begin();
        createPanels();
    }

    private void initFrame() {
        setTitle("Electric Vehicle Population Data");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void begin() {
        setVisible(true);
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

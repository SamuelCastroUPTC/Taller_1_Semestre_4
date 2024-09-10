package co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis;

import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelAnalysisHeader extends JPanel{
    
    public PanelAnalysisHeader(){
        initPanel();
        begin();
    }
    
    public void initPanel() {
        this.setBackground(ConfigGlobalView.HEADER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.HEADER_TEXT_COLOR);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(ConfigGlobalView.HEADER_DIMENSION));
    }
    
    private void begin() {
        setVisible(true);
    }

    
}

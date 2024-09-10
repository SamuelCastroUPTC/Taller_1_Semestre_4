package co.edu.uptc.view.geographicalAnalysisFrame.PanelsAnalysis;

import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelAnalysisFooter extends JPanel{
    
    public PanelAnalysisFooter(){
        initPanel();
        begin();
    }
    
    public void initPanel() {
        
        this.setBackground(ConfigGlobalView.FOOTER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.FOOTER_TEXT_COLOR);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(ConfigGlobalView.FOOTER_DIMENSION));
    }
    
    private void begin() {
        setVisible(true);
    }
}

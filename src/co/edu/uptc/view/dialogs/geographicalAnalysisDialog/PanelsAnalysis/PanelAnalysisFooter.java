package co.edu.uptc.view.dialogs.geographicalAnalysisDialog.PanelsAnalysis;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelAnalysisFooter extends JPanel{
    
    public PanelAnalysisFooter(){
        initPanel();
        createLblBibliography();
        begin();
    }
    
    public void initPanel() {
        
        this.setBackground(ConfigGlobalView.FOOTER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.FOOTER_TEXT_COLOR);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(ConfigGlobalView.FOOTER_DIMENSION_DIALOG));
    }
    
    private void begin() {
        setVisible(true);
    }

    private void createLblBibliography(){
        JLabel lblBibliography = new JLabel("Hecho por: Samuel Castro y Manuel Cruz");
        lblBibliography.setFont(ConfigGlobalView.FOOTER_FONT);
        lblBibliography.setBounds(10, 10, 2000, 50); 
        this.add(lblBibliography);
    }
}

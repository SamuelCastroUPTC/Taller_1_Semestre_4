package co.edu.uptc.view.mainPanels;

import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelMainHeader extends JPanel { 

    public PanelMainHeader() {
        initPanel();
        begin();
    }

    public void initPanel() {
        this.setBackground(ConfigGlobalView.HEADER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.HEADER_TEXT_COLOR);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 150));
    }
    
    private void begin() {
        setVisible(true);
    }
}

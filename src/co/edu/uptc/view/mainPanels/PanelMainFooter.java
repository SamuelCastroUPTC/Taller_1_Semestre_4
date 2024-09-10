package co.edu.uptc.view.mainPanels;

import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelMainFooter extends JPanel {

    public PanelMainFooter() {
        initPanel();
        begin();
    }
    
    public void initPanel() {
        this.setBackground(ConfigGlobalView.FOOTER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.FOOTER_TEXT_COLOR);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 100));
    }

    private void begin() {
        setVisible(true);
    }
}

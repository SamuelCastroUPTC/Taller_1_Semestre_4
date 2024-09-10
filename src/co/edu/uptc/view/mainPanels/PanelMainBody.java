package co.edu.uptc.view.mainPanels;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelMainBody extends JPanel {

    public PanelMainBody() {
        initPanel();
        begin();
    }

    public void initPanel() {
        this.setBackground(ConfigGlobalView.BODY_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.BODY_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        setVisible(true);
    }
}

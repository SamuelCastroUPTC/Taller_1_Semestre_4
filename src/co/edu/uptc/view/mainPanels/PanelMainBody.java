package co.edu.uptc.view.mainPanels;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import co.edu.uptc.globals.ConfigGlobalView;
import co.edu.uptc.view.MainView;
import co.edu.uptc.view.mainPanels.PanelsMainBody.PanelButtonsBody;
import co.edu.uptc.view.mainPanels.PanelsMainBody.PanelImageBody;

public class PanelMainBody extends JPanel {

    public MainView mainView;

    public PanelMainBody(MainView mainView) {
        this.mainView = mainView;
        initPanel();
        begin();
        createPanels();
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
        createPanelImage();
        createPanelButton();
    }

    private void createPanelImage(){
        PanelImageBody panelImageBody = new PanelImageBody();
        this.add(panelImageBody, BorderLayout.CENTER);
    }

    private void createPanelButton(){
        PanelButtonsBody panelButtonsBody = new PanelButtonsBody(this);
        this.add(panelButtonsBody, BorderLayout.SOUTH);
    }
}

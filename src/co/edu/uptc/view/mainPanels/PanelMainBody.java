package co.edu.uptc.view.mainPanels;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import co.edu.uptc.globals.ConfigGlobalView;
import co.edu.uptc.view.geographicalAnalysisFrame.MainPanelAnalysis;

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

    public void createButtonGeoAnalysis() {
        JButton buttonGeoAnalysis = new JButton("Geographical Analysis");
        buttonGeoAnalysis.setBackground(ConfigGlobalView.BUTTON_BACKGROUND_COLOR);
        buttonGeoAnalysis.setForeground(ConfigGlobalView.BUTTON_TEXT_COLOR);
        buttonGeoAnalysis.setPreferredSize(new Dimension(200, 200));
        buttonGeoAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDialogGeoAnalysis();
            }
        });
    }
    private void createDialogGeoAnalysis() {
        MainPanelAnalysis mainPanelAnalysis = new MainPanelAnalysis(this);
        mainPanelAnalysis.begin();
    }
}

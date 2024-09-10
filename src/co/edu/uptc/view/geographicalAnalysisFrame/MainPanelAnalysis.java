package co.edu.uptc.view.geographicalAnalysisFrame;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainPanelAnalysis extends JFrame{
    
    public MainPanelAnalysis() {
        initFrame();
        begin();
    }

    private void initFrame() {
        setTitle("Electric Vehicle Population Data");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void begin() {
        setVisible(true);
    }
}

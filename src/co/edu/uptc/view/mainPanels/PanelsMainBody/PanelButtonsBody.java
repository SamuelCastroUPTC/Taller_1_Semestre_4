package co.edu.uptc.view.mainPanels.PanelsMainBody;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelButtonsBody extends JPanel{
    
    public PanelButtonsBody(){
        initPanel();
        begin();
    }
    
    public void initPanel() {
        this.setLayout(new BorderLayout());
    }
    
    private void begin() {
        setVisible(true);
    }

    private void createButtonAnalysis(){
        JButton buttonAnalysis = new JButton("Analysis");
        
    }
}

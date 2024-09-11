package co.edu.uptc.view.main;

import co.edu.uptc.interfaces.Contract;
import co.edu.uptc.view.main.mainPanels.PanelMainBody;
import co.edu.uptc.view.main.mainPanels.PanelMainFooter;
import co.edu.uptc.view.main.mainPanels.PanelMainHeader;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainView extends JFrame implements Contract.View {

    @SuppressWarnings("unused")
    private Contract.Presenter presenter;

    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    public MainView() {
        initFrame();
        begin();
        createPanels();
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

    private void createPanels() {
        createHeader();
        createBody();
        createFooter();
    }
    
    private void createHeader() {
        PanelMainHeader panelMainHeader = new PanelMainHeader();
        this.add(panelMainHeader, BorderLayout.NORTH);
    }

    private void createBody() {
        PanelMainBody panelMainBody = new PanelMainBody(this);
        this.add(panelMainBody, BorderLayout.CENTER);
    }

    private void createFooter() {
        PanelMainFooter panelMainFooter = new PanelMainFooter();
        this.add(panelMainFooter, BorderLayout.SOUTH);
    }

}

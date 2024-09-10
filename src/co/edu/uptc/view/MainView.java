package co.edu.uptc.view;

import javax.swing.JFrame;

import co.edu.uptc.interfaces.Contract;

public class MainView extends JFrame implements Contract.View {

    @SuppressWarnings("unused")
    private Contract.Presenter presenter;

    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    public MainView() {
        this.setTitle("Main View");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

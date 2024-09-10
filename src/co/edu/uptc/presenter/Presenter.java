package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.Contract;
import co.edu.uptc.interfaces.Contract.Model;
import co.edu.uptc.interfaces.Contract.View;

public class Presenter implements Contract.Presenter {

    @SuppressWarnings("unused")
    private Contract.View view;
    @SuppressWarnings("unused")
    private Contract.Model model;

    @Override
    public void setView(View view) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setView'");
    }

    @Override
    public void setModel(Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setModel'");
    }
}

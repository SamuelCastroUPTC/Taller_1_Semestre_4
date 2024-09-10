package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.Contract;
import co.edu.uptc.interfaces.Contract.Model;
import co.edu.uptc.interfaces.Contract.View;

public class Presenter implements Contract.Presenter {

    @SuppressWarnings("unused")
    private Contract.View view;
    private Contract.Model model;

    public Presenter(Contract.View view, Contract.Model model) {
        this.view = view;
        this.model = model;
        this.model.setPresenter(this);
    }

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

package co.edu.uptc.model;

import co.edu.uptc.interfaces.Contract;

public class ManagerModel implements Contract.Model {

    private Contract.Presenter presenter;

    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }   
}

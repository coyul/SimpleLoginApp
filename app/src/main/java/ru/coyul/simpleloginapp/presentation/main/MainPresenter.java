package ru.coyul.simpleloginapp.presentation.main;

import javax.inject.Inject;

import ru.coyul.simpleloginapp.di.ConfigPersistent;
import ru.coyul.simpleloginapp.presentation.base.BasePresenter;

/**
 * @author Koenova Yulia
 */
@ConfigPersistent
public class MainPresenter extends BasePresenter<MainView> {

    @Inject
    public MainPresenter() {
    }

    public void onLoginButtonClick(){
        getMvpView().openLoginActivity();
    }
}

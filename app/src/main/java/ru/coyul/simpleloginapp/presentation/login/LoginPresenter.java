package ru.coyul.simpleloginapp.presentation.login;

import javax.inject.Inject;

import ru.coyul.simpleloginapp.di.ConfigPersistent;
import ru.coyul.simpleloginapp.presentation.base.BasePresenter;

/**
 * @author Koenova Yulia
 */
@ConfigPersistent
public class LoginPresenter extends BasePresenter<LoginView> {

    @Inject
    public LoginPresenter() {
    }
}

package ru.coyul.simpleloginapp.presentation.base;

/**
 * @author Koenova Yulia
 */

public interface MVPPresenter<V extends MVPView> {

    void attachView(V mvpView);

    void detachView();
}

package ru.coyul.simpleloginapp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import ru.coyul.simpleloginapp.di.PerActivity;
import ru.coyul.simpleloginapp.presentation.login.LoginPresenter;

/**
 * Модуль с зависимостями для активити
 *
 * @author Koenova Yulia
 */
@Module
public class ActivityModule {
    private AppCompatActivity mAppCompatActivity;

    public ActivityModule(AppCompatActivity appCompatActivity) {
        mAppCompatActivity = appCompatActivity;
    }

    @Provides
    Context provideContext(){
        return mAppCompatActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mAppCompatActivity;
    }

    //region провайдим презентеры

    @Provides
    @PerActivity
    LoginPresenter provideLoginPresenter(LoginPresenter presenter){
        return presenter;
    }

    //end region
}

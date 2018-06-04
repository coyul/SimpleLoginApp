package ru.coyul.simpleloginapp.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Модуль с зависимостями для уровня Application
 *
 * @author Koenova Yulia
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Context provideContext(){
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

}

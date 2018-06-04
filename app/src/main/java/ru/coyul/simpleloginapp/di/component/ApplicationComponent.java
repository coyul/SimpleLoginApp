package ru.coyul.simpleloginapp.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import ru.coyul.simpleloginapp.App;
import ru.coyul.simpleloginapp.di.module.ApplicationModule;
import ru.coyul.simpleloginapp.di.module.NetworkModule;

/**
 * @author Koenova Yulia
 */
@Singleton
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {

    void inject(App app);

    Context getContext();

    Application getApplication();
}

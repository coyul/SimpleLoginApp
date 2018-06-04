package ru.coyul.simpleloginapp;

import android.app.Application;
import android.content.Context;

import ru.coyul.simpleloginapp.di.component.ApplicationComponent;
import ru.coyul.simpleloginapp.di.component.DaggerApplicationComponent;
import ru.coyul.simpleloginapp.di.module.ApplicationModule;

/**
 * @author Koenova Yulia
 */

public class App extends Application {

    private ApplicationComponent mComponent;


    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        if (mComponent == null) {
            mComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mComponent;
    }

    public void setComponent(ApplicationComponent component) {
        mComponent = component;
    }
}

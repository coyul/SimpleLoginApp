package ru.coyul.simpleloginapp.di.component;

import dagger.Subcomponent;
import ru.coyul.simpleloginapp.di.PerActivity;
import ru.coyul.simpleloginapp.di.module.ActivityModule;
import ru.coyul.simpleloginapp.presentation.login.LoginActivity;
import ru.coyul.simpleloginapp.presentation.main.MainActivity;

/**
 * Компонент для внедрения зависимостей во все активити приложения
 *
 * @author Koenova Yulia
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginActivity);
}

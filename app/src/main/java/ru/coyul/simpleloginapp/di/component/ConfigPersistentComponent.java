package ru.coyul.simpleloginapp.di.component;

import dagger.Component;
import ru.coyul.simpleloginapp.di.ConfigPersistent;
import ru.coyul.simpleloginapp.di.module.ActivityModule;

/**
 * @author Koenova Yulia
 */
@ConfigPersistent
@Component(dependencies = ApplicationComponent.class)
public interface ConfigPersistentComponent {

    ActivityComponent activityComponent(ActivityModule activityModule);

}

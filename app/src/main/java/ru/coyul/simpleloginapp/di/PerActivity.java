package ru.coyul.simpleloginapp.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Аннотация для объектов, которые должны существовать на время жизни активити
 *
 * @author Koenova Yulia
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}


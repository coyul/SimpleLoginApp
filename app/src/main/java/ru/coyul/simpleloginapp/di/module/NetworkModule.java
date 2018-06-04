package ru.coyul.simpleloginapp.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.coyul.simpleloginapp.data.network.WeatherService;

/**
 * Модуль для создания сервиса для сетевых запросов
 *
 * @author Koenova Yulia
 */
@Module
public class NetworkModule {

    private final String BASE_URL = "https://api.ribot.io/";

    @Singleton
    @Provides
    Retrofit provideRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    WeatherService provideWeatherService(Retrofit retrofit){
        return retrofit.create(WeatherService.class);
    }
}

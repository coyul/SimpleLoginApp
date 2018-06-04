package ru.coyul.simpleloginapp.data.network;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import ru.coyul.simpleloginapp.data.model.Weather;

/**
 * API для получения погоды
 *
 * @author Koenova Yulia
 */

public interface WeatherService {

    @GET("weather")
    Observable<List<Weather>> getWeather();
}

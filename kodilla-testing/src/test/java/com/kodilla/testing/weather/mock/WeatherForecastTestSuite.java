package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Start testing");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Testing finished");
    }

    @BeforeEach
    void beforeEach() {

        Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow",25.5);
            temperaturesMap.put("Krakow",26.2);
            temperaturesMap.put("Wroclaw",24.8);
            temperaturesMap.put("Warszawa",25.2);
            temperaturesMap.put("Gdansk",26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Mock
    private Temperatures temperaturesMock;
    @DisplayName("Test calculate forecast")
    @Test
    void testCalculateForecastWithMock(){

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Test average temperatures")
    @Test
    void testAverageTemperatures(){

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        double averageTemperatures = weatherForecast.averageTemperatures();

        Assertions.assertEquals(25.56, averageTemperatures);
    }

    @DisplayName("Test median temperature")
    @Test
    void testMedianTemperature(){

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        double medianTemperature = weatherForecast.medianTemperature();

        Assertions.assertEquals(25.5, medianTemperature);
    }
}

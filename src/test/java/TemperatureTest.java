import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.selimchiki.temperature.Temperature;

class TemperatureTest {

    @Test
    void GivenTemperatureInCelsiusIs100_WhenTemperetureInFahrenheitIs_ThenTemperatureInFahrenheitIs212() {
        double temp = 100.00;
        Temperature temperature = new Temperature(temp, true);
        assertEquals(212, temperature.getTempInFahrenheit());
    }

    @Test
    void GivenTemperatureInFahrenheutIs212_WhenTemperetureInCelsiusIs_ThenTemperatureInCelsiusIs100() {
        double temp = 212.00;
        Temperature temperature = new Temperature(temp, false);
        assertEquals(100, temperature.getTempInCelsius());
    }
}

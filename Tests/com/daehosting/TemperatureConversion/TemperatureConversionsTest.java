package com.daehosting.TemperatureConversion;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Aaron Anderson on 10/4/16.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("Bad celsius to fahrenheit conversion",BigDecimal.valueOf(32), celsiusToFahrenheitResult);
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("Bad fahrenheit to celsius converstion", BigDecimal.valueOf(0), fahrenheitToCelsiusResult);
        BigDecimal windchillCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(30), BigDecimal.valueOf(10));
        assertEquals("Bad celsius windchill calculation", BigDecimal.valueOf(25.98), windchillCelsiusResult);
        BigDecimal windchillFahrenheitResult = service.windChillInFahrenheit(BigDecimal.valueOf(60), BigDecimal.valueOf(10));
        assertEquals("Bad fahrenheit windchill calculation", BigDecimal.valueOf(48.47399996), windchillFahrenheitResult);
    }


}
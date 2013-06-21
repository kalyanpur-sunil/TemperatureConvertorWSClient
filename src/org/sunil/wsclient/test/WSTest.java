package org.sunil.wsclient.test;

import javax.xml.ws.WebEndpoint;

import net.webservicex.ConvertTemperature;
import net.webservicex.ConvertTemperatureSoap;
import net.webservicex.TemperatureUnit;

/**
 * 
 * 
 * @author Sunil Kalyanpur
 *
 */
public class WSTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConvertTemperature convertTemperature = new ConvertTemperature();
		
		//get WebEndpoint
		ConvertTemperatureSoap stub = convertTemperature.getConvertTemperatureSoap();
		
		double convertedTemp = stub.convertTemp(40.00, TemperatureUnit.DEGREE_CELSIUS, TemperatureUnit.DEGREE_FAHRENHEIT);
		
		System.out.println("40.00 degree celsius on Fareinheit scale is "+ convertedTemp);

	}

}

I made of wsimport tool to parse WSDL and to generate JAX-WS portable artifacts for 
ws client to access web services.

I am making use of ConvertTemperature service to convert temperature from one unit to other
List of temperature units that this service accepts can be found in TemperatureUnit.java

wsimport -keep -s src http://www.webservicex.net/ConvertTemperature.asmx?WSDL

-keep                     keep generated files
-s <directory>            specify where to place generated source files

I this example I made use of WSDL defined at this location to generate portable artifacts
http://www.webservicex.net/ConvertTemperature.asmx?WSDL

WSDL contains contract of web service. WSDL contains what all operations are availabe,
arguments required and return types.
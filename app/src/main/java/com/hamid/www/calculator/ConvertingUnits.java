package com.hamid.www.calculator;

/**
 * Created by 007 on 8/23/2017.
 */

class ConvertingUnits {
    //class to convert units of area
    static class Area{
        double sqMilliToMeter(double milli)
        {
            return (milli/1000000);
        }

        double sqMeterToMilli(double meter)
        {
            return (meter*1000000);
        }

        double sqCentiToMeter(double Centi)
        {
            return (Centi/10000);
        }

        double sqMeterToCenti(double meter)
        {
            return (meter*10000);
        }

        double sqKiloToMeter(double Kilo)
        {
            return (Kilo*1000000);
        }

        double sqMeterToKilo(double meter)
        {
            return (meter/1000000);
        }

        double AcreToMeter(double acre)
        {
            return (acre*4046.86);
        }

        double sqMeterToAcre(double meter)
        {
            return (meter/4046.86);
        }

        double HectareToMeter(double Hectare)
        {
            return (Hectare*10000);
        }

        double sqMeterToHectare(double meter)
        {
            return (meter/10000);
        }
    }

    //class to convert units of length
    static class Length{
        double MilliToMeter(double milli)
        {
            return (milli/1000);
        }

        double MeterToMilli(double meter)
        {
            return (meter*1000);
        }

        double CentiToMeter(double Centi)
        {
            return (Centi/100);
        }

        double MeterToCenti(double meter)
        {
            return (meter*100);
        }

        double KiloToMeter(double Kilo)
        {
            return (Kilo*1000);
        }

        double MeterToKilo(double meter)
        {
            return (meter/1000);
        }

        double InchToMeter(double Inch)
        {
            return (Inch/39.3701);
        }

        double MeterToInch(double meter)
        {
            return (meter*39.3701);
        }

        double FootToMeter(double Foot)
        {
            return (Foot/3.28084);
        }

        double MeterToFoot(double meter)
        {
            return (meter*3.28084);
        }

        double YardToMeter(double Yard)
        {
            return (Yard/1.09361);
        }

        double MeterToYard(double meter)
        {
            return (meter*1.09361);
        }

        double MileToMeter(double Mile)
        {
            return (Mile/0.000621371);
        }

        double MeterToMile(double meter)
        {
            return (meter*0.000621371);
        }

        double NanoToMeter(double milli)
        {
            return (milli/1000000000);
        }

        double MeterToNano(double meter)
        {
            return (meter*1000000000);
        }

    }

    //class to convert units of temperature
    static class Temperature{
        double FerToKelvin(double fer)
        {
            return ((fer+459.67)*5/9);
        }

        double KelvinToFer(double kelvin)
        {
            return ((kelvin*9/5)-459.67);
        }

        double CelsiTokelvin(double Celsi)
        {
            return (Celsi+273.15);
        }

        double KelvinToCelsi(double Kelvin)
        {
            return (Kelvin-273.15);
        }
    }

    //class to convert units of mass/weight
    static class Weight
    {
        double MilliToKilo(double milli)
        {
            return (milli/1000000);
        }

        double KiloToMilli(double Kilo)
        {
            return (Kilo*1000000);
        }

        double GramToKilo(double Gram)
        {
            return (Gram/1000);
        }

        double KiloToGram(double Kilo)
        {
            return (Kilo*1000);
        }

        double CentiToKilo(double Centi)
        {
            return (Centi/100000);
        }

        double KiloToCenti(double Kilo)
        {
            return (Kilo*100000);
        }

        double DeciToKilo(double Deci)
        {
            return (Deci/10000);
        }

        double KiloToDeci(double Kilo)
        {
            return (Kilo*10000);
        }

        double MetricTonnesToKilo(double MetricTonnes)
        {
            return (MetricTonnes*1000);
        }

        double KiloToMetricTonnes(double Kilo)
        {
            return (Kilo/1000);
        }

        double PoundsToKilo(double Pounds)
        {
            return (Pounds/2.20462);
        }

        double KiloToPounds(double Kilo)
        {
            return (Kilo*2.20462);
        }

        double OuncesToKilo(double Ounces)
        {
            return (Ounces/35.274);
        }

        double KiloToOunces(double Kilo)
        {
            return (Kilo*35.274);
        }
    }

    static class Data
    {
        double bitToByte (double bits) {return bits/8;}

        double bitToKiloByte (double bits) {return bitToByte(bits)/1000;}

        double bitToMegaByte (double bits) {return bitToKiloByte(bits)/1000;}

        double bitToGigaByte (double bits) {return bitToMegaByte(bits)/1000;}

        double bitToTeraByte (double bits) {return bitToGigaByte(bits)/1000;}

        double byteToBit (double bytes) {return bytes*8;}

        double byteToKiloByte (double bytes) {return bytes/1000;}

        double byteToMegaByte (double bytes) {return byteToKiloByte(bytes)/1000;}

        double byteToGigaByte (double bytes) {return  byteToMegaByte(bytes)/1000;}

        double byteToTeraByte (double bytes) {return byteToGigaByte(bytes)/1000;}

        double kiloByteToBit (double kiloBytes) {return byteToBit(kiloBytes)*1000;}                                          //bit
                                                                                                                        //byte
        double kiloByteToByte (double kiloBytes) {return kiloBytes*1000;}                                        //kilobyte
                                                                                                                        //megabyte
        double kiloByteToMegaByte (double kiloBytes) {return kiloBytes/1000;}                                    //gigabyte
                                                                                                                        //terabyte
        double kiloByteToGigaByte (double kiloBytes) {return kiloByteToMegaByte(kiloBytes)/1000;}

        double kiloByteToTeraByte (double kiloBytes) {return kiloByteToGigaByte(kiloBytes)/1000;}

        double megaByteToBit (double megaByte){return kiloByteToBit(megaByte)*1000;}

        double megaByteToByte (double megaByte) {return kiloByteToByte(megaByte)*1000;}
  
        double megaByteToKiloByte (double megaByte) {return megaByteToByte(megaByte)*1000;}
        
        double megaByteToGigabyte (double megaByte) {return kiloByteToGigaByte(megaByte)/1000;}
        
        double megaByteToTeraByte (double megaByte) {return megaByteToGigabyte(megaByte)/1000;}
        
        double gigaByteToBit (double gigaByte) {return megaByteToBit(gigaByte)*1000;}

        double gigaByteToByte (double gigaByte) {return megaByteToByte(gigaByte)*1000;}

        double gigaByteToKileByte (double gigaByte) {return gigaByteToByte(gigaByte)*1000;}

        double gigaByteToMegaByte (double gigaByte) {return gigaByteToKileByte(gigaByte)*1000;}

        double gigaByteToTeraByte (double gigaByte) {return megaByteToTeraByte(gigaByte)/1000;}

        double teraByteToBit (double teraByte) {return gigaByteToBit(teraByte)*1000;}

        double teraByteToByte (double teraByte) {return gigaByteToByte(teraByte)*1000;}

        double teraByteToKiloByte (double teraByte) {return teraByteToByte(teraByte)*1000;}

        double teraByteToMegaByte (double teraByte) {return teraByteToKiloByte(teraByte)*1000;}

        double teraByteToGigaByte (double teraByte) {return teraByteToMegaByte(teraByte)*1000;}
    }
}

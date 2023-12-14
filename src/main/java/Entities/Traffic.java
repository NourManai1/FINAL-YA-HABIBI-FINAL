/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Traffic implements Serializable {
    public String ID;
    public String Source;
    public int Severity;
    public String Start_Time;
    public String End_Time;
    public double Start_Lat;
    public double Start_Lng;
    public double Distance;
    public String Description;
    public String Street;
    public String City;
    public String County;
    public String State;
    public String Zipcode;
    public String Country;
    public String Timezone;
    public String Airport_Code;
    public String Weather_Timestamp;
    public double Temperature;
    public double Wind_Chill;
    public double Humidity;
    public double Pressure;
    public double Visibility;
    public String Wind_Direction;
    public double Wind_Speed;
    public double Precipitation;
    public String Weather_Condition;
    public String Amenity;
    public String Bump;
    public String Crossing;
    public String Give_Way;
    public String Junction;
    public String No_Exit;
    public String Railway;
    public String Roundabout;
    public String Station;
    public String Stop;
    public String Traffic_Calming;
    public String Traffic_Signal;
    public String Turning_Loop;
    public String Sunrise_Sunset;
    public String Civil_Twilight;
    public String Nautical_Twilight;
    public String Astronomical_Twilight;

    /**
     * @return the ID
     */
    @XmlElement(name = "ID")
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

  
    /**
     * @return the Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * @param Source the Source to set
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * @return the Severity
     */
    public int getSeverity() {
        return Severity;
    }

    /**
     * @param Severity the Severity to set
     */
    public void setSeverity(int Severity) {
        this.Severity = Severity;
    }

    /**
     * @return the Start_Time
     */
    public String getStart_Time() {
        return Start_Time;
    }

    /**
     * @param Start_Time the Start_Time to set
     */
    public void setStart_Time(String Start_Time) {
        this.Start_Time = Start_Time;
    }

    /**
     * @return the End_Time
     */
    public String getEnd_Time() {
        return End_Time;
    }

    /**
     * @param End_Time the End_Time to set
     */
    public void setEnd_Time(String End_Time) {
        this.End_Time = End_Time;
    }

    /**
     * @return the Start_Lat
     */
    public double getStart_Lat() {
        return Start_Lat;
    }

    /**
     * @param Start_Lat the Start_Lat to set
     */
    public void setStart_Lat(double Start_Lat) {
        this.Start_Lat = Start_Lat;
    }

    /**
     * @return the Start_Lng
     */
    public double getStart_Lng() {
        return Start_Lng;
    }

    /**
     * @param Start_Lng the Start_Lng to set
     */
    public void setStart_Lng(double Start_Lng) {
        this.Start_Lng = Start_Lng;
    }

    /**
     * @return the Distance
     */
    public double getDistance() {
        return Distance;
    }

    /**
     * @param Distance the Distance to set
     */
    public void setDistance(double Distance) {
        this.Distance = Distance;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Street
     */
    public String getStreet() {
        return Street;
    }

    /**
     * @param Street the Street to set
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the County
     */
    public String getCounty() {
        return County;
    }

    /**
     * @param County the County to set
     */
    public void setCounty(String County) {
        this.County = County;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * @return the Zipcode
     */
    public String getZipcode() {
        return Zipcode;
    }

    /**
     * @param Zipcode the Zipcode to set
     */
    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the Country to set
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return the Timezone
     */
    public String getTimezone() {
        return Timezone;
    }

    /**
     * @param Timezone the Timezone to set
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * @return the Airport_Code
     */
    public String getAirport_Code() {
        return Airport_Code;
    }

    /**
     * @param Airport_Code the Airport_Code to set
     */
    public void setAirport_Code(String Airport_Code) {
        this.Airport_Code = Airport_Code;
    }

    /**
     * @return the Weather_Timestamp
     */
    public String getWeather_Timestamp() {
        return Weather_Timestamp;
    }

    /**
     * @param Weather_Timestamp the Weather_Timestamp to set
     */
    public void setWeather_Timestamp(String Weather_Timestamp) {
        this.Weather_Timestamp = Weather_Timestamp;
    }

    /**
     * @return the Temperature
     */
    public double getTemperature() {
        return Temperature;
    }

    /**
     * @param Temperature the Temperature to set
     */
    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * @return the Wind_Chill
     */
    public double getWind_Chill() {
        return Wind_Chill;
    }

    /**
     * @param Wind_Chill the Wind_Chill to set
     */
    public void setWind_Chill(double Wind_Chill) {
        this.Wind_Chill = Wind_Chill;
    }

    /**
     * @return the Humidity
     */
    public double getHumidity() {
        return Humidity;
    }

    /**
     * @param Humidity the Humidity to set
     */
    public void setHumidity(double Humidity) {
        this.Humidity = Humidity;
    }

    /**
     * @return the Pressure
     */
    public double getPressure() {
        return Pressure;
    }

    /**
     * @param Pressure the Pressure to set
     */
    public void setPressure(double Pressure) {
        this.Pressure = Pressure;
    }

    /**
     * @return the Visibility
     */
    public double getVisibility() {
        return Visibility;
    }

    /**
     * @param Visibility the Visibility to set
     */
    public void setVisibility(double Visibility) {
        this.Visibility = Visibility;
    }

    /**
     * @return the Wind_Direction
     */
    public String getWind_Direction() {
        return Wind_Direction;
    }

    /**
     * @param Wind_Direction the Wind_Direction to set
     */
    public void setWind_Direction(String Wind_Direction) {
        this.Wind_Direction = Wind_Direction;
    }

    /**
     * @return the Wind_Speed
     */
    public double getWind_Speed() {
        return Wind_Speed;
    }

    /**
     * @param Wind_Speed the Wind_Speed to set
     */
    public void setWind_Speed(double Wind_Speed) {
        this.Wind_Speed = Wind_Speed;
    }

    /**
     * @return the Precipitation
     */
    public double getPrecipitation() {
        return Precipitation;
    }

    /**
     * @param Precipitation the Precipitation to set
     */
    public void setPrecipitation(double Precipitation) {
        this.Precipitation = Precipitation;
    }

    /**
     * @return the Weather_Condition
     */
    public String getWeather_Condition() {
        return Weather_Condition;
    }

    /**
     * @param Weather_Condition the Weather_Condition to set
     */
    public void setWeather_Condition(String Weather_Condition) {
        this.Weather_Condition = Weather_Condition;
    }

    /**
     * @return the Amenity
     */
    public String getAmenity() {
        return Amenity;
    }

    /**
     * @param Amenity the Amenity to set
     */
    public void setAmenity(String Amenity) {
        this.Amenity = Amenity;
    }

    /**
     * @return the Bump
     */
    public String getBump() {
        return Bump;
    }

    /**
     * @param Bump the Bump to set
     */
    public void setBump(String Bump) {
        this.Bump = Bump;
    }

    /**
     * @return the Crossing
     */
    public String getCrossing() {
        return Crossing;
    }

    /**
     * @param Crossing the Crossing to set
     */
    public void setCrossing(String Crossing) {
        this.Crossing = Crossing;
    }

    /**
     * @return the Give_Way
     */
    public String getGive_Way() {
        return Give_Way;
    }

    /**
     * @param Give_Way the Give_Way to set
     */
    public void setGive_Way(String Give_Way) {
        this.Give_Way = Give_Way;
    }

    /**
     * @return the Junction
     */
    public String getJunction() {
        return Junction;
    }

    /**
     * @param Junction the Junction to set
     */
    public void setJunction(String Junction) {
        this.Junction = Junction;
    }

    /**
     * @return the No_Exit
     */
    public String getNo_Exit() {
        return No_Exit;
    }

    /**
     * @param No_Exit the No_Exit to set
     */
    public void setNo_Exit(String No_Exit) {
        this.No_Exit = No_Exit;
    }

    /**
     * @return the Railway
     */
    public String getRailway() {
        return Railway;
    }

    /**
     * @param Railway the Railway to set
     */
    public void setRailway(String Railway) {
        this.Railway = Railway;
    }

    /**
     * @return the Roundabout
     */
    public String getRoundabout() {
        return Roundabout;
    }

    /**
     * @param Roundabout the Roundabout to set
     */
    public void setRoundabout(String Roundabout) {
        this.Roundabout = Roundabout;
    }

    /**
     * @return the Station
     */
    public String getStation() {
        return Station;
    }

    /**
     * @param Station the Station to set
     */
    public void setStation(String Station) {
        this.Station = Station;
    }

    /**
     * @return the Stop
     */
    public String getStop() {
        return Stop;
    }

    /**
     * @param Stop the Stop to set
     */
    public void setStop(String Stop) {
        this.Stop = Stop;
    }

    /**
     * @return the Traffic_Calming
     */
    public String getTraffic_Calming() {
        return Traffic_Calming;
    }

    /**
     * @param Traffic_Calming the Traffic_Calming to set
     */
    public void setTraffic_Calming(String Traffic_Calming) {
        this.Traffic_Calming = Traffic_Calming;
    }

    /**
     * @return the Traffic_Signal
     */
    public String getTraffic_Signal() {
        return Traffic_Signal;
    }

    /**
     * @param Traffic_Signal the Traffic_Signal to set
     */
    public void setTraffic_Signal(String Traffic_Signal) {
        this.Traffic_Signal = Traffic_Signal;
    }

    /**
     * @return the Turning_Loop
     */
    public String getTurning_Loop() {
        return Turning_Loop;
    }

    /**
     * @param Turning_Loop the Turning_Loop to set
     */
    public void setTurning_Loop(String Turning_Loop) {
        this.Turning_Loop = Turning_Loop;
    }

    /**
     * @return the Sunrise_Sunset
     */
    public String getSunrise_Sunset() {
        return Sunrise_Sunset;
    }

    /**
     * @param Sunrise_Sunset the Sunrise_Sunset to set
     */
    public void setSunrise_Sunset(String Sunrise_Sunset) {
        this.Sunrise_Sunset = Sunrise_Sunset;
    }

    /**
     * @return the Civil_Twilight
     */
    public String getCivil_Twilight() {
        return Civil_Twilight;
    }

    /**
     * @param Civil_Twilight the Civil_Twilight to set
     */
    public void setCivil_Twilight(String Civil_Twilight) {
        this.Civil_Twilight = Civil_Twilight;
    }

    /**
     * @return the Nautical_Twilight
     */
    public String getNautical_Twilight() {
        return Nautical_Twilight;
    }

    /**
     * @param Nautical_Twilight the Nautical_Twilight to set
     */
    public void setNautical_Twilight(String Nautical_Twilight) {
        this.Nautical_Twilight = Nautical_Twilight;
    }

    /**
     * @return the Astronomical_Twilight
     */
    public String getAstronomical_Twilight() {
        return Astronomical_Twilight;
    }

    /**
     * @param Astronomical_Twilight the Astronomical_Twilight to set
     */
    public void setAstronomical_Twilight(String Astronomical_Twilight) {
        this.Astronomical_Twilight = Astronomical_Twilight;
    }
}

package uk.ac.mmu.cnt2;


import java.util.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


class FridgeData {
	
	
	
	private String millis;
	private String stamp;
	private String datetime;
	private String light;
	private String temp;
	private String vcc;
	
	@XmlElement(name = "millis")
	public String getMillis() {
		return millis;
	}
	public void setMillis(String millis) {
		this.millis = millis;
	}
	@XmlElement(name = "stamp")
	public String getStamp() {
		return stamp;
	}
	public void setStamp(String stamp) {
		this.stamp = stamp;
	}
	@XmlElement(name = "datetime")
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	@XmlElement(name = "light")
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}
	@XmlElement(name = "temp")
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	@XmlElement(name = "vcc")
	public String getVcc() {
		return vcc;
	}
	public void setVcc(String vcc) {
		this.vcc = vcc;
	}
	
	@Override
	public String toString() {
		return "FidgeData [millis =" + millis + ", stamp =" + stamp + ", datetime =" + datetime + ", light =" + light
				+ ", temp =" + temp + ", vcc =" + vcc + "]";
	}
	

}

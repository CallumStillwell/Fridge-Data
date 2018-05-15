package uk.ac.mmu.cnt2;


import java.util.*;



class FData {
	
	private String millis;
	private String stamp;
	private String datetime;
	private String light;
	private String temp;
	private String vcc;
	
	
	public String getMillis() {
		return millis;
	}
	public void setMillis(String millis) {
		this.millis = millis;
	}
	
	public String getStamp() {
		return stamp;
	}
	public void setStamp(String stamp) {
		this.stamp = stamp;
	}
	
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}

	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	public String getVcc() {
		return vcc;
	}
	public void setVcc(String vcc) {
		this.vcc = vcc;
	}
	
	@Override
	public String toString() {
		return "FidgeData [millis = " + millis + ", stamp = " + stamp + ", datetime = " + datetime + ", light = " + light
				+ ", temp = " + temp + ", vcc = " + vcc + "]";
	}
	

}

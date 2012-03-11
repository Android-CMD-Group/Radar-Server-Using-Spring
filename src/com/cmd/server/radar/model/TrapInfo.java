package com.cmd.server.radar.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trapInfo", propOrder = {
    "loc",
    "speed",
    "accuracy",
    "bearing",
    "timeReported",
    "timeOfLocation",
    "id"
})
@XmlRootElement(name = "TrapInfo")
public class TrapInfo {
	
	private double[] loc;
	private double speed;
	private double accuracy;
	private double bearing;
	private long timeReported;
	private long timeOfLocation;
	private String id;
	

	public double[] getLoc() {
		return loc;
	}


	public void setLoc(double[] loc) {
		this.loc = loc;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public double getAccuracy() {
		return accuracy;
	}


	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}


	public double getBearing() {
		return bearing;
	}


	public void setBearing(double bearing) {
		this.bearing = bearing;
	}


	public long getTimeReported() {
		return timeReported;
	}


	public void setTimeReported(long timeReported) {
		this.timeReported = timeReported;
	}


	public long getTimeOfLocation() {
		return timeOfLocation;
	}


	public void setTimeOfLocation(long timeOfLocation) {
		this.timeOfLocation = timeOfLocation;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String toString(){
		return "" + " " + speed + " " + accuracy + " " + bearing + " " + timeReported + " " + timeOfLocation + " " + id;
		
	}
}

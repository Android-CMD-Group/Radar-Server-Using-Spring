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
    "timeAtShake",
    "timeAtLocation",
    "androidID"
})
@XmlRootElement(name = "TrapInfo")
public class TrapInfo {
	
	private double[] loc;
	private double speed;
	private double accuracy;
	private double bearing;
	private long timeAtShake;
	private long timeAtLocation;
	private String androidID;
	
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
	public long getTimeAtShake() {
		return timeAtShake;
	}
	public void setTimeAtShake(long timeAtShake) {
		this.timeAtShake = timeAtShake;
	}
	public long getTimeAtLocation() {
		return timeAtLocation;
	}
	public void setTimeAtLocation(long timeAtLocation) {
		this.timeAtLocation = timeAtLocation;
	}
	public String getAndroidID() {
		return androidID;
	}
	public void setAndroidID(String androidID) {
		this.androidID = androidID;
	}
	
	public String toString(){
		return "" + " " + speed + " " + accuracy + " " + bearing + " " + timeAtShake + " " + timeAtLocation + " " + androidID;
		
	}
}

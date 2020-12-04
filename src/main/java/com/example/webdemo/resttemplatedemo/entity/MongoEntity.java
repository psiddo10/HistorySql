package com.example.webdemo.resttemplatedemo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MongoEntity {

private long time;
	
	private double close;
	private double high;
	private double low;
	private double open;
	private double volumefrom;
	private double volumeto;
	private String conversionType;
	private double buy;
	private double sell;
	private long at;
	
public MongoEntity() {}

public MongoEntity(long time, double close, double high, double low, double open, double volumefrom, double volumeto,
		String conversionType, double buy, double sell, long at) {
	super();
	this.time = time;
	this.close = close;
	this.high = high;
	this.low = low;
	this.open = open;
	this.volumefrom = volumefrom;
	this.volumeto = volumeto;
	this.conversionType = conversionType;
	this.buy = buy;
	this.sell = sell;
	this.at = at;
}

public long getTime() {
	return time;
}

public void setTime(long time) {
	this.time = time;
}

public double getClose() {
	return close;
}

public void setClose(double close) {
	this.close = close;
}

public double getHigh() {
	return high;
}

public void setHigh(double high) {
	this.high = high;
}

public double getLow() {
	return low;
}

public void setLow(double low) {
	this.low = low;
}

public double getOpen() {
	return open;
}

public void setOpen(double open) {
	this.open = open;
}

public double getVolumefrom() {
	return volumefrom;
}

public void setVolumefrom(double volumefrom) {
	this.volumefrom = volumefrom;
}

public double getVolumeto() {
	return volumeto;
}

public void setVolumeto(double volumeto) {
	this.volumeto = volumeto;
}

public String getConversionType() {
	return conversionType;
}

public void setConversionType(String conversionType) {
	this.conversionType = conversionType;
}

public double getBuy() {
	return buy;
}

public void setBuy(double buy) {
	this.buy = buy;
}

public double getSell() {
	return sell;
}

public void setSell(double sell) {
	this.sell = sell;
}

public long getAt() {
	return at;
}

public void setAt(long at) {
	this.at = at;
}

@Override
public String toString() {
	return "MongoEntity [time=" + time + ", close=" + close + ", high=" + high + ", low=" + low + ", open=" + open
			+ ", volumefrom=" + volumefrom + ", volumeto=" + volumeto + ", conversionType=" + conversionType + ", buy="
			+ buy + ", sell=" + sell + ", at=" + at + "]";
}




}

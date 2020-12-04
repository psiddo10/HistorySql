package com.example.webdemo.resttemplatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history1")
public class RestTemplateEntity1 {

	@Column(name="symbol")
	private String symbol;

		
		@Column(name="close")
		private double close;
		

		@Column(name="high")
		private double high;
		
		@Column(name="low")
		private double low;
		
		@Column(name="open")
		private double open;
		
		@Column(name="volumefrom")
		private double volumefrom;
		
		@Column(name="volumeto")
		private double volumeto;
		
		@Column(name="conversiontype")
		private String conversionType;
		@Column(name="buy")
		private double buy;
		@Column(name="sell")
		private double sell;
		@Column(name="at")
		private long at;
		
		public RestTemplateEntity1() {}

		public RestTemplateEntity1(double close, double high, double low, double open, double volumefrom,
				double volumeto, String conversionType, double buy, double sell, long at) {
			super();
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
			return "RestTemplateEntity [close=" + close + ", high=" + high + ", low=" + low + ", open=" + open
					+ ", volumefrom=" + volumefrom + ", volumeto=" + volumeto + ", conversionType=" + conversionType
					+ ", buy=" + buy + ", sell=" + sell + ", at=" + at + "]";
		}
	
		
		
}

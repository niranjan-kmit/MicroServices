package org.kafka.loadgenerator.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class PayLoadMessage {

	private long publishTS;

	private List<ServiceInfo> services;

	private List<DataPoint> dataPoints;
	
	public PayLoadMessage() {
		
		this.publishTS = System.currentTimeMillis();
		services=new ArrayList<ServiceInfo>();
		dataPoints=new ArrayList<DataPoint>();
	}

	public PayLoadMessage(Instant publishTS, List<ServiceInfo> services, List<DataPoint> dataPoints) {
		super();
		this.publishTS = System.currentTimeMillis();
		this.services = services;
		this.dataPoints = dataPoints;
	}

	public long getPublishTS() {
		return publishTS;
	}

	public void setPublishTS(long publishTS) {
		this.publishTS = publishTS;
	}

	public List<ServiceInfo> getServices() {
		return services;
	}

	public void setService(List<ServiceInfo> services) {
		this.services = services;
	}

	public List<DataPoint> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoint(List<DataPoint> dataPoints) {
		this.dataPoints = dataPoints;
	}

	@Override
	public String toString() {
		return "PayLoadMessage [publishTS=" + publishTS + ", service=" + services + ", dataPoint=" + dataPoints + "]";
	}

}

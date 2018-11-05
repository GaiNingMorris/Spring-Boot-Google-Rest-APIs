package com.cayuse.codingTest.domain;

import java.io.Serializable;

/**
 * TimeZone Response
 * @author ningm
 *
 */
public class TimeZoneResponse implements Serializable {

	private static final long serialVersionUID = 2413421330030939477L;

	// dst offsert
	private String dstOffset;
	
	// raw offset
	private String rawOffset;
	
	//status
	private String status;
	
	// time zone id
	private String timeZoneId;
	
	// time zone name
	private String timeZoneName;

	public String getDstOffset() {
		return dstOffset;
	}

	public void setDstOffset(String dstOffset) {
		this.dstOffset = dstOffset;
	}

	public String getRawOffset() {
		return rawOffset;
	}

	public void setRawOffset(String rawOffset) {
		this.rawOffset = rawOffset;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public String getTimeZoneName() {
		return timeZoneName;
	}

	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}

	@Override
	public String toString() {
		return "TimeZoneResponse [dstOffset=" + dstOffset + ", rawOffset=" + rawOffset + ", status=" + status
				+ ", timeZoneId=" + timeZoneId + ", timeZoneName=" + timeZoneName + "]";
	}
}

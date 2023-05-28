package com.sprinCore.standalone.collection;

import java.util.Map;
import java.util.Properties;

public class MapFeeStructure {
	private Map<String, Integer> feeStructure;
	private Properties proper;

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	@Override
	public String toString() {
		return "MapFeeStructure [feeStructure=" + feeStructure + ", proper=" + proper + "]";
	}

	public Properties getProper() {
		return proper;
	}

	public void setProper(Properties proper) {
		this.proper = proper;
	}

}

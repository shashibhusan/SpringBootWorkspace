package com.shashi;

public class IndicatorData {
    
    public String getTechnicalObjectId() {
		return technicalObjectId;
	}

	public void setTechnicalObjectId(String technicalObjectId) {
		this.technicalObjectId = technicalObjectId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCharacteristics_ID() {
		return characteristics_ID;
	}

	public void setCharacteristics_ID(String characteristics_ID) {
		this.characteristics_ID = characteristics_ID;
	}

	public String getMeasuringPointId() {
		return measuringPointId;
	}

	public void setMeasuringPointId(String measuringPointId) {
		this.measuringPointId = measuringPointId;
	}
	public IndicatorData(String technicalObjectId, String position, String characteristics_ID,
			String measuringPointId) {
		super();
		this.technicalObjectId = technicalObjectId;
		this.position = position;
		this.characteristics_ID = characteristics_ID;
		this.measuringPointId = measuringPointId;
	}


	private String technicalObjectId;
	
	private String position;

    private String characteristics_ID;
    
    private String  measuringPointId;

    
}


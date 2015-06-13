package com.lissi.parisest.readontology.imp;

import com.lissi.parisest.readontology.MCType;

public class TimeType extends TimeElementType {

	public TimeType() {
		this.setName("Time");
		this.setPrimitive(false);

	}

	@Override
	public boolean instanceOf(MCType childType) {
		if (childType instanceof ThingType) {
			return true;
		}
		return childType.getClass().equals(TimeType.class) || childType.getClass().equals(TimeElementType.class);
	}

	@Override
	public boolean isMicroConcept() {
		return false;
	}

	@Override
	public void setMicroConcept(boolean microConcept) {
		// TODO Auto-generated method stub

	}

	@Override
	public MCType copy() {
		TimeType newType = new TimeType();
		newType.setName(getName());
		newType.setPrimitive(isPrimitive());
		return newType;
	}

}

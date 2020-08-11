package com.t05g1.service;

import java.util.List;

import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.PropertyValue;

public interface PropertyValueService {
	
	    void init(Commodity com);
	    void update(PropertyValue pv);
	 
	    PropertyValue get(int ptId, int commId);
	    List<PropertyValue> list(int commId);

}

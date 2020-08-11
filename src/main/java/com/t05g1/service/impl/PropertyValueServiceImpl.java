package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.PropertyValueDao;
import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.Property;
import com.t05g1.pojo.PropertyValue;
import com.t05g1.pojo.PropertyValueExample;
import com.t05g1.service.PropertyService;
import com.t05g1.service.PropertyValueService;

@Service
public class PropertyValueServiceImpl implements PropertyValueService {

	
	 @Autowired
	 PropertyValueDao propertyValueDao;
	 
	@Autowired
	 PropertyService propertyService;
	
	@Override
	public void init(Commodity com) {
		// TODO Auto-generated method stub
		List<Property> pts = propertyService.list(com.getC_categoryId());
		
		for (Property property : pts) {
			PropertyValue pv = get(property.getId(),com.getC_id());
			if(null==pv) {
				pv = new PropertyValue();
				pv.setCommId(com.getC_id());
				pv.setPtId(property.getId());
				propertyValueDao.insert(pv);
			}
		}
		
	}

	@Override
	public void update(PropertyValue pv) {
		// TODO Auto-generated method stub
		propertyValueDao.updateByPrimaryKeySelective(pv);
	}

	@Override
	public PropertyValue get(int ptId,int commId) {
		// TODO Auto-generated method stub
		    PropertyValueExample example = new PropertyValueExample();
	        example.createCriteria().andPtIdEqualTo(ptId).andCommIdEqualTo(commId);
	        List<PropertyValue> pvs= propertyValueDao.selectByExample(example);
	        if (pvs.isEmpty())
	            return null;
	        return pvs.get(0);
	}

	@Override
	public List<PropertyValue> list(int commId) {
		// TODO Auto-generated method stub
		 PropertyValueExample example = new PropertyValueExample();
	        example.createCriteria().andCommIdEqualTo(commId);
	        List<PropertyValue> result = propertyValueDao.selectByExample(example);
	        for (PropertyValue pv : result) {
	            Property property = propertyService.get(pv.getPtId());
	            pv.setProperty(property);
	        }
	        return result;
	}

}

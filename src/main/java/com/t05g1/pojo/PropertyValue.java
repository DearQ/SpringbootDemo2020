package com.t05g1.pojo;

public class PropertyValue {
    private Integer id;

    private Integer commId;

    private Integer ptId;

    private String value;
    
    //非数据库字段
    private Property property;

    public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

	@Override
	public String toString() {
		return "PropertyValue [id=" + id + ", commId=" + commId + ", ptId=" + ptId + ", value=" + value + ", property="
				+ property + "]";
	}
    
    
}
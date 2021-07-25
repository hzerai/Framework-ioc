//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.03 at 09:11:05 PM GMT+01:00 
//

package com.hzerai.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bean")
@XmlRootElement(name = "bean")
public class BeanDefinition {
	@XmlAttribute(name = "class")
	protected String cls;
	@XmlAttribute(name = "name")
	protected String name;
	@XmlAttribute(name = "scope")
	protected String scope;

	protected List<PropertyDefinition> property;
	protected List<BeanDefinition> bean;

	/**
	 * Gets the value of the property property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the property property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProperty().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PropertyType
	 * }
	 * 
	 * 
	 */
	public List<PropertyDefinition> getProperty() {
		if (property == null) {
			property = new ArrayList<PropertyDefinition>();
		}
		return this.property;
	}

	/**
	 * Gets the value of the bean property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the bean property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBean().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link BeanType }
	 * 
	 * 
	 */
	public List<BeanDefinition> getBean() {
		if (bean == null) {
			bean = new ArrayList<BeanDefinition>();
		}
		return this.bean;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperty(List<PropertyDefinition> property) {
		this.property = property;
	}

	public void setBean(List<BeanDefinition> bean) {
		this.bean = bean;
	}

}

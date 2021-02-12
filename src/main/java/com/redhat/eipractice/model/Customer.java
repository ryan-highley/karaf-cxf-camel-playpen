package com.redhat.eipractice.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="customer", namespace="http://model.eipractice.redhat.com/order/1.0/", propOrder={"name", "city", "country"})
public class Customer {
  
  @XmlAttribute(required=true)
  private String id;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private String name;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private String city;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private String country;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
}

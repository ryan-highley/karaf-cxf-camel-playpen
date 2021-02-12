package com.redhat.eipractice.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="article", namespace="http://model.eipractice.redhat.com/order/1.0/", propOrder={ "description" })
public class Article {
  
  @XmlAttribute(required=true)
  private String id;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private String description;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  
}

package com.redhat.eipractice.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="order")
@XmlType(name="order", namespace="http://model.eipractice.redhat.com/order/1.0/", propOrder={"customer", "date", "orderlines"})
public class Order {

  @XmlAttribute
  private String id;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private Customer customer;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private Date date;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private OrderLines orderlines;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public OrderLines getOrderlines() {
    return orderlines;
  }
  public void setOrderlines(OrderLines orderlines) {
    this.orderlines = orderlines;
  }


}

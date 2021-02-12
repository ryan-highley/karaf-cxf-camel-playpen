package com.redhat.eipractice.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="orderlines", namespace="http://model.eipractice.redhat.com/order/1.0/")
public class OrderLines {
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private List<OrderLine> orderline;

  public List<OrderLine> getOrderline() {
    return orderline;
  }

  public void setOrderline(List<OrderLine> orderline) {
    this.orderline = orderline;
  }

}

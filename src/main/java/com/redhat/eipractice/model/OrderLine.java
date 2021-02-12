package com.redhat.eipractice.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="orderline", namespace="http://model.eipractice.redhat.com/order/1.0/", propOrder={"article", "quantity"})
public class OrderLine {
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private Article article;
  
  @XmlElement(required=true, namespace="http://model.eipractice.redhat.com/order/1.0/")
  private Integer quantity;
  
  public Article getArticle() {
    return article;
  }
  public void setArticle(Article article) {
    this.article = article;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  
}

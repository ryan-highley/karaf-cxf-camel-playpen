package com.redhat.eipractice;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.redhat.eipractice.model.Order;

public class OrderStorage {
  private static final ConcurrentMap<String, Order> orders = new ConcurrentHashMap<>();
  
  public Order storeOrder(Order order) {
    return orders.putIfAbsent(order.getId(), order);
  }
  
  public Order getOrder(String id) {
    return orders.get(id);
  }
  
  public Collection<Order> getOrders() {
    return orders.values();
  }
}

package com.redhat.eipractice;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.eipractice.model.Order;

public class OrderNumberProcessor implements Processor {
  private static final Logger LOGGER = LoggerFactory.getLogger(OrderNumberProcessor.class);

  private static final AtomicLong orderId = new AtomicLong(0L);
  
  @Override
  public void process(Exchange exch) throws Exception {
    Order order = exch.getIn().getBody(Order.class);
    if(order == null) {
      LOGGER.error("Message body is not an Order | body = %s", exch.getIn().getBody());
      throw new IllegalStateException("Message body is not an Order");
    }

    LOGGER.info("Exchange=%s", exch);
    
    String id = String.format("%09d", orderId.incrementAndGet());
    
    LOGGER.info("Assigning order id | id=%s", id);
    
    order.setId(id);
    
    exch.getIn().setBody(order);
  }

}

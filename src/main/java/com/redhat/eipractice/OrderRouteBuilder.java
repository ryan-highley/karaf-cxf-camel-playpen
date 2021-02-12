package com.redhat.eipractice;


import org.apache.camel.builder.RouteBuilder;

public class OrderRouteBuilder extends RouteBuilder {

  @Override
  public void configure() throws Exception {

    from("cxf:bean:orderEndpoint")
      .processRef("orderNumberProcessor")
      .wireTap("seda:incomingOrders")
      ;
    
    from("seda:incomingOrders")
      .beanRef("orderStorage", "storeOrder")
      .to("mock:end")
      ;
  }

}

/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.eipractice;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.redhat.eipractice.model.Order;

@WebService(targetNamespace="http://eipractice.redhat.com/order/1.0/")
public interface OrderEndpoint {

  @WebResult(name="order", targetNamespace="http://model.eipractice.redhat.com/order/1.0/")
  Order placeOrder(@WebParam(name="order", targetNamespace="http://model.eipractice.redhat.com/order/1.0/") Order order);
  
  @WebResult(name="order", targetNamespace="http://model.eipractice.redhat.com/order/1.0/")
  Order getOrder(@WebParam(name="id") String id);
}

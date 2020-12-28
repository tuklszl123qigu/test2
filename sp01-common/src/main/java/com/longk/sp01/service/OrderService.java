package com.longk.sp01.service;

import com.longk.sp01.pojo.Order;
import com.longk.web.util.JsonResult;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);

	
}
package org.raghib.springmvcshoppingcart.dao;

import java.util.List;

import org.raghib.springmvcshoppingcart.model.CartInfo;
import org.raghib.springmvcshoppingcart.model.OrderDetailInfo;
import org.raghib.springmvcshoppingcart.model.OrderInfo;
import org.raghib.springmvcshoppingcart.model.PaginationResult;

public interface OrderDAO {
	
	 public void saveOrder(CartInfo cartInfo);
	 
	    public PaginationResult<OrderInfo> listOrderInfo(int page,
	            int maxResult, int maxNavigationPage);
	    
	    public OrderInfo getOrderInfo(String orderId);
	    
	    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}

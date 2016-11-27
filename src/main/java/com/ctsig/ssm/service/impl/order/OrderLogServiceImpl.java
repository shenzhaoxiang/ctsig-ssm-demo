package com.ctsig.ssm.service.impl.order;

import java.util.Date;

import com.ctsig.ssm.dao.order.OrderLogMapper;
import com.ctsig.ssm.entity.order.OrderLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctsig.ssm.service.order.OrderLogService;

@Service("orderLogService")
public class OrderLogServiceImpl implements OrderLogService {
	
	@Autowired
	private OrderLogMapper orderLogMapper;

	@Override
	public void createOrderLog(String content, String createBy,
			String createType, Integer orderId, String orderNumber) {
		OrderLog orderLog = new OrderLog();
		orderLog.setContent(content);
		orderLog.setCreateBy(createBy);
		orderLog.setCreateTime(new Date());
		orderLog.setCreateType(createType);
		orderLog.setOrderId(orderId);
		orderLog.setOrderNumber(orderNumber);
		orderLogMapper.createOrderLog(orderLog);
	}

}

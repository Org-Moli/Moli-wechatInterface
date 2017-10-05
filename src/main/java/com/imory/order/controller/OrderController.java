package com.imory.order.controller;

import com.imory.base.ResultBean;
import com.imory.order.dao.OrderMapper;
import com.imory.order.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/10/5
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping("/saveOrder")
    public ResultBean saveOrder(Map<String, Object> paramsMap)
    {
        Order order = new Order();
        orderMapper.insert(order);

        ResultBean resultBean = new ResultBean();
        resultBean.setResultCode("0000");
        resultBean.setSuccess(true);
        resultBean.setResultMsg("保存订单成功");
        return resultBean;
    }

}

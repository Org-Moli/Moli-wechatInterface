package com.imory.delivery.controller;

import com.imory.base.ResultBean;
import com.imory.delivery.dao.DeliveryAddressMapper;
import com.imory.delivery.dto.DeliveryAddress;
import com.imory.delivery.dto.DeliveryAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/10/6
 */
@RestController
@RequestMapping("/delivery")
public class DeliveryAddressController {

    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @RequestMapping("/listUserDeliveryAddress")
    public ResultBean listUserDeliveryAddress(Integer userId, Boolean defaultFlag)
    {
        DeliveryAddressExample addressExample = new DeliveryAddressExample();
        DeliveryAddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUser_idEqualTo(userId);
        if(defaultFlag != null && defaultFlag)
        {
            criteria.andIs_default_addressEqualTo(Boolean.TRUE);
        }
        List<DeliveryAddress> deliveryAddressList = deliveryAddressMapper.selectByExample(addressExample);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("deliveryAddressList", deliveryAddressList);

        ResultBean resultBean = new ResultBean();
        resultBean.setResultCode("0000");
        resultBean.setSuccess(true);
        resultBean.setResultMap(resultMap);
        resultBean.setResultMsg("查询收货地址信息成功");
        return resultBean;
    }

}

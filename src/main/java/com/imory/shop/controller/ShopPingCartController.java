package com.imory.shop.controller;

import com.imory.base.ResultBean;
import com.imory.shop.dao.ShopPingCartComMapper;
import com.imory.shop.dao.ShopPingCartMapper;
import com.imory.shop.dto.ShopPingCart;
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
 * @Date 2017/10/5
 */
@RestController
@RequestMapping("/shop")
public class ShopPingCartController {

    @Autowired
    private ShopPingCartComMapper shopPingCartComMapper;

    @Autowired
    private ShopPingCartMapper shopPingCartMapper;

    @RequestMapping("/cartDetail")
    public ResultBean cartDetail(Integer userId)
    {
        List<Map<String,Object>> shopPingCartList = shopPingCartComMapper.cartDetail(userId);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("shopPingCartList", shopPingCartList);
        ResultBean resultBean = new ResultBean();
        resultBean.setResultCode("0000");
        resultBean.setSuccess(true);
        resultBean.setResultMsg("查询购物车信息成功");
        resultBean.setResultMap(resultMap);
        return resultBean;
    }

    @RequestMapping("/deleteCart")
    public ResultBean deleteCart(Integer id)
    {
        ShopPingCart shopPingCart = shopPingCartMapper.selectByPrimaryKey(id);
        shopPingCart.setIs_product_exists(Boolean.FALSE);
        shopPingCartMapper.updateByPrimaryKey(shopPingCart);
        ResultBean resultBean = new ResultBean();
        resultBean.setResultCode("0000");
        resultBean.setSuccess(true);
        resultBean.setResultMsg("删除购物车信息成功");
        return resultBean;
    }

    @RequestMapping("/updateCart")
    public ResultBean updateCart(Integer id, Integer num)
    {
        ShopPingCart shopPingCart = shopPingCartMapper.selectByPrimaryKey(id);
        shopPingCart.setNumber(num);
        shopPingCartMapper.updateByPrimaryKey(shopPingCart);
        ResultBean resultBean = new ResultBean();
        resultBean.setResultCode("0000");
        resultBean.setSuccess(true);
        resultBean.setResultMsg("更新购物车信息成功");
        return resultBean;
    }
}

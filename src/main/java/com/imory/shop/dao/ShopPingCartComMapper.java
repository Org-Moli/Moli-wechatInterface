package com.imory.shop.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
public interface ShopPingCartComMapper {

    @Select({
            "select sc.id,sc.user_id,sc.shop_id,sc.product_id,sc.is_product_exists,sc.number,sc.created_time,",
            "pd.product_name,pd.price,pd.picture_url,pd.market_price",
            "from shoppingcart sc",
            "left join product pd on sc.product_id = pd.product_id",
            "where sc.is_product_exists = 1"
    })
    List<Map<String,Object>> cartDetail(@Param("userId") Integer userId);
}

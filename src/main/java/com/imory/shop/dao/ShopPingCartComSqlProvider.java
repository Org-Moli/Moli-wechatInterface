package com.imory.shop.dao;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/10/6
 */
public class ShopPingCartComSqlProvider {

    public String orderCart(String ids)
    {
        String[] idsArr = ids.split(",");
        StringBuffer sql = new StringBuffer();
        sql.append("select \n");
        sql.append("sc.id,\n");
        sql.append("sc.user_id,\n");
        sql.append("sc.shop_id,\n");
        sql.append("sc.product_id,\n");
        sql.append("sc.is_product_exists,\n");
        sql.append("sc.number,\n");
        sql.append("sc.created_time,\n");
        sql.append("pd.product_name,\n");
        sql.append("pd.price,\n");
        sql.append("pd.picture_url,\n");
        sql.append("pd.market_price\n");
        sql.append("from shoppingcart sc\n");
        sql.append("left join product pd on sc.product_id = pd.product_id\n");
        sql.append("where sc.is_product_exists = 1 \n");
        sql.append("and sc.id in (\n");
        for (int i = 0; i < idsArr.length; i++)
        {
            if (i != idsArr.length - 1)
            {
                sql.append(Integer.valueOf(idsArr[i]) + ",");
            } else
            {
                sql.append(Integer.valueOf(idsArr[i]));
            }
        }
        sql.append(")");
        return sql.toString();
    }
}

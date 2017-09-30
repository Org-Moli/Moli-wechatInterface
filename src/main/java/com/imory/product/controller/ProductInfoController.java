package com.imory.product.controller;

import com.imory.base.ResultBean;
import com.imory.product.dao.ProductMapper;
import com.imory.product.dto.Product;
import com.imory.product.dto.ProductExample;
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
 * @Date 2017/9/30
 */
@RestController
@RequestMapping("/product")
public class ProductInfoController {

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/listProduct")
    public ResultBean listProduct(Integer indexType, Integer startPos, Integer maxRows)
    {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        if (indexType != null)
        {
            criteria.andIndex_typeEqualTo(indexType);
        }
        String orderBy = "create_time desc ";
        if (startPos != null && maxRows != null)
        {
            orderBy += "limit " + startPos + "," + maxRows;
        }
        productExample.setOrderByClause(orderBy);

        List<Product> productList = productMapper.selectByExample(productExample);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("productList", productList);

        ResultBean resultBean = new ResultBean();
        resultBean.setResultCode("0000");
        resultBean.setSuccess(true);
        resultBean.setResultMsg("查询商品信息成功");
        resultBean.setResultMap(resultMap);
        return resultBean;
    }

}

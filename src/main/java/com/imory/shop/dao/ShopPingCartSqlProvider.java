package com.imory.shop.dao;

import com.imory.shop.dto.ShopPingCart;
import com.imory.shop.dto.ShopPingCartExample;
import com.imory.shop.dto.ShopPingCartExample.Criteria;
import com.imory.shop.dto.ShopPingCartExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class ShopPingCartSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String countByExample(ShopPingCartExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("shoppingcart");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String deleteByExample(ShopPingCartExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("shoppingcart");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String insertSelective(ShopPingCart record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("shoppingcart");
        
        if (record.getUser_id() != null) {
            sql.VALUES("user_id", "#{user_id,jdbcType=INTEGER}");
        }
        
        if (record.getShop_id() != null) {
            sql.VALUES("shop_id", "#{shop_id,jdbcType=INTEGER}");
        }
        
        if (record.getProduct_id() != null) {
            sql.VALUES("product_id", "#{product_id,jdbcType=INTEGER}");
        }
        
        if (record.getIs_product_exists() != null) {
            sql.VALUES("is_product_exists", "#{is_product_exists,jdbcType=BIT}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("number", "#{number,jdbcType=INTEGER}");
        }
        
        if (record.getCreated_time() != null) {
            sql.VALUES("created_time", "#{created_time,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String selectByExample(ShopPingCartExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("shop_id");
        sql.SELECT("product_id");
        sql.SELECT("is_product_exists");
        sql.SELECT("number");
        sql.SELECT("created_time");
        sql.FROM("shoppingcart");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ShopPingCart record = (ShopPingCart) parameter.get("record");
        ShopPingCartExample example = (ShopPingCartExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("shoppingcart");

        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }

        if (record.getUser_id() != null) {
            sql.SET("user_id = #{record.user_id,jdbcType=INTEGER}");
        }

        if (record.getShop_id() != null) {
            sql.SET("shop_id = #{record.shop_id,jdbcType=INTEGER}");
        }

        if (record.getProduct_id() != null) {
            sql.SET("product_id = #{record.product_id,jdbcType=INTEGER}");
        }

        if (record.getIs_product_exists() != null) {
            sql.SET("is_product_exists = #{record.is_product_exists,jdbcType=BIT}");
        }

        if (record.getNumber() != null) {
            sql.SET("number = #{record.number,jdbcType=INTEGER}");
        }

        if (record.getCreated_time() != null) {
            sql.SET("created_time = #{record.created_time,jdbcType=TIMESTAMP}");
        }

        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("shoppingcart");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.user_id,jdbcType=INTEGER}");
        sql.SET("shop_id = #{record.shop_id,jdbcType=INTEGER}");
        sql.SET("product_id = #{record.product_id,jdbcType=INTEGER}");
        sql.SET("is_product_exists = #{record.is_product_exists,jdbcType=BIT}");
        sql.SET("number = #{record.number,jdbcType=INTEGER}");
        sql.SET("created_time = #{record.created_time,jdbcType=TIMESTAMP}");
        
        ShopPingCartExample example = (ShopPingCartExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String updateByPrimaryKeySelective(ShopPingCart record) {
        SQL sql = new SQL();
        sql.UPDATE("shoppingcart");
        
        if (record.getUser_id() != null) {
            sql.SET("user_id = #{user_id,jdbcType=INTEGER}");
        }
        
        if (record.getShop_id() != null) {
            sql.SET("shop_id = #{shop_id,jdbcType=INTEGER}");
        }
        
        if (record.getProduct_id() != null) {
            sql.SET("product_id = #{product_id,jdbcType=INTEGER}");
        }
        
        if (record.getIs_product_exists() != null) {
            sql.SET("is_product_exists = #{is_product_exists,jdbcType=BIT}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("number = #{number,jdbcType=INTEGER}");
        }
        
        if (record.getCreated_time() != null) {
            sql.SET("created_time = #{created_time,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    protected void applyWhere(SQL sql, ShopPingCartExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
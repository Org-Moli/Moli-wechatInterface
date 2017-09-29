package com.imory.utils;

import com.imory.base.ResultBean;
import com.imory.common.dao.PhoneCaptchaMapper;
import com.imory.common.dto.PhoneCaptcha;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.Date;

/**
 * <p>校验验证码</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/29
 */
public class PhoneCaptchaUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /***
     * 校验验证码
     * @param id
     * @param code
     * @param mobile
     * @return
     */
    public static ResultBean checkCode(Integer id, String code, String mobile)
    {
        ResultBean resultBean = new ResultBean();

        PhoneCaptchaMapper phoneCaptchaMapper = (PhoneCaptchaMapper) applicationContext.getBean("phoneCaptchaMapper");
        PhoneCaptcha phoneCaptcha = phoneCaptchaMapper.selectByPrimaryKey(id);
        if (phoneCaptcha == null || !code.equals(phoneCaptcha.getConfirmCode())
                || !mobile.equals(phoneCaptcha.getPhone()))
        {
            resultBean.setResultCode("9999");
            resultBean.setResultMsg("验证码错误");
            resultBean.setSuccess(false);
            return resultBean;
        }

        Date now = new Date();
        if (now.before(phoneCaptcha.getExpireTime()))
        {
            DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) applicationContext.getBean("transactionManager");
            DefaultTransactionDefinition def = new DefaultTransactionDefinition();
            def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 事物隔离级别，开启新事务，这样会比较安全些。
            TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
            try
            {
                //逻辑代码，可以写上你的逻辑处理代码
                phoneCaptcha.setExpireTime(now);
                phoneCaptchaMapper.updateByPrimaryKey(phoneCaptcha);
                transactionManager.commit(status);
            } catch (Exception e)
            {
                transactionManager.rollback(status);
            }
        } else
        {
            resultBean.setResultCode("9999");
            resultBean.setResultMsg("验证码失效");
            resultBean.setSuccess(false);
            return resultBean;
        }

        resultBean.setResultCode("0000");
        resultBean.setResultMsg("验证码成功");
        resultBean.setSuccess(true);
        return resultBean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.applicationContext = applicationContext;
    }
}

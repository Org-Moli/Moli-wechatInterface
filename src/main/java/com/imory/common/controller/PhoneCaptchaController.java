package com.imory.common.controller;

import com.imory.base.ResultBean;
import com.imory.common.dao.PhoneCaptchaMapper;
import com.imory.common.dto.PhoneCaptcha;
import com.imory.common.dto.PhoneCaptchaExample;
import com.imory.utils.CaptchaUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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
@RequestMapping("/phoneCaptcha")
public class PhoneCaptchaController {

    private static Logger logger = Logger.getLogger(PhoneCaptchaController.class);

    @Autowired
    private PhoneCaptchaMapper phoneCaptchaMapper;

    @RequestMapping("/sendCaptCha")
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ResultBean sendCaptCha(String mobile)
    {
        ResultBean resultBean = new ResultBean();

        // 0 检查是否短于60s
        PhoneCaptchaExample phoneCaptchaExample = new PhoneCaptchaExample();
        phoneCaptchaExample.createCriteria().andPhoneEqualTo(mobile);
        phoneCaptchaExample.setOrderByClause(" createTime desc limit 1 ");
        List<PhoneCaptcha> phoneCaptchaList = phoneCaptchaMapper.selectByExample(phoneCaptchaExample);
        if (phoneCaptchaList != null && phoneCaptchaList.size() > 0)
        {
            PhoneCaptcha phoneCaptcha = phoneCaptchaList.get(0);
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MINUTE, -1);
            if (calendar.getTime().before(phoneCaptcha.getCreateTime()))
            {
                resultBean.setSuccess(false);
                resultBean.setResultCode("9999");
                resultBean.setResultMsg("1分钟内不可重复发送");
                return resultBean;
            }
        }

        // 1 生成验证码
        String captcha = CaptchaUtil.genCaptcha(4);

        // 2 将验证码日志记录
        PhoneCaptcha phoneCaptcha = new PhoneCaptcha();
        phoneCaptcha.setConfirmCode(captcha);
        phoneCaptcha.setPhone(mobile);
        // 2.1 将验证码有效期设置为10分钟
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 10);
        phoneCaptcha.setExpireTime(calendar.getTime());
        phoneCaptcha.setCreateTime(new Date());
        phoneCaptchaMapper.insert(phoneCaptcha);
        logger.debug("准备向[" + mobile + "]发送短信验证码[" + captcha + "]");

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("phoneCaptcha", phoneCaptcha);

        resultBean.setSuccess(true);
        resultBean.setResultCode("0000");
        resultBean.setResultMsg("发送验证码成功");
        resultBean.setResultMap(resultMap);
        return resultBean;
    }

}

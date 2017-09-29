package com.imory.user.controller;

import com.imory.base.ResultBean;
import com.imory.user.dao.UserBaseMapper;
import com.imory.user.dto.UserBase;
import com.imory.user.dto.UserBaseExample;
import com.imory.utils.Md5Utils;
import com.imory.utils.PhoneCaptchaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/29
 */
@RestController
@RequestMapping("/userBase")
public class UserBaseController {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @RequestMapping("/login")
    public UserBase login(String mobile, String yzmCode, Integer captchaId)
    {
        //验证验证码
        ResultBean resultBean = PhoneCaptchaUtils.checkCode(captchaId, yzmCode, mobile);
        if (!resultBean.getSuccess())
        {
            UserBase userBase = new UserBase();
            userBase.setResultCode(resultBean.getResultCode());
            userBase.setSuccess(resultBean.getSuccess());
            userBase.setResultMsg(resultBean.getResultMsg());
            return userBase;
        }

        //查询用户是否已存在
        UserBaseExample baseExample = new UserBaseExample();
        UserBaseExample.Criteria criteria = baseExample.createCriteria();
        criteria.andUser_nameEqualTo(mobile);
        List<UserBase> userBaseList = userBaseMapper.selectByExample(baseExample);
        if (userBaseList != null && userBaseList.size() > 0)
        {
            UserBase userBase = userBaseList.get(0);
            userBase.setSuccess(true);
            userBase.setResultCode("0000");
            return userBase;
        }
        UserBase userBase = new UserBase();
        userBase.setUser_name(mobile);
        userBase.setMobile(mobile);
        userBase.setPassword(Md5Utils.EncoderByMd5("123qwe"));
        userBase.setStatus(1);
        userBase.setSuccess(true);
        userBase.setResultCode("0000");
        userBase.setCreate_time(new Date());
        userBaseMapper.insert(userBase);
        return userBase;
    }
}

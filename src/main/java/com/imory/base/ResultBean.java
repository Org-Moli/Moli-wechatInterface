package com.imory.base;

import java.util.Map;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/29
 */
public class ResultBean {

    private boolean success;

    private String resultCode;

    private String resultMsg;

    private Map<String,Object> resultMap;

    public Map<String, Object> getResultMap()
    {
        return resultMap;
    }

    public void setResultMap(Map<String, Object> resultMap)
    {
        this.resultMap = resultMap;
    }

    public boolean getSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public String getResultCode()
    {
        return resultCode;
    }

    public void setResultCode(String resultCode)
    {
        this.resultCode = resultCode;
    }

    public String getResultMsg()
    {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg)
    {
        this.resultMsg = resultMsg;
    }
}

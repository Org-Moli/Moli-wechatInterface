package com.imory.base;

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

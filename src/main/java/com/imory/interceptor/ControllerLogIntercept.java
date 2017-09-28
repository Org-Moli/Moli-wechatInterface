package com.imory.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/3/31
 */
public class ControllerLogIntercept extends HandlerInterceptorAdapter {

    private static Logger logger = Logger.getLogger(ControllerLogIntercept.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        boolean success = super.preHandle(request, response, handler);
        String requestURL = request.getRequestURI();
        String ipAddress = this.getIpAddress(request);
        logger.debug("用户IP地址为[" + ipAddress + "]，访问了[" + requestURL + "]");
        for (Enumeration parameterNames = request.getParameterNames(); parameterNames.hasMoreElements(); )
        {
            String paramName = (String) parameterNames.nextElement();
            logger.debug("参数名[" + paramName + "]参数值[" + request.getParameter(paramName) + "]");
        }
        return success;
    }

    /**
     * 从HttpServletRequest获取用户客户端IP地址
     */
    private String getIpAddress(HttpServletRequest request)
    {
        String ip = request.getHeader("X-Forwarded-For");

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
        {
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getRemoteAddr();
            }
        } else if (ip.length() > 15)
        {
            String[] ips = ip.split(",");
            for (String ip1 : ips)
            {
                if (!("unknown".equalsIgnoreCase(ip1)))
                {
                    ip = ip1;
                    break;
                }
            }
        }
        return ip;
    }
}

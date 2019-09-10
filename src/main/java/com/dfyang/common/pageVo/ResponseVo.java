package com.dfyang.common.pageVo;

import lombok.Data;

/**
 * 响应基类
 */
@Data
public abstract class ResponseVo {

    /** 返回状态码 */
    protected int status;

}

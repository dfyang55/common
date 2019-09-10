package com.dfyang.common.pageVo;

import lombok.Data;

/**
 * 带数据的响应类
 */
@Data
public class DataResponseVo extends ResponseVo {

    /** 响应数据 */
    protected Object data;

}

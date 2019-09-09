package com.dfyang.common.pageVo;

import lombok.Data;

/**
 * 带描述的响应类
 */
@Data
public class DescribedResponseVo extends ResponseVo {

    /** 描述信息 */
    protected String msg;

}

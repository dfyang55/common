package com.dfyang.common.pageVo;

/**
 * 响应工厂类
 */
public class ResponseVoFactory {

    /**
     * 创建响应对象
     * @param kind 响应类型
     * @return
     */
    public static ResponseVo newInstance(ResponseVoKind kind) {
        switch (kind) {
            case BASE: return new BaseResponseVo();
            case DESCRIBED: return new DescribedResponseVo();
            case DATA: return new DataResponseVo();
            case PAGE: return new PageResponseVo();
            default: return null;
        }
    }

}

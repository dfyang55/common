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
        ResponseVo responseVo = null;
        try {
            responseVo = (ResponseVo) Class.forName(kind.getPath()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseVo;
    }

}

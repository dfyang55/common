package com.dfyang.common.pageVo;

/**
 * 响应类种类
 */
public enum ResponseVoKind {
    BASE("com.dfyang.common.pageVo.BaseResponseVo"),
    DESCRIBED("com.dfyang.common.pageVo.DescribedResponseVo"),
    DATA("com.dfyang.common.pageVo.DataResponseVo"),
    PAGE("com.dfyang.common.pageVo.PageResponseVo");

    private String path;

    ResponseVoKind(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

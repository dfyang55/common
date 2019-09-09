package com.dfyang.common.pageVo;

/**
 * 响应类种类
 */
public enum ResponseVoKind {

    BASE(0),
    DESCRIBED(1),
    DATA(2),
    PAGE(3);

    private int kind;

    ResponseVoKind(int kind) {
        this.kind = kind;
    }
}

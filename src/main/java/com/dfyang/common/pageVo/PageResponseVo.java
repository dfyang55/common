package com.dfyang.common.pageVo;

import lombok.Data;

import java.util.List;

/**
 * 带分页的响应类
 */
@Data
public class PageResponseVo extends ResponseVo {

    /** 当前页 */
    private int page;

    /** 每页数 */
    private int size;

    /** 总数 */
    private int total;

    /** 总页数 */
    private int pages;

    /** 数据 */
    private List data;

}

package com.company.springBoard.vo;

public class SearchVo {
    private String column;
    private int page;
    private int pageSize;

    public SearchVo(){}

    public SearchVo(String column, int page, int pageSize) {
        this.column = column;
        this.page = page;
        this.pageSize = pageSize;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

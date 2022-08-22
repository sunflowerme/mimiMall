package com.sunflower.pojo.vo;

/**
 * 查询条件的封装:页面传送条件到后台，传送的条件称为 vo,
 */
public class ProductInfoVo {

    //商品名称条件的封装
    private String pname;

    //商品类型条件的封装
    private Integer typeid;

    //商品最低价格条件的封装
    private Double lprice;

    //商品最高价格条件的封装
    private Double hprice;

    //设置页码
    private Integer page = 1;

    public ProductInfoVo() {
    }

    public ProductInfoVo(String pname, Integer typeid, Double lprice, Double hprice, Integer page) {
        this.pname = pname;
        this.typeid = typeid;
        this.lprice = lprice;
        this.hprice = hprice;
        this.page = page;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Double getLprice() {
        return lprice;
    }

    public void setLprice(Double lprice) {
        this.lprice = lprice;
    }

    public Double getHprice() {
        return hprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "ProductInfoVo{" +
                "pname='" + pname + '\'' +
                ", typeid=" + typeid +
                ", lprice=" + lprice +
                ", hprice=" + hprice +
                ", page=" + page +
                '}';
    }
}

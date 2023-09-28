package com.sagatrading.reportingservice.marketData;


import java.util.Date;

public class MarketDataDTO {
    private OrderType orderType;
    private String product;
    private Side side;
    private String orderID;
    private Integer price;
    private Integer qty;
    private Integer cumQty;
    private Double cumPrx;
    private String exchange;
    private Date timestamp;

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getCumQty() {
        return cumQty;
    }

    public void setCumQty(Integer cumQty) {
        this.cumQty = cumQty;
    }

    public Double getCumPrx() {
        return cumPrx;
    }

    public void setCumPrx(Double cumPrx) {
        this.cumPrx = cumPrx;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "MarketDataDTO{" +
                "orderType=" + orderType +
                ", product='" + product + '\'' +
                ", side=" + side +
                ", orderID='" + orderID + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", cumQty=" + cumQty +
                ", cumPrx=" + cumPrx +
                ", exchange='" + exchange + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}


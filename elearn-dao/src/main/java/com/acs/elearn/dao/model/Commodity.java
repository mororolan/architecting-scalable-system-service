package com.acs.elearn.dao.model;

import com.acs.elearn.dao.dto.CommodityDto;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "commodity")
@Data
public class Commodity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commodity_id", nullable = false)
    private String commodityId;

    @Column(name = "commodity_name", nullable = false,length = 128)
    private String commodityName;

    @Column(name = "commodity_introduction", nullable = false)
    private String commodityIntroduction;

    @Column(name = "commodity_star", nullable = false)
    private BigInteger commodityStar;

    @Column(name = "commodity_price", nullable = false)
    private Double commodityPrice;

    @Column(name = "commodity_discount", nullable = false)
    private Double commodityDiscount;

    @Column(name = "commodity_sold_cnt", nullable = false)
    private BigInteger commoditySoldCnt;

    @Column(name = "commodity_status", nullable = false)
    private Integer commodityStatus;

    @CreatedDate
    @Column(name= "commodity_create_time", nullable = false, updatable = false)
    private LocalDateTime commodityCreateTime;

    @LastModifiedDate
    @Column(name = "commodity_update_time")
    private LocalDateTime commodityUpdateTime;


//    @ManyToMany(mappedBy = "commodityList")
//    private List<Order> allOrders;
//
//    private String name;
//
//    private float price;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public Commodity() {}
//
//    public Commodity(CommodityDto dto) {
//        this.price = dto.getPrice();
//        this.name = dto.getName();
//    }

}

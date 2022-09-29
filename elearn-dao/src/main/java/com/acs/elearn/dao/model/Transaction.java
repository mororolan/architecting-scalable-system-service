package com.acs.elearn.dao.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id", nullable = false, length = 32)
    private String transactionId;


    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "user_id")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "merchant_id", referencedColumnName = "user_id")
    private User merchant;

    @ManyToOne
    @JoinColumn(name = "commodity_id")
    private Commodity commodity;

    @Column(name = "commodity_real_price", nullable = false, updatable = false)
    private Double commodityRealPrice;

    @CreatedDate
    @Column(name = "transaction_time", nullable = false, updatable = false)
    private LocalDateTime transactionTime;

}
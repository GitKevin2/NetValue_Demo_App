package com.netvalue.kevinjong.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RfIdTag {
    @Id
    private long rfIdNum;
    private long customerNum;

    public RfIdTag() { }

    public RfIdTag(long rfIdNum, long customerNum) {
        this.rfIdNum = rfIdNum;
        this.customerNum = customerNum;
    }

    public long getRfIdNum() {
        return rfIdNum;
    }

    public void setRfIdNum(long rfIdNum) {
        this.rfIdNum = rfIdNum;
    }

    public long getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(long customerNum) {
        this.customerNum = customerNum;
    }
}

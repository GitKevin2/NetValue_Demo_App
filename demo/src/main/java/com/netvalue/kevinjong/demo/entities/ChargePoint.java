package com.netvalue.kevinjong.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "charge_points")
public class ChargePoint {
    @Id
    private long serialNum;
    private int connectorQty;
    private int connectorInUse;
    private long customerId;
    private long rfidTagNumber;

    public ChargePoint() { }

    public ChargePoint(long serialNum, int connectorQty, RfIdTag tag) {
        this.serialNum = serialNum;
        this.connectorQty = connectorQty;
        this.connectorInUse = 0;
        this.customerId = tag.getCustomerNum();
        this.rfidTagNumber = tag.getRfIdNum();
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getRfidTagNumber() {
        return rfidTagNumber;
    }

    public void setRfidTagNumber(long rfidTagNumber) {
        this.rfidTagNumber = rfidTagNumber;
    }

    public int getConnectorQty() {
        return connectorQty;
    }

    public void setConnectorQty(int connectorQty) {
        this.connectorQty = connectorQty;
    }
}

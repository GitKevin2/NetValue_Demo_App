package com.netvalue.kevinjong.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "charging_sessions")
public class ChargingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sessionId;
    private long  chargePoint;
    private LocalDate startDate;
    private LocalDate endDate;
    private double desiredValue;
    private double currentValue;
    private String errMsg = "";

    public ChargingSession() { }

    public ChargingSession(int sessionId, double desiredValue) {
        this.sessionId = sessionId;
        this.desiredValue = desiredValue;
        this.currentValue = 0;
        this.startDate = null;
        this.endDate = null;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public long getChargePoint() {
        return chargePoint;
    }

    public void setChargePoint(long chargePoint) {
        this.chargePoint = chargePoint;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public double getDesiredValue() {
        return desiredValue;
    }

    public void setDesiredValue(double desiredValue) {
        this.desiredValue = desiredValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
}

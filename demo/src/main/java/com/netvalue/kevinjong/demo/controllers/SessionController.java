package com.netvalue.kevinjong.demo.controllers;

import com.netvalue.kevinjong.demo.models.ChargePoint;
import com.netvalue.kevinjong.demo.models.ChargingSession;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/sessions")
public class SessionController {
    private Map<Long, ChargingSession> sessions = new HashMap<>();
    private Map<Long, ChargePoint> chargePoints = new HashMap<>();


    @GetMapping
    public Map<Long, ChargingSession> getSessionList() {
        return sessions;
    }

    @PostMapping("/new/{serialNumber}")
    public ChargingSession createSession(@PathVariable("serialNumber") long serialNumber, @RequestBody ChargingSession session) {
        session.setChargePoint(serialNumber);
        session.setStartDate(LocalDate.now());
        sessions.put(session.getSessionId(), session);
        return session;
    }

    @PostMapping("/end/{sessionId}")
    public ChargingSession stopSession(@PathVariable("sessionId") long id) {
        if (!sessions.containsKey(id)) throw new IllegalArgumentException(id + " not found.");
        ChargingSession session = sessions.get(id);
        session.setEndDate(LocalDate.now());
        return session;
    }



}

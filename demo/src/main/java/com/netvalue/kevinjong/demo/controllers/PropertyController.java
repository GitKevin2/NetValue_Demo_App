package com.netvalue.kevinjong.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info/versions")
public class PropertyController {

    @Value("${me.app.version}")
    private float applicationVersion;

    @Value("${me.db.schema.version}")
    private float databaseVersion;

    @GetMapping("/app")
    public float getAppVersion() {
        return applicationVersion;
    }

    @GetMapping("/db-schema")
    public float getDatabaseVersion() {
        return databaseVersion;
    }

}

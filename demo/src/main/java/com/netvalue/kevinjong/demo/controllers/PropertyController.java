package com.netvalue.kevinjong.demo.controllers;

import com.netvalue.kevinjong.demo.model.PropertyModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

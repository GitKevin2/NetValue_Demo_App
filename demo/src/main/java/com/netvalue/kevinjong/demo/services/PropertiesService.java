package com.netvalue.kevinjong.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {
    @Value("${me.app.version}")
    private float applicationVersion;
    @Value("${me.db.schema.version}")
    private float databaseVersion;
}

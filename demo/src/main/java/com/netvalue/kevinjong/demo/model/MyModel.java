package com.netvalue.kevinjong.demo.model;

public class MyModel {
    private long id;
    private String name;
    private String statement;

    public MyModel() {
    }

    public MyModel(long id, String name, String statement) {
        this.id = id;
        this.name = name;
        this.statement = statement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
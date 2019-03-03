package com.junjia.design.principle.compositionaggregation;

/**
 * Created by junjia
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}

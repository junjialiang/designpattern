package com.junjia.design.principle.compositionaggregation;

/**
 * Created by junjia
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}

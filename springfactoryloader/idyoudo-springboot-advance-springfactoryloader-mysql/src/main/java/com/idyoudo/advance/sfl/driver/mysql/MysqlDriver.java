package com.idyoudo.advance.sfl.driver.mysql;

import com.idyoudo.advance.sfl.driver.Driver;

/**
 * 新驱动名称
 */
public class MysqlDriver implements Driver {
    @Override
    public String getDriver() {
        return "com.mysql.cj.jdbc.Driver";
    }

    @Override
    public Driver.DriverType getDbType() {
        return DriverType.MYSQL;
    }
}

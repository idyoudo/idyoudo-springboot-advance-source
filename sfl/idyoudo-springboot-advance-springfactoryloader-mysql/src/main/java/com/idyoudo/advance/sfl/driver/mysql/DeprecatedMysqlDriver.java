package com.idyoudo.advance.sfl.driver.mysql;

import com.idyoudo.advance.sfl.driver.Driver;
import org.springframework.context.annotation.Configuration;

/**
 * 老驱动名称
 */
public class DeprecatedMysqlDriver implements Driver {
    @Override
    public String getDriver() {
        return "com.mysql.jdbc.Driver";
    }

    @Override
    public DriverType getDbType() {
        return DriverType.MYSQL;
    }
}

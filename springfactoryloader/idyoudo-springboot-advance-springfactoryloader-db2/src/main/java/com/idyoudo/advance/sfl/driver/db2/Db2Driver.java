package com.idyoudo.advance.sfl.driver.db2;

import com.idyoudo.advance.sfl.driver.Driver;
import org.springframework.context.annotation.Configuration;

public class Db2Driver implements Driver {
    @Override
    public String getDriver() {
        return "com.ibm.db2.jcc.DB2Driver";
    }

    @Override
    public DriverType getDbType() {
        return DriverType.DB2;
    }
}

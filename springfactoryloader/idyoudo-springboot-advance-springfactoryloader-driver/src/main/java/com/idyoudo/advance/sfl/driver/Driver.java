package com.idyoudo.advance.sfl.driver;

public interface Driver {
    /**
     *
     * @return 返回驱动的实现类名称
     */
    public String getDriver() ;

    /**
     *
     * @return 返回数据库的类型
     */
    public DriverType getDbType() ;

    enum DriverType{
        MYSQL,
        DB2
    }
}

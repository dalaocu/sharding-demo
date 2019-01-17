/**
 * Copyright (C) 2018 WeBank, Inc. All Rights Reserved.
 */
package com.dalaocu.sharding.demo.config;

import org.hibernate.dialect.MySQL57Dialect;

/**
 * MysqlConfig dialects. Define InnoDB and default charset utf8.
 *
 * @author maojiayu
 * @data Dec 26, 2018 7:30:23 PM
 *
 */
public class MysqlConfig extends MySQL57Dialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }

}

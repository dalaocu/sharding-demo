/**
 * Copyright (C) 2018 WeBank, Inc. All Rights Reserved.
 */

package com.dalaocu.sharding.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * IdEntity
 *
 * @Description: IdEntity
 * @author maojiayu
 * @data Dec 28, 2018 6:05:11 PM
 *
 */
@Data
@MappedSuperclass
@Accessors(chain = true)
public abstract class IdEntity implements Serializable {

    private static final long serialVersionUID = 5903397383140175895L;
    /** @Fields pkId : primary key */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id")
    protected Long pkId;
}

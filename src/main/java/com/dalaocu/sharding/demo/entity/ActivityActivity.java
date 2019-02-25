package com.dalaocu.sharding.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@Data
@Accessors(chain = true)
@Entity(name = "activity_activity")
@Table(name = "activity_activity", indexes = { @Index(name = "block_height", columnList = "block_height"),
        @Index(name = "status", columnList = "status") })
@EqualsAndHashCode(callSuper = true)
public class ActivityActivity extends IdEntity {
    @Column(name = "block_height")
    private long blockHeight;
    @Column(name = "status")
    private int status;
    @UpdateTimestamp
    @Column(name = "depot_updatetime")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date depotUpdatetime;
}

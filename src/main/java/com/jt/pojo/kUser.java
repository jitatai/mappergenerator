package com.jt.pojo;

import java.util.Date;
import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Table(name = "tk_user")
@ApiModel("用户DTO")
public class kUser {
    /**
     * 主键id
     */
    @Id
    @ApiModelProperty(value = "id", dataType = "Long", required = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    @ApiModelProperty(value = "姓名", dataType = "String", required = true)
    private String name;

    @ApiModelProperty(value = "年龄", dataType = "int", required = true)
    private int age;

    @ApiModelProperty(value = "用户类型", dataType = "int", required = true)
    private int userType;


    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", dataType = "Date", required = true)
    @Column(name = "create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", dataType = "Date", required = true)
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除", dataType = "Date", required = true)
    private Byte deleted;
}
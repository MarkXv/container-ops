package com.ops.log.pojo;

import java.sql.Date;

public class LogEvent {

    private long id;
    private String sql;
    private String method;
    private int status;
    private String tableName;
    private long createUserId;
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "LogEvent{" +
                "id=" + id +
                ", sql='" + sql + '\'' +
                ", method='" + method + '\'' +
                ", status=" + status +
                ", tableName='" + tableName + '\'' +
                ", createUserId=" + createUserId +
                ", createTime=" + createTime +
                '}';
    }
}

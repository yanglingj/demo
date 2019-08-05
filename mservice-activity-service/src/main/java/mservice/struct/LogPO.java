package mservice.struct;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "log")
public class LogPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer activityId;
    private String userAccountId;
    private String helpAccountId;
    private String picUrl;
    private byte isFinished;
    private LocalDateTime created_at;
    private String created_by;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getHelpAccountId() {
        return helpAccountId;
    }

    public void setHelpAccountId(String helpAccountId) {
        this.helpAccountId = helpAccountId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public byte getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(byte isFinished) {
        this.isFinished = isFinished;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
}

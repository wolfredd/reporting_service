package com.sagatrading.reportingservice.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "activity")
public class Activity {

    @jakarta.persistence.Id
    @GeneratedValue//(strategy = GenerationType.SEQUENCE)
    @JsonProperty("id")
    private Integer Id;
    private Integer userId;
    private String userName;
    private String activity;

    public Activity(String activity) {
        this.activity = activity;
    }

    public Activity(Integer userId, String userName, String activity) {
        this.userId = userId;
        this.userName = userName;
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer clientId) {
        this.userId = clientId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String clientName) {
        this.userName = clientName;
    }
}

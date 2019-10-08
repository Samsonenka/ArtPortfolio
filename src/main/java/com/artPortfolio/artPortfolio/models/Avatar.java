package com.artPortfolio.artPortfolio.models;

import javax.persistence.*;

@Entity
@Table(name = "avatar")
public class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long avatarID;

    private String avatarUrl;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users user;

    public Avatar() {
    }

    public Avatar(Users user) {
        this.avatarUrl = "";
        this.user = user;
    }

    public long getAvatarID() {
        return avatarID;
    }

    public void setAvatarID(long avatarID) {
        this.avatarID = avatarID;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}

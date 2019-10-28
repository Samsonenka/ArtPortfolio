package com.artPortfolio.artPortfolio.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long photoID;

    private String photoURL;
    private long photoLike;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users user;

    public Photo() {
    }

    public Photo(String photoURL, Users user) {
        this.photoURL = photoURL;
        this.photoLike = 0;
        this.user = user;
    }

    public long getPhotoID() {
        return photoID;
    }

    public void setPhotoID(long photoID) {
        this.photoID = photoID;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public long getPhotoLike() {
        return photoLike;
    }

    public void setPhotoLike(long photoLike) {
        this.photoLike = photoLike;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}

package com.example.libraryapplication;

public class ModelCategory {
    public String category,uid;
    public  long id;
    public long timestamp;

    public ModelCategory() {
    }

    public ModelCategory(long id, String category, long timestamp, String uid) {
        this.id = id;
        this.category = category;
        this.timestamp = timestamp;
        this.uid = uid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}

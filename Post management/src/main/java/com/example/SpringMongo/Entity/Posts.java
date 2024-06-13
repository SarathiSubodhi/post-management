package com.example.SpringMongo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "post")  // changed "collation" to "collection" and "post" to lowercase
public class Posts {

    @Id
    private String _id;  // corrected variable name

    private String title;
    private String image;
    private String desc;

    public Posts(String _id, String title, String image, String desc) {
        this._id = _id;
        this.title = title;
        this.image = image;
        this.desc = desc;
    }

    public Posts() {

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.free_to_play.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OneGame implements Parcelable {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("game_url")
    @Expose
    private String gameUrl;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("developer")
    @Expose
    private String developer;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("freetogame_profile_url")
    @Expose
    private String freetogameProfileUrl;
    @SerializedName("minimum_system_requirements")
    @Expose
    public static final Creator<OneGame> CREATOR = new Creator<OneGame>() {
        public OneGame createFromParcel(Parcel in) {
            return new OneGame(in);
        }

        public OneGame[] newArray(int size) {
            return new OneGame[size];
        }
    };

    protected OneGame(Parcel in) {
        this.id = (Integer)in.readValue(Integer.TYPE.getClassLoader());
        this.title = (String)in.readValue(String.class.getClassLoader());
        this.thumbnail = (String)in.readValue(String.class.getClassLoader());
        this.status = (String)in.readValue(String.class.getClassLoader());
        this.shortDescription = (String)in.readValue(String.class.getClassLoader());
        this.description = (String)in.readValue(String.class.getClassLoader());
        this.gameUrl = (String)in.readValue(String.class.getClassLoader());
        this.genre = (String)in.readValue(String.class.getClassLoader());
        this.platform = (String)in.readValue(String.class.getClassLoader());
        this.publisher = (String)in.readValue(String.class.getClassLoader());
        this.developer = (String)in.readValue(String.class.getClassLoader());
        this.releaseDate = (String)in.readValue(String.class.getClassLoader());
        this.freetogameProfileUrl = (String)in.readValue(String.class.getClassLoader());
    }

    public OneGame() {
    }

    public OneGame(int id, String title, String thumbnail, String status, String shortDescription, String description, String gameUrl, String genre, String platform, String publisher, String developer, String releaseDate, String freetogameProfileUrl) {
        this.id = id;
        this.title = title;
        this.thumbnail = thumbnail;
        this.status = status;
        this.shortDescription = shortDescription;
        this.description = description;
        this.gameUrl = gameUrl;
        this.genre = genre;
        this.platform = platform;
        this.publisher = publisher;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.freetogameProfileUrl = freetogameProfileUrl;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OneGame withId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OneGame withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public OneGame withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OneGame withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public OneGame withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OneGame withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getGameUrl() {
        return this.gameUrl;
    }

    public void setGameUrl(String gameUrl) {
        this.gameUrl = gameUrl;
    }

    public OneGame withGameUrl(String gameUrl) {
        this.gameUrl = gameUrl;
        return this;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public OneGame withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public OneGame withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public OneGame withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getDeveloper() {
        return this.developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public OneGame withDeveloper(String developer) {
        this.developer = developer;
        return this;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public OneGame withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getFreetogameProfileUrl() {
        return this.freetogameProfileUrl;
    }

    public void setFreetogameProfileUrl(String freetogameProfileUrl) {
        this.freetogameProfileUrl = freetogameProfileUrl;
    }

    public OneGame withFreetogameProfileUrl(String freetogameProfileUrl) {
        this.freetogameProfileUrl = freetogameProfileUrl;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeValue(this.title);
        dest.writeValue(this.thumbnail);
        dest.writeValue(this.status);
        dest.writeValue(this.shortDescription);
        dest.writeValue(this.description);
        dest.writeValue(this.gameUrl);
        dest.writeValue(this.genre);
        dest.writeValue(this.platform);
        dest.writeValue(this.publisher);
        dest.writeValue(this.developer);
        dest.writeValue(this.releaseDate);
        dest.writeValue(this.freetogameProfileUrl);
    }

    public int describeContents() {
        return 0;
    }
}

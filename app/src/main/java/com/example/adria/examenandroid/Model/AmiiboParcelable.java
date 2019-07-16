package com.example.adria.examenandroid.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class AmiiboParcelable implements Parcelable {
    @SerializedName("amiibo")
    ArrayList<AmiiboParcelable> listaAmiibo;
    @SerializedName("amiiboSeries")
    public String amiiboSeries;
    @SerializedName("character")
    public String character;
    @SerializedName("gameSeries")
    public String gameSeries;
    @SerializedName("head")
    public String head;
    @SerializedName("image")
    public String image;
    @SerializedName("name")
    public String name;
    @SerializedName("release")
    Release release;
    @SerializedName("tail")
    public String tail;

    public AmiiboParcelable(ArrayList<AmiiboParcelable> listaAmiibo, String amiiboSeries, String character, String gameSeries, String head, String image, String name, Release release, String tail, String type) {
        this.listaAmiibo = listaAmiibo;
        this.amiiboSeries = amiiboSeries;
        this.character = character;
        this.gameSeries = gameSeries;
        this.head = head;
        this.image = image;
        this.name = name;
        this.release = release;
        this.tail = tail;
        this.type = type;
    }

    public ArrayList<AmiiboParcelable> getListaAmiibo() {
        return listaAmiibo;
    }

    public void setListaAmiibo(ArrayList<AmiiboParcelable> listaAmiibo) {
        this.listaAmiibo = listaAmiibo;
    }

    public String getAmiiboSeries() {
        return amiiboSeries;
    }

    public void setAmiiboSeries(String amiiboSeries) {
        this.amiiboSeries = amiiboSeries;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getGameSeries() {
        return gameSeries;
    }

    public void setGameSeries(String gameSeries) {
        this.gameSeries = gameSeries;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String type;


    protected AmiiboParcelable(Parcel in) {
        amiiboSeries = in.readString();
        character = in.readString();
        gameSeries = in.readString();
        head = in.readString();
        image = in.readString();
        name = in.readString();
        tail = in.readString();
        type = in.readString();
    }

    public static final Creator<AmiiboParcelable> CREATOR = new Creator<AmiiboParcelable>() {
        @Override
        public AmiiboParcelable createFromParcel(Parcel in) {
            return new AmiiboParcelable(in);
        }

        @Override
        public AmiiboParcelable[] newArray(int size) {
            return new AmiiboParcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(amiiboSeries);
        dest.writeString(character);
        dest.writeString(gameSeries);
        dest.writeString(head);
        dest.writeString(image);
        dest.writeString(name);
        dest.writeString(tail);
        dest.writeString(type);
    }

    private class Release {
        public String au;
        public String eu;
        public String jp;
        public String na;
    }

}

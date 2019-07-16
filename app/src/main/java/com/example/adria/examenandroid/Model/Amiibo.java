package com.example.adria.examenandroid.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Amiibo implements Serializable {
    @SerializedName("amiibo")
    ArrayList<Amiibo> listaAmiibo;
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

    private class Release implements Serializable{
        @SerializedName("au")
        public String au;
        @SerializedName("eu")
        public String eu;
        @SerializedName("jp")
        public String jp;
        @SerializedName("na")
        public String na;
    }

    @SerializedName("tail")
    public String tail;
    @SerializedName("type")
    public String type;

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
    public ArrayList<Amiibo> getListaAmiibo() {
        return listaAmiibo;
    }

    public void setListaAmiibo(ArrayList<Amiibo> listaAmiibo) {
        this.listaAmiibo = listaAmiibo;
    }
}

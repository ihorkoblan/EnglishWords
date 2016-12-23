package com.company.ihor.wordlearner;

public class Word {
    private String id;
    private String name;
    private String translation;
    private String tag;

    public Word() {}

    public Word(String name, String translation) {
        this.name = name;
        this.translation = translation;
    }

    public Word(String name, String translation, String tag) {
        this.name = name;
        this.translation = translation;
        this.tag = tag;
    }

    public Word(String id, String name, String translation, String tag) {
        this.id = id;
        this.name = name;
        this.translation = translation;
        this.tag = tag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String duration) {
        this.translation = translation;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}
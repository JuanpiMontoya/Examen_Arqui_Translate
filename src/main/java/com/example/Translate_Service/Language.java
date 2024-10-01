package com.example.Translate_Service;

public enum Language {
    ES("ES"),
    EN("EN");
    private  final String description;

    Language(String description) {
        this.description = description;
    }

    public String toString() {
        return this.description;
    }
}

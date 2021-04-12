package com.utn.tpnews.model;

public enum TypeNew {
    TEXT("Text new"),
    IMG("Image new"),
    VIDEO("Video new");

    private String description;

    TypeNew(String description){
        this.description = description;
    }

    public static TypeNew find(String value){
        for(TypeNew n : values()){
            if(n.toString().equalsIgnoreCase(value))
                return n;

        }
        throw new IllegalArgumentException(String.format("Invalid TypeVehicle: %s", value));
    }

    public String getDescription() {
        return description;
    }
}

package com.java.exemploFreeMarker;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Id {
    public static int id = 0;

    public Id (){
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Id.id = id;
    }

    @Override
    public String toString() {
        return "\"Id\": " + getId();
    }
}

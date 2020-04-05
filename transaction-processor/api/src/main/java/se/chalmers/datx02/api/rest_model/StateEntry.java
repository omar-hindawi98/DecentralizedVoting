package se.chalmers.datx02.api.rest_model;

import com.google.api.client.util.Key;

public class StateEntry {
    @Key
    private String data;
    @Key
    private String address;

    public String getAddress() {
        return address;
    }

    public String getData() {
        return data;
    }
}

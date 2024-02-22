package com.es2.singleton;

public class Registry {
    static Registry instance = null;
    private String  connectionString;
    private String applicationPath;


    private Registry() {}

    public static Registry getInstance() {
        if(instance == null){
            instance = new Registry();
        }

        return instance;
    }

    public String getPath(){
        return applicationPath;
    }

    public String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){
        this.connectionString=connectionString;
    }

    public void setPath(String applicationPath){
        this.applicationPath = applicationPath;
    }
}
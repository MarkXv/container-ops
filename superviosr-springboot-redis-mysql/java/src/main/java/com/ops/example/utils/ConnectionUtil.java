package com.ops.example.utils;

public class ConnectionUtil {

    public String getData(int status){

        String result = "";
        switch (status){
            case 1 : result = ""; break;
            case 2 : result = ""; break;
            default: result = "<html><body><h3>hello world</h3></body></html>";
        }

        return result;
    }




}

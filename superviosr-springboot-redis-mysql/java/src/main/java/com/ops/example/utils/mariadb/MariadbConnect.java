package com.ops.example.utils.mariadb;

import org.springframework.stereotype.Component;

@Component
public class MariadbConnect {
    public static boolean getConnectionForMariadb(){

        try{


        }catch (Exception e){
            return false;
        }

        return true;
    }
}

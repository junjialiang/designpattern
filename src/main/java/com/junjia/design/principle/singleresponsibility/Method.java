package com.junjia.design.principle.singleresponsibility;

/**
 * Created by junjia
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "junjia";
        address = "beijing";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "junjia";
//        address = "beijing";
    }

    private void updateUsername(String userName){
        userName = "junjia";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }


        userName = "junjia";
        address = "beijing";
    }


}

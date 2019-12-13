package com.example.android.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.android.myapplication.model.Receiver;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private Gson gson ;

    public Database(){
        gson = new Gson();
    }
    public void addReceiver(Receiver receiver,Context context){
        List<Receiver> receivers = getAllRecievers(context);

        receivers.add(receiver);
        SharedPreferences.Editor editor =context.getSharedPreferences(Constants.LOCAL_DATABASE_KEY, Context.MODE_PRIVATE).edit();

        editor.putString(Constants.RECIEVERS_LIST_KEY, gson .toJson(receivers));

        editor.apply();

    }

    public List<Receiver> getAllRecievers(Context context){

        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.LOCAL_DATABASE_KEY, Context.MODE_PRIVATE);
        String receiversJson = sharedPreferences.getString(Constants.RECIEVERS_LIST_KEY, "");
        Type listType = new TypeToken<ArrayList<Receiver>>() {
        }.getType();
        List<Receiver> receivers = new ArrayList<>();
        if (!receiversJson.equals("")) {
            receivers = gson.fromJson(receiversJson, listType);
        }
        return receivers;
    }
}

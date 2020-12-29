package pl.put.poznan.bootstrapbuilder.logic;

import org.apache.commons.lang3.text.StrSubstitutor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class Tag {

    private static String name;
    private static String property;
    private static String content;

    public Tag() {
    }

    public static void main(String[] args) throws JSONException {
        JSONArray jsonArray = new JSONArray("[{\"a\":1},{\"b\":2,\"c\":3},{\"d\":4},{\"e\":5,\"f\":7}]");


        //System.out.println(jsonArray);
        buildMeta(jsonArray);

    }

    public static String buildMeta(JSONArray tags) throws JSONException {
        String meta="<meta ";


        for (int i=0 ;i<tags.length();i++){
            JSONObject json = tags.getJSONObject(i);
            Iterator<String> keys = json.keys();

            while (keys.hasNext()) {
                String key = keys.next();
                meta+=(key +"=\""+ json.get(key)+"\" ");
               // System.out.println("Key :" + key + "  Value :" + json.get(key));
            }
            meta+=">";
        }
        System.out.println(meta);


        return meta;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

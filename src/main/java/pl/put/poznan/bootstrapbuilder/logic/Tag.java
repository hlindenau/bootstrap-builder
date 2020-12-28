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

    private String name;
    private String property;
    private String content;

    public Tag() {
    }




    public String buildMeta(JSONArray arr) throws JSONException {
        String meta="";


        for (int i=0 ;i<arr.length();i++){
            JSONArray subarray =(JSONArray) arr.get(i);
        }


        Map<String, String> values = new HashMap<String, String>();
        values.put("content",content);
        values.put("name",name);



        StrSubstitutor sub = new StrSubstitutor(values, "%(", ")");
        String codeHTML = sub.replace("<meta name=%(name) content=%(content)>");

        return codeHTML;
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

package pl.put.poznan.bootstrapbuilder.logic;

import org.apache.commons.lang3.text.StrSubstitutor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Scanner;
/**
 * Class builds the metatags of html page
 */

public class Tag {

    private HashMap<String, String> metaArray;
    private HashMap<String, String> twitterArray;
    private HashMap<String, String> ogArray;

    public Tag() {
    }

    /**
     * responsible for building HTML code of Meta tags
     *
     *
     * @return HTML code as String
     */

    public String buildMeta() throws JSONException {
        String fullMetaString="";
        Map<String, String> values = new HashMap<String, String>();

        JSONObject json = new JSONObject(metaArray); //metaArray.getJSONObject(i);
        Iterator<String> keys = json.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            if(key.equals("title")){
                fullMetaString+=("<title>"+ json.get(key).toString() +"</title>\n");
                break;}
            values.put("name",key);
            values.put("content",json.get(key).toString());

            StrSubstitutor sub = new StrSubstitutor(values, "%(", ")");
            String codeHTML = sub.replace("<meta name=\"%(name)\" content=\"%(content)\">\n");
            fullMetaString+=codeHTML;
        }
        System.out.println(fullMetaString);
        return fullMetaString;
    }

    /**
     * responsible for building HTML code of Twitter Meta tags
     *
     *
     * @return HTML code as String
     */
    public String buildMetaTwitter() throws JSONException {
        String fullMetaString="";
        Map<String, String> values = new HashMap<String, String>();

        JSONObject json = new JSONObject(twitterArray);
        Iterator<String> keys = json.keys();

        while (keys.hasNext()) {
            String key = keys.next();

            values.put("name",key);
            values.put("content",json.get(key).toString());

            StrSubstitutor sub = new StrSubstitutor(values, "%(", ")");
            String codeHTML = sub.replace("<meta name=\"twitter:%(name)\" content=\"%(content)\">\n");
            fullMetaString+=codeHTML;

        }
        System.out.println(fullMetaString);
        return fullMetaString;
    }

    /**
     * responsible for building HTML code of OG Meta tags
     *
     *
     * @return HTML code as String
     */

    public String buildMetaOG() throws JSONException {
        String fullMetaString="";
        Map<String, String> values = new HashMap<String, String>();

        JSONObject json = new JSONObject(ogArray);
        Iterator<String> keys = json.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            values.put("name",key);
            values.put("content",json.get(key).toString());
            StrSubstitutor sub = new StrSubstitutor(values, "%(", ")");
            String codeHTML = sub.replace("<meta property=\"og:%(name)\" content=\"%(content)\">\n");
            fullMetaString+=codeHTML;
        }

        System.out.println(fullMetaString);
        return fullMetaString;
    }


    public HashMap<String, String> getMetaArray() {
        return metaArray;
    }

    public void setMetaArray(HashMap<String, String> metaArray) {
        this.metaArray = metaArray;
    }

    public HashMap<String, String> getTwitterArray() {
        return twitterArray;
    }

    public void setTwitterArray(HashMap<String, String> twitterArray) {
        this.twitterArray = twitterArray;
    }

    public HashMap<String, String> getOgArray() {
        return ogArray;
    }

    public void setOgArray(HashMap<String, String> ogArray) {
        this.ogArray = ogArray;
    }

}

package com.citiaps.jefferson.database.utilities;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author: Jefferson Morales De la Parra
 * Clase que se utiliza para manipular objetos JSON
 */
public class JsonHandler {

    /**
     * Método que recibe un JSONArray en forma de String y devuelve un String[] con los actores
     */
    public String[][] getActors(String actors) {
        try {
            JSONArray ja = new JSONArray(actors);
            String[][] result = new String[ja.length()][4];
            String actor_name, actor_last, actor_id, actor_update;
            for (int i = 0; i < ja.length(); i++) {
                JSONObject row = ja.getJSONObject(i);
                actor_name = row.getString("firstName");
                actor_last = row.getString("lastName");
                actor_id = row.getString("actorId");
                actor_update = row.getString("lastUpdate");
                result[i][0] = actor_name;
                result[i][1] = actor_last;
                result[i][2] = actor_id;
                result[i][3] = actor_update;
            }
            return result;
        } catch (JSONException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        }
        return null;
    }// getActors(String actors)


    /**
     * test
     */

}// JsonHandler
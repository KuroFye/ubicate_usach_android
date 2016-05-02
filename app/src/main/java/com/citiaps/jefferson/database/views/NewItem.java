package com.citiaps.jefferson.database.views;

import android.app.Fragment;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author:
 */
import com.citiaps.jefferson.database.controllers.HttpPost;
import com.citiaps.jefferson.database.utilities.SystemUtilities;


import cl.citiaps.jefferson.taller_android_bd.R;

public class NewItem extends Fragment implements View.OnClickListener{
    Button crear_actor;
    EditText primer_nombre;
    EditText apellido;
    View view;
    private final String URL_POST = "http://10.0.2.2:9090/sakila-backend-master/actors/";
    /**
     * Constructor. Obligatorio para Fragmentos!
     */
    public NewItem() {
    }// NewItem()

    /**
     * Método que crea la vista del fragmento
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.new_item, container, false);
        primer_nombre = (EditText) view.findViewById(R.id.primer_nombre);
        apellido = (EditText) view.findViewById(R.id.apellido);
        crear_actor = (Button) view.findViewById(R.id.crear_actor);
        crear_actor.setOnClickListener(this);
        return view;
    }// onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    @Override
    public void onClick(View v) {
        String json_query = "{\"firstName\":\"" + primer_nombre.getText().toString() + "\",\"lastName\":\"" + apellido.getText().toString() + "\"}";
        SystemUtilities su = new SystemUtilities(getActivity().getApplicationContext());
        if (su.isNetworkAvailable()) {
            new HttpPost(getActivity().getApplicationContext()).execute(URL_POST);
        }
    }


}// NewItem extends Fragment
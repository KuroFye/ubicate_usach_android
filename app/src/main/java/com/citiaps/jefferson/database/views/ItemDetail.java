package com.citiaps.jefferson.database.views;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.citiaps.jefferson.database.controllers.HttpGet;
import com.citiaps.jefferson.database.utilities.JsonHandler;
import com.citiaps.jefferson.database.utilities.SystemUtilities;

import cl.citiaps.jefferson.taller_android_bd.R;

/**
 * @author: Jefferson Morales De la Parra
 * Clase Fragmento que se utiliza para mostrar el detalle de los items de la lista
 */
public class ItemDetail extends Fragment {

    /**
     * Constructor. Obligatorio para Fragmentos!
     */
    public ItemDetail() {
    }// ItemDetail()

    private BroadcastReceiver br = null;
    private final String URL_GET = "http://10.0.2.2:9090/sakila-backend-master/actors/";

    /**
     * Método que crea la vista del fragmento
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.item_detail, container, false);
    }// onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    /**
     * Método que se llama una vez que se ha restaurado el estado del fragmento
     */
    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        ((TextView) getView().findViewById(R.id.item_detail)).setText(bundle.getString("item"));
        super.onViewStateRestored(savedInstanceState);

        /**
         * test
         */
    }// onViewStateRestored(Bundle savedInstanceState)

}// ItemDetail extends Fragment
package com.iesvirgendelcarmen.dam.fragment08;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

/**
 * Created by matinal on 20/10/2017.
 */

public class Cabecera extends ListFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Elementos.cabeceras));
    }

    public interface CabeceraListener{}
    CabeceraListener mCallBack;

    @Override
    public void onAttach(Context context) {
        mCallBack=(CabeceraListener)context;
        super.onAttach(context);
    }
}

package com.example.ivants.cmdperdidadatosfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ivants on 26/01/17.
 */

public class Fagmento extends Fragment {
    View rootView;
    TextView tv;
    EditText et;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento,container, false);
        tv= (TextView)rootView.findViewById(R.id.textview);
        et = (EditText)rootView.findViewById(R.id.edittext);
        btn = (Button)rootView.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(et.getText().toString());
            }
        });

        return rootView;
    }
}

package com.ifb.exemplo2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class principal extends Activity{

    private TextView usuarioInformado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        this.usuarioInformado = (TextView) findViewById(R.id.txtEmailRecebido);
        Bundle bundle = getIntent().getExtras();
        String recebido = bundle.getString("EMAIL");
        this.usuarioInformado.setText(recebido);
    }
}

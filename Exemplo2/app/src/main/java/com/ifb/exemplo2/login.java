package com.ifb.exemplo2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends Activity {

    private EditText Usuario;
    private EditText Senha;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        this.Usuario = (EditText) findViewById(R.id.editLogin);
        this.Senha = (EditText) findViewById(R.id.editSenha);
    }

    public void verificaLogin(View v) {
        String txtUsuario = Usuario.getText().toString();
        String txtSenha = Senha.getText().toString();

        if (txtUsuario.equals("teste@ifb.com") && txtSenha.equals("123")) {
            Intent intent = new Intent (this, principal.class);
            intent.putExtra("EMAIL", txtUsuario);
            startActivity(intent);
        }
        else {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Erro!");
            alertDialog.setMessage("Nome de usuário e/ou senha incorretos!!");
            alertDialog.show();
        }
    }

}

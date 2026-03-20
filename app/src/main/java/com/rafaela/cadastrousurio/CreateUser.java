package com.rafaela.cadastrousurio;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

//Classe principal
public class CreateUser extends AppCompatActivity {
    TextInputEditText editNome, editEmail;

    Button btnSalvar;

    //notação para sobreescrever metodo
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        //Vincula variável com a interface gráfica, escrito no XML
        editNome = findViewById(R.id.nome);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

        //função de click
        btnSalvar.setOnClickListener(v -> {
            //pega oque for digitado no input nome e email, converte para string
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            if(!nome.isEmpty())
            {

                MainActivity.listaNomes.add(nome + "(" + email +")");
                finish();
            }
        });
    }
}

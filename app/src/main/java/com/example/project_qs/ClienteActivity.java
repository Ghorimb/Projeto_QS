package com.example.project_qs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ClienteActivity extends AppCompatActivity {

    private TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        textViewWelcome = findViewById(R.id.textViewWelcome);

        // Obter informações do usuário autenticado (você pode usar dados mais significativos)
        Utilizador utilizador = Autenticacao.obterUtilizadorAutenticado(); // Supondo que você tenha um método assim

        if (utilizador != null) {
            String mensagemBoasVindas = "Bem-vindo, " + utilizador.getNome() + "!";
            textViewWelcome.setText(mensagemBoasVindas);
        }
    }
}


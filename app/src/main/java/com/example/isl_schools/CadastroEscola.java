package com.example.isl_schools;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.Toast;

    import com.example.isl_schools.dao.EscolaDao;
import com.example.isl_schools.model.Escola;

public class CadastroEscola extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoNomeEscola;
    private EditText campoEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_escola);
    }

    public void cadastrar(View view){

        final EscolaDao dao = new EscolaDao();

        campoNome = (EditText) findViewById(R.id.edtNome);
        campoEmail = (EditText) findViewById(R.id.edtEmail);
        campoNomeEscola = (EditText) findViewById(R.id.edtNomeEscola);
        campoEndereco = (EditText) findViewById(R.id.edtEndereco);

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String nomeEscola = campoNomeEscola.getText().toString();
        String endereco = campoEndereco.getText().toString();

        Escola a = new Escola(nome, email, nomeEscola, endereco);

        Toast.makeText(CadastroEscola.this, "Escola cadastrada", Toast.LENGTH_SHORT);

        dao.salvar(a);

        Intent intent = new Intent(this, ListaEscola.class);
        startActivity(intent);


//        a.setNome(nome.getText().toString());
//        a.setEmail(email.getText().toString());
//        a.setNomeEscola(nomeEscola.getText().toString());
//        a.setEndereco(endereco.getText().toString());

    }
}

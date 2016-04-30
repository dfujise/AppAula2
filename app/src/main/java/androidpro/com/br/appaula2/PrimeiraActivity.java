package androidpro.com.br.appaula2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        TextView textEdit1 = (TextView) findViewById(R.id.textView1);
        textEdit1.setText("Esta é a Primeira Activity");
        Button bChamar = (Button) findViewById(R.id.button);
        bChamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrimeiraActivity.this, SegundaActivity.class);
                Bundle b = new Bundle();
                b.putString("umaString", "Olá");
                intent.putExtra("stringBundle", b);
                intent.putExtra("mensagem", "Mundo!");
                intent.putExtra("umBoolean", true);
                intent.putExtra("umInteiro", 5);
                startActivity(intent);
            }
        });
        Button pegarDados = (Button)findViewById(R.id.button5);
        pegarDados.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PrimeiraActivity.this, TerceiraActivity.class);
                startActivityForResult(intent, 0);
            }});
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent dados) {
        if (requestCode == 0 && resultCode == Activity.RESULT_OK) {
            String dadosRetornados = dados.getStringExtra("Dados");
            Toast.makeText(PrimeiraActivity.this, "Dados: "
                    + dadosRetornados, Toast.LENGTH_LONG).show();
        }
        super.onActivityResult(requestCode, resultCode, dados);
    }
}

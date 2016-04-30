package androidpro.com.br.appaula2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        final EditText e = (EditText) findViewById(R.id.editText);
        Button enviar = (Button) findViewById(R.id.button3);
        enviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra("Dados", e.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });
        Button cancelar = (Button) findViewById(R.id.button4);
        cancelar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });
    }
}

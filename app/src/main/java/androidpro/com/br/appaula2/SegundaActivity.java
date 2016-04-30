package androidpro.com.br.appaula2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        TextView textEdit1 = (TextView) findViewById(R.id.textView1);
        textEdit1.setText("Esta é a Segunda Activity");
        Button bChamar = (Button) findViewById(R.id.button);
        bChamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaActivity.this, PrimeiraActivity.class);
                startActivity(intent);
            }
        });
    }
}

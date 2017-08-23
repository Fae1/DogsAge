package dogsage.studio.com.dogsage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textBox;
    private Button buttonAge;
    private TextView resultAge;
    private ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = (EditText) findViewById(R.id.idTextInputAge);
        buttonAge = (Button) findViewById(R.id.idButtonAge);
        resultAge = (TextView) findViewById(R.id.idResult);

        icon = (ImageView) findViewById(R.id.idIcon);

        buttonAge.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                String dogsAgeInputed= textBox.getText().toString();
                if(dogsAgeInputed.isEmpty()){
                    resultAge.setText("Valor inválido!");
                }else {
                    if(dogsAgeInputed.equals("19911996")){
                        resultAge.setText("Luana gatinha!");
                        //icon.setBackground(Drawable.createFromPath("@drawable/cat"));
                        icon.setImageResource(R.drawable.cat);
                    }else{
                        icon.setImageResource(R.drawable.cachorro);
                        resultAge.setText("A idade do cachorro em anos humanos é: " + (Integer.parseInt(dogsAgeInputed)*7) + " anos.");
                    }
                }
            }
        });
    }
}

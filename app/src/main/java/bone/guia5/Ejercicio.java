package bone.guia5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio extends AppCompatActivity {
    ImageView imgView3;
    ImageView imgView4;
    ImageView imgView5;

    Button btnIZQ,btnCentro,btnDerecho;
    Animation anim_COMBINADO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        btnIZQ    = (Button) findViewById(R.id.IZQ);
        btnCentro    = (Button) findViewById(R.id.centro);
        btnDerecho    = (Button) findViewById(R.id.der);

        imgView3 = (ImageView) findViewById(R.id.imageView3);
        imgView4 = (ImageView) findViewById(R.id.imageView4);
        imgView5 = (ImageView) findViewById(R.id.imageView5);



        //combinado
        //horizontal
        anim_COMBINADO = AnimationUtils.loadAnimation(this, R.anim.subir);
        anim_COMBINADO.setDuration(1000);
        anim_COMBINADO.setFillAfter(false);

        btnIZQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView3.startAnimation(anim_COMBINADO);


            }
        });
        btnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView4.startAnimation(anim_COMBINADO);

            }
        });

        btnDerecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView5.startAnimation(anim_COMBINADO);

            }
        });
    }
}

package segundotina.fiap.com.br.desafio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class HomeActivity extends AppCompatActivity {


    private ImageView imgRandom;

    private int[] play = {R.drawable.img5,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgRandom = (ImageView) findViewById(R.id.imgRandom);
    }


    public void Clicar (View v) {

        Random r = new Random();

        int playRandom = r.nextInt(5);

        imgRandom.setImageResource(play[playRandom]);

    }
}

package com.example.cnedujnux2020101369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = this.findViewById(R.id.button);
        EditText editText = this.findViewById(R.id.editText);
        TextView textView = this.findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores = editText.getText().toString();
                String []arrayScore = scores.split(",");
                BowlingGame game = new BowlingGame();
                for(int i=0;i< arrayScore.length;i++)
                {
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textView.setText("总分："+game.score());
            }
        });
    }
}
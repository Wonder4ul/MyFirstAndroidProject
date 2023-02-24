package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = (TextView) findViewById(R.id.wc1);
        text1.setText("Добро пожаловать в GloLib!");
        TextView text2 = (TextView) findViewById(R.id.wc2);
        text2.setText("Похоже, что у вас пока нету читательского билета!");
        TextView text3 = (TextView) findViewById(R.id.wc3);
        text3.setText("Нажмите клавишу 'Начать', чтобы перейти на этап регистрации билета.");

        ImageView image = (ImageView) findViewById(R.id.bookImage1);
        image.setImageDrawable(getResources().getDrawable(R.drawable.book_svgrepo_com));

//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Log.i(TAG,"Button has been pressed");
//            }
//        });

    }
    public void buttonDeclare(View view){
        Log.i(TAG,"Button has been pressed again");
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data == null) return;
        String str = data.getStringExtra("message");
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
        TextView text1 = (TextView) findViewById(R.id.wc1);
        text1.setText("Вы успешно сформировали читательский билет.\nНомер билета: " + str);
        TextView text2 = (TextView) findViewById(R.id.wc2);
        text2.setText("Нажмите клавишу 'Начать', чтобы перейти в библиотеку!");
        TextView text3 = (TextView) findViewById(R.id.wc3);
        text3.setText("");
    }
    public void onProfileClick(View view){
        Intent in = new Intent(this, MainActivity2.class);
        in.putExtra("message", "Введите необходимые данные:");
        startActivityForResult(in, 1);
    }
}
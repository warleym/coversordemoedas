package br.com.progiv.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.ButtonCalculate = findViewById(R.id.button_calculate);


    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button ButtonCalculate;
    }

}
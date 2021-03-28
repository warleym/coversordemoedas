package br.com.progiv.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.textBitcoin = findViewById(R.id.text_bitcoin);
        this.mViewHolder.ButtonCalculate = findViewById(R.id.button_calculate);

        this.mViewHolder.ButtonCalculate.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.button_calculate){
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value)){
                //Mostra Mensagem pro usuário
                Toast.makeText(this, this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();

            }else {
                Double real = Double.valueOf(value);
                this.mViewHolder.textDolar.setText(String.format("US$ %.2f",(real / 5.76))+"   |  Cotação à R$ 5,76");
                this.mViewHolder.textEuro.setText(String.format("€ %.2f",(real / 6.81))+"   |  Cotação à R$ 6,81");
                this.mViewHolder.textBitcoin.setText(String.format("BTC %.2f",(real / 323404.61))+"   |  Cotação à R$ 323.404.61");
            }
        }

    }

    private void clearValues() {
        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");
        this.mViewHolder.textBitcoin.setText("");
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        TextView textBitcoin;
        Button ButtonCalculate;
    }

}
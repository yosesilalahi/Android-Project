package id.ac.telkomuniversity.dph3a4.assessment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class BebersihActivity extends AppCompatActivity {

    EditText tvisinama, tvisisalamat;
    RadioGroup tvGrp1, tvGrp2;
    RadioButton tvbut1, tvbut2, tvbut3, tvbut4, tvbut5;
    CheckBox tvChecx;
    Button tvLjt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvisinama = findViewById(R.id.tvnama);
        tvisisalamat = findViewById(R.id.tvalmt);
        tvGrp1 = findViewById(R.id.tvgroup1);
        tvGrp2 = findViewById(R.id.tvgroup2);
        tvbut1 = findViewById(R.id.tvcash);
        tvbut2 = findViewById(R.id.tvpaypay);
        tvbut3 = findViewById(R.id.Tvtidakada);
        tvbut4 = findViewById(R.id.Tvpria);
        tvbut5 = findViewById(R.id.Tvwanita);
        tvChecx = findViewById(R.id.Tvcheck);
        tvLjt = findViewById(R.id.TvLanjut);


        tvLjt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(tvisinama.getText().toString());
                System.out.println(tvisisalamat.getText().toString());
            }

        });

        tvGrp1 = findViewById(R.id.tvgroup1);
        tvGrp1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.tvcash){
                    Log.i("radio", "Pembayaran cash");
                }else if (i == R.id.tvpaypay){
                    Log.i("radio", "Pembayaran paypay");
                }
            }
        });

        tvGrp2 = findViewById(R.id.tvgroup2);
        tvGrp2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int j) {
                if (j == R.id.Tvtidakada){
                    Log.i("radio", "tidak ada");
                }else if (j == R.id.Tvpria){
                    Log.i("radio", "Pria");
                }else if (j == R.id.Tvwanita){
                    Log.i("radio", "wanita");
            }
            }
        });

        tvChecx = findViewById(R.id.Tvcheck);
        tvChecx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b == true) {
                    Log.i("Assessment1", "saya punya Voucher");
                }else {
                    Log.i("Assessment1", "saya tidak punya Voucher");
                }
            }
        });







    }
}

package myteam.com;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoiDungChiTiet extends AppCompatActivity {

    private TextView MoTa;
    private TextView NameDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noi_dung_chi_tiet);

        MoTa = (TextView) findViewById(R.id.MoTa);
        NameDetails = (TextView) findViewById(R.id.TieuDe);
        String MoTa1 = null;
        String TieuDe1 = null;
        Bundle extras = getIntent().getExtras();
        if(extras !=null){
            MoTa1 = extras.getString("MoTa");
            TieuDe1 = extras.getString("nameDetails");
        }
        MoTa.setText(MoTa1);
        NameDetails.setText(TieuDe1);
    }
}
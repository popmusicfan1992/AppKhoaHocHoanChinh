package myteam.com;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import myteam.com.Adapter.DetailsAdapter;
import myteam.com.model.Detail;

public class ChiTietActivity extends AppCompatActivity {

    private RecyclerView rcvDetails;
    private DetailsAdapter detailsAdapter;
    private Button BackChiTiet;
    private List<Detail> listDetails;

    private DetailsAdapter.RecycleViewClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        listDetails = new ArrayList<>();
       setListDetails((ArrayList<Detail>) listDetails);
        rcvDetails = findViewById(R.id.rcv_details);
        setOnClickListener();
       detailsAdapter = new DetailsAdapter(this,listener);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvDetails.setLayoutManager(linearLayoutManager);

        detailsAdapter.setData(listDetails);
        rcvDetails.setAdapter(detailsAdapter);

        BackChiTiet = (Button) findViewById(R.id.BackChiTiet);
        BackChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChiTietActivity.this,DanhSachVideo.class);
                startActivity(intent);
            }
        });


    }

    private void setOnClickListener(){
        listener = new DetailsAdapter.RecycleViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),NoiDungChiTiet.class);
                intent.putExtra("MoTa",listDetails.get(position).getMoTa());
                intent.putExtra("nameDetails",listDetails.get(position).getNameDetails());
                startActivity(intent);
            }
        };
    }

    private void setListDetails(ArrayList<Detail> listDetails) {

        listDetails.add(new Detail(R.drawable.c1,"Bài 1:Layout cơ bản","4 Hours, 12 Lessions",R.drawable.cv1,"RelativeLayout là một ViewGroup có hiển thị các View con ở các vị trí tương đối. Vị trí của mỗi View có thể được quy định liên quan đến các View anh em (như bên trái của hoặc bên dưới một View khác) hoặc ở các vị trí tương đối với khu vực cha " +
                "RelativeLayout(chẳng hạn như sắp xếp ngay phía dưới, bên trái hoặc trung tâm)." +
                "a. Thuộc tính Gravity\n" +
                "Các View con khi đã định vị xong trong RelativeLayout, giả sử coi như tất cả các View con nằm vừa trong một đường biên chữ nhật, thì cả khối các View con này có thể dịch chuyển tới những vị trí nhất định trong RelativeLayout bằng thuộc tính: android:gravity, nó nhận các giá trị (có thể tổ hợp lại với ký hiệu | )"));
        listDetails.add(new Detail(R.drawable.c2,"Bài 2:Thực hành layout","4 Hours, 12 Lessions",R.drawable.cv2,"- android:layout_alignTop – Chỉ định đỉnh của thành phần này sẽ được canh theo đỉnh của thành phần gọi đến bằng ID.\n" +
                "- android:layout_alignBottom – Chỉ định đáy của thành phần này sẽ được canh theo đáy của thành phần gọi đến bằng ID.\n" +
                "- android:layout_alignStart – Chỉ định cạnh start của thành phần này sẽ được canh theo cạnh start của thành phần gọi đến bằng ID.\n" +
                "- android:layout_alignEnd – Chỉ định cạnh end của thành phần này sẽ được canh theo cạnh end của thành phần gọi đến bằng ID.\n" +
                "- android:layout_alignBaseline – Chỉ định baseline của thành phần này sẽ được canh theo baseline của thành phần gọi đến bằng ID. Baseline này bạn không nhìn thấy được, dùng để canh chỉnh cho text hiển thị bên trong widget, do đó sẽ hữu dụng khi canh chỉnh các TextView với nhau)."));


//        return listDetails;
    }


}
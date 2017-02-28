package pl.mallorax.mvp_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        adapter = new RecyclerAdapter(createList());
        recyclerView.setAdapter(adapter);
    }

    private List<PlaceHolder> createList(){
        List<PlaceHolder> list = new ArrayList<>();
        for(int x = 0; x < 100; x++){
            PlaceHolder holder = new PlaceHolder(R.mipmap.ic_launcher, "PlaceHolder");
            list.add(holder);
        }
        return list;
    }
}

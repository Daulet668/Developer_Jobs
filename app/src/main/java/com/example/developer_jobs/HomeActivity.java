package com.example.developer_jobs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HomeActivity extends AppCompatActivity
{





    androidx.appcompat.widget.Toolbar toolbar;
    RecyclerView recyclerView;
    List<Jobs>jobsList;
    JobsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Developer Jobs");

        recyclerView = findViewById(R.id.RecycleView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        init();


    }
        private void init(){
            jobsList = new ArrayList<Jobs>();
            adapter = new JobsAdapter(HomeActivity.this);
            recyclerView.setAdapter(adapter);
            jobsList.add(new Jobs("Teach Lead"));
            jobsList.add(new Jobs("Experience Android Developer"));
            jobsList.add(new Jobs("Platform engineer"));
            jobsList.add(new Jobs("Java developer"));
            jobsList.add(new Jobs("DevOps Engineer-Splunk"));
            jobsList.add(new Jobs("Senior Cloud Software Engineer"));
            jobsList.add(new Jobs("Big Data Engineer"));
            jobsList.add(new Jobs("Site Reliability Engineer"));
            jobsList.add(new Jobs("Sr. Data Engineer"));
            jobsList.add(new Jobs("Senior Backend Engineer"));
            jobsList.add(new Jobs("Team-Lead Developer"));
            jobsList.add(new Jobs("Software Engineer"));
            jobsList.add(new Jobs("Seeking Full-Time"));
            jobsList.add(new Jobs("Senior Research"));
            jobsList.add(new Jobs("Principal Software Engineer"));
            jobsList.add(new Jobs("SAP Application Expert FI/CO"));


            adapter.setJobsData(jobsList);
            adapter.notifyDataSetChanged();


        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return true;
    }

}






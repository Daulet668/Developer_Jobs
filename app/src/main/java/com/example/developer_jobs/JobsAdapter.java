package com.example.developer_jobs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JobsAdapter extends RecyclerView.Adapter<JobsAdapter.ViewHolder> {
    List<Jobs> jobsData = new ArrayList<>();
    Context context;

    public JobsAdapter(Context context){
        this.context = context;

    }



    public void setJobsData(List<Jobs>jobsData) {
        this.jobsData = jobsData;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layout = R.layout.jobsinfo;
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Jobs jobs= jobsData.get(position);
    holder.jobsDetails(jobs);

    }

    @Override
    public int getItemCount() {
        return jobsData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView jobsNameET;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobsNameET = itemView.findViewById(R.id.jobsNameET);
        }

        public void jobsDetails(Jobs jobs){
            String jobsName = jobs.getJobsname();
            jobsNameET.setText(jobsName);



        }
    }




    }






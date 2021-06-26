package com.rsa.mustang.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rsa.mustang.Pojo.Cobra;
import com.rsa.mustang.Pojo.Customer;
import com.rsa.mustang.R;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private Context context;
    List<Cobra.Customer> cobra = new ArrayList<>();
    List<Customer> custList = new ArrayList<>();

    /*public DataAdapter(Context context, List<Cobra.Customer>  cobra) {
        this.context = context;
        this.cobra = cobra;
    }*/
    public DataAdapter(Context context, List<Customer> cobra)
    {
        this.context = context;
        this.custList = cobra;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.single_data_template,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {

        Customer dataClass = custList.get(position);
        String ContactId = dataClass.getCi();
        String CompanyName = dataClass.getCn();
        String MainEmail = "";


        try {
            if (dataClass.getMe().toString().equals(null) || dataClass.getMe().toString().equals(""))
            {
                MainEmail = "Not Available";
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        String State = dataClass.getSt();
        String Zipcode = dataClass.getZp();

        holder.ContactId.setText(ContactId);
        holder.CompanyName.setText(CompanyName);
        holder.MainEmail.setText(MainEmail);
        holder.State.setText(State);
        holder.Zipcode.setText(Zipcode);
    }

    @Override
    public int getItemCount() {
        return custList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView ContactId,CompanyName, MainEmail, State, Zipcode;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ContactId = (TextView) itemView.findViewById(R.id.ContactId);
            CompanyName =(TextView) itemView.findViewById(R.id.CompanyName);
            MainEmail =(TextView) itemView.findViewById(R.id.MainEmail);
            State =(TextView) itemView.findViewById(R.id.State);
            Zipcode =(TextView) itemView.findViewById(R.id.Zipcode);
        }
    }
}

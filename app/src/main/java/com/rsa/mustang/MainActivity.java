package com.rsa.mustang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rsa.mustang.Adapter.DataAdapter;
import com.rsa.mustang.Database.DBHelper;
import com.rsa.mustang.Pojo.Cobra;
import com.rsa.mustang.Pojo.Customer;
import com.rsa.mustang.Retrofit.ApiClient;
import com.rsa.mustang.Retrofit.ApiInterface;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    private RecyclerView recyclerView;
    List<Cobra.Customer> lst = new ArrayList<>();
    List<Customer> custList = new ArrayList<>();
    Context context;
    DBHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        context = MainActivity.this;
        db = new DBHelper(this,null,null,1);
        recyclerView = (RecyclerView) findViewById(R.id.rcView);


        custList = db.getData();

        if(custList.size() == 0)
        {
            getDatas();
        }else {
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
            DataAdapter dataAdapter = new DataAdapter(context,custList);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(dataAdapter);

            //Toast.makeText(context, "Data Exist!", Toast.LENGTH_SHORT).show();
        }

    }

    public void getDatas()
    {

        JsonObject gsonObject = new JsonObject();
        try {
            JSONObject jsonObj_ = new JSONObject();
            jsonObj_.put("ContactType", "ALL");
            jsonObj_.put("status", true);
            jsonObj_.put("MobileDeviceId", "26134");
            jsonObj_.put("SubUserId", "0");
            jsonObj_.put("UserId", "6257");


            JsonParser jsonParser = new JsonParser();
            gsonObject = (JsonObject) jsonParser.parse(jsonObj_.toString());

            //print parameter
            Log.e("MY gson.JSON:  ", "AS PARAMETER  " + gsonObject);

        } catch (JSONException e) {
            e.printStackTrace();
        }



        Call<Cobra> call = apiInterface.GetContactList(gsonObject);
        call.enqueue(new Callback<Cobra>() {
            @Override
            public void onResponse(Call<Cobra> call, Response<Cobra> response) {

                Cobra list = response.body();
                //Toast.makeText(MainActivity.this, "output : "+list.getContactList().get(1).getCn(), Toast.LENGTH_SHORT).show();

                List<Cobra.Customer> data = response.body().getCustomerList();

                //Toast.makeText(MainActivity.this, "output : "+data.size(), Toast.LENGTH_SHORT).show();

                for (Cobra.Customer o : data)
                {
                    lst.add(o);
                }
                //Insert Data into Local Database
                db.addInfo(lst);

                //get Data From Local Database
                custList = db.getData();

                if (custList.size() != 0)
                {
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
                    DataAdapter dataAdapter = new DataAdapter(context,custList);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(dataAdapter);
                }else
                {
                    Toast.makeText(MainActivity.this, "DB list is Empty!", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Cobra> call, Throwable t) {

                Toast.makeText(MainActivity.this, "output Error : "+t, Toast.LENGTH_SHORT).show();
                Log.e("Output Error :", t.toString());
            }
        });
    }
}
package com.example.appstore;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import category.Category;
import category.CategoryAdapter;
import store.Store;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstaceState) {

        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());

        rcvCategory.setAdapter(categoryAdapter);

    }
    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();

        List<Store> listStore = new ArrayList<>();

        listStore.add(new Store(R.drawable.avt,"App"));
        listStore.add(new Store(R.drawable.avt1,"App1"));
        listStore.add(new Store(R.drawable.avt2,"App2"));
        listStore.add(new Store(R.drawable.avt3,"App3"));
        listStore.add(new Store(R.drawable.avt4,"App4"));
        listStore.add(new Store(R.drawable.avt5,"App5"));
        listStore.add(new Store(R.drawable.avt6,"App6"));

        listCategory.add(new Category("Category 1",listStore));
        listCategory.add(new Category("Category 2",listStore));
        listCategory.add(new Category("Category 3",listStore));
        listCategory.add(new Category("Category 4",listStore));
        listCategory.add(new Category("Category 5",listStore));
        listCategory.add(new Category("Category 6",listStore));



        return listCategory;
    }
}
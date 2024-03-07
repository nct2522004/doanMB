package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import book.Book;
import category.Category;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        List<Book> listBook = new ArrayList<>();
        listBook.add(new Book(R.drawable.img_avatar_1, "Mã 1"));
        listBook.add(new Book(R.drawable.img_avatar_2, "Mã 2"));
        listBook.add(new Book(R.drawable.img_avatar_3, "Mã 3"));
        listBook.add(new Book(R.drawable.img_avatar_4, "Mã 4"));
        listBook.add(new Book(R.drawable.img_avatar_5, "Mã 5"));
        listBook.add(new Book(R.drawable.img_avatar_6, "Mã 6"));
        listBook.add(new Book(R.drawable.img_avatar_7, "Mã 7"));

        List<Book> listBook1 = new ArrayList<>();
        listBook1.add(new Book(R.drawable.img_avatar_1, "An tâm tận hưởng hành trình"));

        List<Book> listBook2 = new ArrayList<>();
        listBook2.add(new Book(R.drawable.img_avatar_1, "Mẫu xe 1"));
        listBook2.add(new Book(R.drawable.img_avatar_2, "Mẫu xe 2"));
        listBook2.add(new Book(R.drawable.img_avatar_3, "Mẫu xe 3"));
        listBook2.add(new Book(R.drawable.img_avatar_4, "Mẫu xe 4"));
        listBook2.add(new Book(R.drawable.img_avatar_5, "Mẫu xe 5"));
        listBook2.add(new Book(R.drawable.img_avatar_6, "Mẫu xe 6"));
        listBook2.add(new Book(R.drawable.img_avatar_7, "Mẫu xe 7"));

        List<Book> listBook3 = new ArrayList<>();
        listBook3.add(new Book(R.drawable.img_avatar_1, "Địa điểm 1"));
        listBook3.add(new Book(R.drawable.img_avatar_2, "Địa điểm 2"));
        listBook3.add(new Book(R.drawable.img_avatar_3, "Địa điểm 3"));
        listBook3.add(new Book(R.drawable.img_avatar_4, "Địa điểm 4"));
        listBook3.add(new Book(R.drawable.img_avatar_5, "Địa điểm 5"));
        listBook3.add(new Book(R.drawable.img_avatar_6, "Địa điểm 6"));
        listBook3.add(new Book(R.drawable.img_avatar_7, "Địa điểm 7"));

        listCategory.add(new Category("Chương trình khuyến mãi", listBook));
        listCategory.add(new Category("Bảo hiểm thuê xe", listBook1));
        listCategory.add(new Category("Xe dành cho bạn", listBook2));
        listCategory.add(new Category("Địa điểm nổi bật", listBook3));

        return listCategory;
    }
}
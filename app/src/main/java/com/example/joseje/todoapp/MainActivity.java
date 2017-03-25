package com.example.joseje.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView toDoRecyclerView = (RecyclerView) findViewById(R.id.todo_list);
        List<ToDoItem> items = getItems();
        toDoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        toDoRecyclerView.setAdapter(new ToDoAdapter(this, items));
    }

    public List<ToDoItem> getItems() {
        List<ToDoItem> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ToDoItem item1 = new ToDoItem("Hola mundo" + i, "25/3/2017", "Hermosillo, Son.");
            items.add(item1);
        }
        return items;
    }
}

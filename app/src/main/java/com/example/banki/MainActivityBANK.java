package com.example.banki;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivityBANK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainBANK);

        // Находим ListView в разметке активити
        ListView listView = (ListView) this.findViewById(R.id.listViewsBank);

        // Создаём ListView, в котором будут храниться данные для списка
        ArrayList<DataFlagsBANK> list = new ArrayList<>();
        list.clear();

        /* Наполняем List данным. В данном случае данные передаются Объектом,
         * в котором хранятся id, указывающие на флаги в ресурсах, а также
         * на Строки, в которых прописаны названия валют стран и аббревиатуры этих валют */
        list.add(new DataFlagsBANK(R.string.street, R.string.bank, R.string.state, R.string.hourse));


        /* Создаём адаптер, который будет передавать данные из List`а в
         * элемент ListView и подключаем его непосредственно к ListView`у
         */
        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }

}
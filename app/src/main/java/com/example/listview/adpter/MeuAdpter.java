package com.example.listview.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listview.R;
import com.example.listview.modelos.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class MeuAdpter extends ArrayAdapter<Tarefa> {


    private Context context;
    private List<Tarefa> tarefas;


    public MeuAdpter(Context context, ArrayList<Tarefa> list){

        super(context, 0,list);
        this.context = context;
        tarefas = list;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItem = convertView;
        if(listItem==null){
            listItem = LayoutInflater.from(context).inflate(R.layout.layout_lista,parent,false);
        }

        Tarefa tarefaAtual = tarefas.get(position);
        TextView nome = listItem.findViewById(R.id.tarefa_nome);
        nome.setText(tarefaAtual.getNome());
        TextView status = listItem.findViewById(R.id.tarefa_status);
        status.setText(tarefaAtual.getStatus().toString());




        return listItem;



    }
}


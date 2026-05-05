package com.example.listadetarefas

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    //Inicialização de variáveis

    private lateinit var editTarefa: EditText
    private lateinit var btnAdd: Button
    private lateinit var listaTarefa: ListView

    private val tarefas = ArrayList<String>()

    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Atribuir valores as nossas variáveis:
        editTarefa = findViewById(R.id.edit_tarefas) // encontra o componente com o id
        btnAdd = findViewById(R.id.button)
        listaTarefa = findViewById(R.id.lista_tarefas)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tarefas)
        listaTarefa.adapter = adapter

        btnAdd.setOnClickListener {
            val tarefa = editTarefa.text.toString()

            if(tarefa.isNotEmpty()){
                tarefas.add(tarefa)
                adapter.notifyDataSetChanged()
                editTarefa.text.clear()
            }else{
                Toast.makeText(this,"Digite uma tarefa!",Toast.LENGTH_SHORT).show()
            }
        }

        listaTarefa.setOnItemClickListener { _, _, position, _->
            tarefas.removeAt(position)
            adapter.notifyDataSetChanged()
        }
    }
}
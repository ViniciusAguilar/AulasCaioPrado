package com.example.tarefasatualizado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast


class AddFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val editTitle = view.findViewById<EditText>(R.id.editTitle)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
        val btnSave = view.findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val title = editTitle.text.toString().trim()

            if (title.isEmpty()){
                editTitle.error = "Digite um título"
                return@setOnClickListener
            }

            val priority = when(radioGroup.checkedRadioButtonId){
                R.id.radioAlta -> "Alta"
                R.id.radioBaixa -> "Baixa"
                else            -> "Média"
            }

            val db = TaskDatabase.getInstances(requireContext())
            db.taskDao().insetTask(Task(title = title, priority = priority))

            Toast.makeText(requireContext(), "Tarefa Salva!", Toast.LENGTH_SHORT).show()
            editTitle.text.clear()


        }


    }


}
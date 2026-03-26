package com.rafaela.cadastrousurio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

//Classe Adapter: Gerencia a criação e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    //Atributo privado que armazena a referência dos dados que serão exibidos
    private List<String> listaUsuarios;

    //Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter
   public UserAdapter(List<String> lista){
       this.listaUsuarios = lista;

   }

   //Método: Cria do zero o visual de uma linha da lista(+ViewHolder)

    @NonNull
    @Override   //sobreescrever método
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
       //LayoutInflater transforma o arquivo XML em um objeto VIEW JAVA

        //Aqui usamos um Layout padrão do Android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);

    }
}

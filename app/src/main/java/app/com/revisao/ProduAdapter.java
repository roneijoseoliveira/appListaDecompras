package app.com.revisao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by roneijose on 22/11/2017.
 */

public class ProduAdapter extends ArrayAdapter<Produ> {

    Context contexto;
    ArrayList<Produ> produtos;

    public ProduAdapter(Context context, int resource,
                          ArrayList<Produ> objects){
        super(context, resource, objects);
        this.contexto = context;
        this.produtos = objects;
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent){
        View linhaView = LayoutInflater.from(contexto)
                .inflate(R.layout.linha, parent, false);

        TextView nome = (TextView)linhaView.
                findViewById(R.id.linha_nome);

        TextView quantidade = (TextView)linhaView.
                findViewById(R.id.linha_quantidade);

        TextView categoria = (TextView)linhaView.
                findViewById(R.id.linha_categoria);

        nome.setText(produtos.get(position).getNome());

        quantidade.setText(produtos.get(position).getQuantidade());

        categoria.setText(produtos.get(position).getCategoria());

        return linhaView;

    }
}

package com.edileusondias.traktseries.adapters;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Eddy on 2/27/2016.
 */
public class GridAdapter {
    private TextView descricao;
    private ImageView imagem;

    public TextView getDescricao() {
        return descricao;
    }

    public void setDescricao(TextView descricao) {
        this.descricao = descricao;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }
}

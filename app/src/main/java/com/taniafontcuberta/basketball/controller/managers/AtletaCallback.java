package com.taniafontcuberta.basketball.controller.managers;

import com.taniafontcuberta.basketball.model.Atleta;

import java.util.List;

/**
 * Created by DAM on 1/3/17.
 */

public interface AtletaCallback {
    void onSuccess(List<Atleta> atletaList);
    void onSucces();

    void onFailure(Throwable t);
}

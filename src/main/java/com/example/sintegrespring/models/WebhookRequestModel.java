package com.example.sintegrespring.models;


import java.util.Date;

public record WebhookRequestModel(
        String url,
        String nome,
        String dataProduto,
        String processo,
        String macroProcesso,
        Date periodicidade,
        Date periodicidadeFinal) {

}

package com.example.isl_schools.model;

import androidx.annotation.NonNull;

public class Escola {

    private String nome, nomeEscola, email, endereco;

    public Escola(String nome, String nomeEscola, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @NonNull
    @Override
    public String toString(){
        return this.getNome() + "\n" + this.getEmail() + "\n" + this.getNomeEscola() + "\n" + this.getEndereco();
    }

}

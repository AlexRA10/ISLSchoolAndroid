package com.example.isl_schools.dao;

import com.example.isl_schools.model.Escola;

import java.util.ArrayList;
import java.util.List;

public class EscolaDao {

    private final static List<Escola> escolas = new ArrayList<>();

    public void salvar(Escola escola){ escolas.add(escola);
    }

    public List<Escola> all(){ return new ArrayList<>(escolas);
    }

}

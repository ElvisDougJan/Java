package br.com.douglaslopesfarias.dao;

import java.util.ArrayList;

import br.com.douglaslopesfarias.model.Cidade;

public interface IPersistencia {
	
    void inserir(Cidade c);
    
    void alterar(Cidade c);
    
    void excluir(Cidade c);
    
    Cidade buscar(int id);
    
    ArrayList<Cidade> listar();

}

package br.com.douglaslopesfarias.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.douglaslopesfarias.config.Conexao;
import br.com.douglaslopesfarias.model.Cidade;

public class CidadeDAO implements IPersistencia {
	
	//Criando uma variavel do tipo string
	String q;
	//Criando uma variavel status do tipo String que recebe um campo vazio, do tipo static
    static String status = "";
    
    Connection con = Conexao.getConnection();
    static ArrayList<Cidade> cidades = new ArrayList<>();
    
    private int codigo;
    private String nome;
    private String uf;

    @Override
    public void inserir(Cidade c) {
        q = "insert into cidades(codigo,nome,uf) "
                + "values("+c.getCodigo()+", '" + c.getNome() + " ', '" + c.getUf() + "')";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(q);
            status = "Registro incluido com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel incluir o registro erro: "
                    + e.getMessage() + " sql executado: " + q;
        }
    }

    @Override
    public void alterar(Cidade c) {
        q = "update cidades set nome='" + c.getNome() + "', uf= '" + c.getUf() + "' "
                + " where codigo = " + c.getCodigo();
        try {
            Statement st = con.createStatement();
            st.executeUpdate(q);
            status = "Registro alterado com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel alterar o registro erro: "
                    + e.getMessage() + " sql executado: " + q;
        }
    }

    @Override
    public void excluir(Cidade c) {
        q = "delete from cidades where codigo = " + c.getCodigo();
        try {
            Statement st = con.createStatement();
            st.executeUpdate(q);
            status = "Cidade " + c.getCodigo() + " Excluido com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel excluir o registro erro: "
                    + e.getMessage() + " sql executado: " + q;
        }
    }

    @Override
    public Cidade buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cidade> listar() {
        cidades.clear();
        q = "select * from cidades ";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                codigo = rs.getInt("codigo");
                nome = rs.getString("nome");
                uf = rs.getString("uf");
                Cidade c1 = new Cidade(nome, uf, codigo);
                cidades.add(c1);
            }
        } catch (SQLException e) {
            status = e.getMessage();
        }
        return cidades;
    }
    

}
package dao;

import java.util.ArrayList;
import Models.Estoque;
import Models.Produto;

public class DAO {

	//Local onde ser� armazenado os objetos
    static ArrayList<Produto> produtos = new ArrayList();
    static ArrayList<Estoque> estoques = new ArrayList();

    //M�todo que retorna todos os 
    public ArrayList<Produto> GetAllProduto() { return produtos; }
    
    //Obt�m a quantidade de produtos j� cadastrados
    public int GetQuantityProduto() { return produtos.size(); }
    
    //Adiciona um novo produto
    public void CreateProduto(Produto novo) { 
        int maiorId = 0;
        for (Produto p : produtos) { 
            if (p.getId() > maiorId) { 
                maiorId = p.getId(); 
            }
        }
        novo.setId(maiorId + 1);
        produtos.add(novo); 
    }
    
    //Retira um produto
    public void DeleteProduto(Produto pe) { produtos.remove(pe); }
    
    //Retira um produto passando como parametro o id dele
    public void DeleteByIdProduto(int id) throws Exception {
    	Produto p = GetByIdProduto(id);
    	DeleteProduto(p);
    	
    }
    
    //Obt�m por Id
    public Produto GetByIdProduto(int id_procurado) throws Exception { 
        for (Produto pe : produtos) {
            if (pe.getId() == id_procurado) {
                return pe;
            }
        }
        throw new Exception("N�o encontrado");
    } 

    //Alterar
    public void UpdateProduto(Produto p) {
        int ondeMudar = -1;
        for (int i = 0; i < GetQuantityProduto(); i++) {
            if (produtos.get(i).getId() == p.getId()) {
                ondeMudar = i;
                break;
            }
        }
        if (ondeMudar >= 0) {
            produtos.set(ondeMudar, p);
        }
    }
    
    
    
    public ArrayList<Estoque> GetAllEstoques() { return estoques; }
    
    public void CreateEsotuqe(Estoque novo) { 
        int maiorId = 0;
        for (Estoque l : estoques) { 
            if (l.getId() > maiorId) { 
                maiorId = l.getId(); 
            }
        }
        novo.setId(maiorId + 1);
        estoques.add(novo); 
    }
    
    public Estoque GetEstoqueByProdutoId(int produtoId)  throws Exception { 
        for (Estoque pe : estoques) {
            if (pe.getProduto().getId() == produtoId) {
                return pe;
            }
        }
        throw new Exception("N�o encontrado");
    } 
}

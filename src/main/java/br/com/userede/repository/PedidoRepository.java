package br.com.userede.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.userede.model.Pedido;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, String> {

	
}

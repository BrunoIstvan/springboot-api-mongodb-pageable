package br.com.userede.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.userede.model.Pedido;
import br.com.userede.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Page<Pedido> findAll(Pageable pageable) {
		
		return repo.findAll(pageable);
		
	}
	
}

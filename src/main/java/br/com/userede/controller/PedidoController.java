package br.com.userede.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.userede.model.Pedido;
import br.com.userede.service.PedidoService;

@RestController
@RequestMapping("/pedidos-backend")
public class PedidoController {

	@Autowired
	private PedidoService serv;
	
	@GetMapping("/{pv}/{force}")
	public List<Pedido> forceUpdateData(
			@PathVariable("pv") String pv, 
			@PathVariable("force") Boolean force,
			Pageable pageable) {
		
		Page<Pedido> findAll = serv.findAll(pageable);
		
		return findAll.getContent();
	}
	
}

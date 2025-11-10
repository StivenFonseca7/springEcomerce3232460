package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DetalleOrden;
import com.example.demo.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImplement implements IDetalleOrdenService {
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return detalleOrdenRepository.save(detalleOrden);
	}

}

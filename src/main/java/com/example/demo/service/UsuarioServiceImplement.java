package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.SpringEcommerceApplication;
import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    private final SpringEcommerceApplication springEcommerceApplication;

	// instancia de objeto de tipo autowired
	@Autowired
	private IUsuarioRepository usuarioRepository;

    UsuarioServiceImplement(SpringEcommerceApplication springEcommerceApplication) {
        this.springEcommerceApplication = springEcommerceApplication;
    }
	
	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> get(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.save(usuario);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		// TODO Auto-generated method stub
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

}

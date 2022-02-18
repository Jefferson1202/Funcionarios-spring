package br.com.LHWebinar.lh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LHWebinar.lh.model.VagasModel;

public interface VagasRepository extends JpaRepository<VagasModel, Long>{
	
	VagasModel findById(long id);
	//VagasModel findByNome(String nome);
}

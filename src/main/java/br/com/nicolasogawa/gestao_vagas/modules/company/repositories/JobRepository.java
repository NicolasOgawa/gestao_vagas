package br.com.nicolasogawa.gestao_vagas.modules.company.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nicolasogawa.gestao_vagas.modules.company.entities.jobEntity;

public interface JobRepository extends JpaRepository<jobEntity, UUID>{
    
}

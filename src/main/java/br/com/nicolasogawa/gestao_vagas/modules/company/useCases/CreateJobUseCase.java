package br.com.nicolasogawa.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nicolasogawa.gestao_vagas.modules.company.entities.jobEntity;
import br.com.nicolasogawa.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {

        @Autowired
        private JobRepository jobRepository;

        public jobEntity execute(jobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
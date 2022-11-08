package Kodlama.io.Devs.LanguageHomework.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.LanguageHomework.entities.concretes.Tecnology;

@Repository
public interface TecnologyRepository extends JpaRepository<Tecnology, Integer> {

}

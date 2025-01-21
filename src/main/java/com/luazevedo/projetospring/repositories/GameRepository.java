package com.luazevedo.projetospring.repositories;

import com.luazevedo.projetospring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

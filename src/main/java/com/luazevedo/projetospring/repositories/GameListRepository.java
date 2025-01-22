package com.luazevedo.projetospring.repositories;

import com.luazevedo.projetospring.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

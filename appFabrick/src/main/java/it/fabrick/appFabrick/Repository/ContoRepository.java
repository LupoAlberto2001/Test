package it.fabrick.appFabrick.Repository;

import it.fabrick.appFabrick.Model.Conto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContoRepository extends JpaRepository <Conto,Long> {
}

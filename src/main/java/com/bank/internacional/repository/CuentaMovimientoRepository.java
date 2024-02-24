package com.bank.internacional.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.internacional.model.Movimientos;


@Repository
public interface CuentaMovimientoRepository extends JpaRepository<Movimientos, Long>  {

}

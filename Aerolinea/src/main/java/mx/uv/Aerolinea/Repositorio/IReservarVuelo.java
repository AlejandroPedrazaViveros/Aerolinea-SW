package mx.uv.Aerolinea.Repositorio;

import org.springframework.data.repository.CrudRepository;

import mx.uv.Aerolinea.DTO.ReservarVuelo;

public interface IReservarVuelo extends CrudRepository<ReservarVuelo, Integer> {

}

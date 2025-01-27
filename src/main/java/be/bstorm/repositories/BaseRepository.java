package be.bstorm.repositories;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<TEntity, TId> {
    List<TEntity> findAll();
    Optional<TEntity> findById(TId id);
    TEntity save(TEntity user);
    TEntity update(TEntity user);
    TEntity delete(TEntity id);
}

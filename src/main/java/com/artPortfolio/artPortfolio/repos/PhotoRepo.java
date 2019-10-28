package com.artPortfolio.artPortfolio.repos;

import com.artPortfolio.artPortfolio.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepo extends JpaRepository<Photo, Long> {
}

package com.artPortfolio.artPortfolio.repos;

import com.artPortfolio.artPortfolio.models.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepo extends JpaRepository<Avatar, Long> {
}

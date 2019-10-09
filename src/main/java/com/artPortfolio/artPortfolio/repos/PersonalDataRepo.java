package com.artPortfolio.artPortfolio.repos;

import com.artPortfolio.artPortfolio.models.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDataRepo extends JpaRepository<PersonalData, Long> {
}

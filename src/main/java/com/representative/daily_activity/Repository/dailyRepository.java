package com.representative.daily_activity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.representative.daily_activity.Entity.dailyEntity;

@Repository
public interface dailyRepository extends JpaRepository<dailyEntity, Long> {
}

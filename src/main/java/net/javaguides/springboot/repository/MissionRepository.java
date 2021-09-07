package net.javaguides.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.Mission;


@Repository
public interface MissionRepository extends JpaRepository< Mission , Long> {
		}


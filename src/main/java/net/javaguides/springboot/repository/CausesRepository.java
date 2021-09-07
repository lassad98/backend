package net.javaguides.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.Causes;

@Repository
public interface CausesRepository  extends JpaRepository< Causes , Long>  {

}



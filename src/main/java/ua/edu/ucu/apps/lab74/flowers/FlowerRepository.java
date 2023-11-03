package ua.edu.ucu.apps.lab74.flowers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer>{
    
}

package dxcapimaven.repository;

import dxcapimaven.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client, Integer>
    {
        Optional<Client> findBySurnameAndName(String surname, String name);


    }

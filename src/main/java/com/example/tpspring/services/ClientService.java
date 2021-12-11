package com.example.tpspring.services;

import com.example.tpspring.entities.Client;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ClientService {

    void ajouterClient(Client client);
    Optional<Client> chercherClientByID(long id);
    void supprimerClient(long id);
    void supprimerToutLesClients();
    List<Client> chercherClient();
}

package com.example.tpspring.services;

import com.example.tpspring.entities.Client;
import com.example.tpspring.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    @Autowired
    public ClientRepository clientRepositorie;


    public ClientServiceImpl(ClientRepository clientRepositorie) {
        this.clientRepositorie = clientRepositorie;
    }

    @Override
    public void ajouterClient(Client client) {

        clientRepositorie.save(client);
    }

    @Override
    public Optional<Client> chercherClientByID(long id) {
        return clientRepositorie.findById(id);
    }

    @Override
    public void supprimerClient(long id) {
        clientRepositorie.deleteById(id);
    }

    @Override
    public void supprimerToutLesClients() {
        clientRepositorie.deleteAll();
    }

    @Override
    public List<Client> chercherClient() {
        return clientRepositorie.findAll();
    }
}

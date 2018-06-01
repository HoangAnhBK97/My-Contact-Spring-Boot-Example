package com.hoanganhbk.service;

import com.hoanganhbk.domain.Contact;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ContactService {
    Iterable<Contact> findAll();

    List<Contact> search(String q);

    Optional<Contact> findOne(int id);

    void save(Contact contact);

    void delete(int id);
}

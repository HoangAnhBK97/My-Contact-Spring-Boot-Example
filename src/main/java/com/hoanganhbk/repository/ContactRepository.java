package com.hoanganhbk.repository;

import com.hoanganhbk.domain.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    List<Contact> findByNameContaining(String q);
}

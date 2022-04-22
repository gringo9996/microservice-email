package com.msemail.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msemail.models.EmailModel;
@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}

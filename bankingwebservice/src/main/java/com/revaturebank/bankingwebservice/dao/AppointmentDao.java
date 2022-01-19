package com.revaturebank.bankingwebservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revaturebank.bankingwebservice.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();

	Appointment findOne(Long id);
}

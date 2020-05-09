/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.babu.meroonlinebakery.web.appointment.repository;

import com.babu.meroonlinebakery.web.appointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Babu TUl
 */
@Repository
public interface AppointmentRepository extends
        JpaRepository<Appointment, Integer> {

}

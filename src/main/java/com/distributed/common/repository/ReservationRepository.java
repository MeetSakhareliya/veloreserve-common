package com.distributed.common.repository;

import com.distributed.common.entity.Payment;
import com.distributed.common.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, UUID> {

    @Query("SELECT r.trainRun.id, COUNT(*) FROM Reservation r GROUP BY r.trainRun.id")
    List<Object[]> reservationCountByTrainTrip();
}

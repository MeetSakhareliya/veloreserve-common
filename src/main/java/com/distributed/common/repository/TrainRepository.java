package com.distributed.common.repository;

import com.distributed.common.entity.Payment;
import com.distributed.common.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
}

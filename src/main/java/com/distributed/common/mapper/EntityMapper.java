package com.distributed.common.mapper;

import com.distributed.common.dto.*;
import com.distributed.common.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    @Mapping(source = "trainRun", target = "trainTrip")
    @Mapping(source = "paymentId", target = "payment")
    @Mapping(source="userId.userId", target="userId")
    ReservationResponse toReservationResponse(Reservation reservation);
    List<ReservationResponse> toReservationResponse(List<Reservation> reservation);


    @Mapping(source="id", target="trainTripid")
    @Mapping(source="train.id", target="trainId")
    @Mapping(source="train.name", target = "name")
    @Mapping(source="train.sourceStation", target = "sourceStation")
    @Mapping(source="train.destinationStation", target = "destinationStation")
    @Mapping(source="train.ticketPrice", target = "ticketPrice")
    TrainTripResponseDTO toTrainTripResponse(TrainTrip trainRun);
    List<TrainTripResponseDTO> toTrainTripResponse(List<TrainTrip> trainRun);

    ReservationPassengerResponseDTO toPassengerResponse(ReservationPassenger passenger);
    PaymentResponseDTO toPaymentResponse(Payment paymentId);

    @Mapping(source = "masterPassengerList", target = "masterPassengers")
    UserProfileResponseDTO toUserProfileResponse(User user);
    List<UserProfileResponseDTO> toUserProfileResponse(List<User> user);
    UserSummaryResponseDTO toUserSummaryResponse(User user);

    @Mapping(source="userId.userId", target="userId")
    MasterPassengerResponseDTO toMasterPassenger(MasterPassenger entity);
    List<MasterPassengerResponseDTO> toMasterPassenger(List<MasterPassenger> entity);

}

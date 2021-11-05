package com.acyuta.rf.configuration.messaging;

import com.acyuta.rf.configuration.service.UserService;
import com.acyuta.rf.rafantasyShared.dto.config.UserTotalUpdateDto;
import com.acyuta.rf.rafantasyShared.feign.scoring.ParticipationPoints;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageConsumer {

    private final UserService userService;

    @RabbitListener(queues = "occurrence-scoring-finished")
    public void userScoreConsume(UserTotalUpdateDto userTotalUpdateDto) {
        userService.updateTotalPoints(userTotalUpdateDto);
    }
}

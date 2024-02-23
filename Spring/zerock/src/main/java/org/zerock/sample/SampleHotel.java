package org.zerock.sample;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
@RequiredArgsConstructor //final 변수거나 nonnull지정된 변수
public class SampleHotel {
    @NonNull
    private Chef chef;
    //private final String test1;
    private String test2;
}
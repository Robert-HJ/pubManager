package com.toyProject.pubManager.framework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@SuperBuilder
public class BaseDto {

    private int no;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}

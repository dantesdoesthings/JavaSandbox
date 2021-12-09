package com.dantesdoesthings.sandbox;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleBean {

    @NotEmpty
    @Size(min = 5, max = 50)
    String description;
    @NotNull
    Long id;

}

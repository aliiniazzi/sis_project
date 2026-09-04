package org.aliniazi.sis.config;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
@ConfigurationProperties(prefix = "sis")
public class SisProperties {

    @NotBlank
    private String applicationName;

    @NotBlank
    private String applicationVersion;

    @NotBlank
    private String environment;

}

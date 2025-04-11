package app.dto;

import lombok.*;
import java.time.LocalDate;

/**
 * DTO для работы с проектами
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {
    /**
     * ID проекта
     */
    private Long id;

    /**
     * Название проекта
     */
    private String name;

    /**
     * Описание проекта
     */
    private String description;

    /**
     * Дата начала
     */
    private LocalDate startDate;

    /**
     * Дата завершения
     */
    private LocalDate endDate;

    /**
     * Статус проекта
     */
    private String status;
}
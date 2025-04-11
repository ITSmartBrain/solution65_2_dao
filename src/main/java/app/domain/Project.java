package app.domain;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Сущность проекта в системе управления проектами
 */
@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
    /**
     * Уникальный идентификатор проекта
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Название проекта
     */
    @Column(nullable = false, length = 100)
    private String name;

    /**
     * Описание проекта
     */
    @Column(length = 500)
    private String description;

    /**
     * Дата начала проекта
     */
    @Column(nullable = false)
    private LocalDate startDate;

    /**
     * Дата завершения проекта
     */
    private LocalDate endDate;

    /**
     * Статус проекта (ACTIVE, COMPLETED, CANCELLED)
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProjectStatus status;

    /**
     * Список задач в проекте
     */
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Task> tasks;
}


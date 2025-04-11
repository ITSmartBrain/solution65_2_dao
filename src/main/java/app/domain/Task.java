package app.domain;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

/**
 * Сущность задачи в проекте
 */
@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    /**
     * Уникальный идентификатор задачи
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Название задачи
     */
    @Column(nullable = false, length = 100)
    private String title;

    /**
     * Описание задачи
     */
    @Column(length = 500)
    private String description;

    /**
     * Срок выполнения задачи
     */
    @Column(nullable = false)
    private LocalDate dueDate;

    /**
     * Статус задачи (NEW, IN_PROGRESS, COMPLETED)
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus status;

    /**
     * Проект, к которому относится задача
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;
}


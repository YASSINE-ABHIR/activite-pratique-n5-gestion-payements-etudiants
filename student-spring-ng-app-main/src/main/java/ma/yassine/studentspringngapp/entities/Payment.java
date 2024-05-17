package ma.yassine.studentspringngapp.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.yassine.studentspringngapp.enumirat.PaymentStatus;
import ma.yassine.studentspringngapp.enumirat.PaymentType;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Payment {
    @Id @UuidGenerator
    private String id;
    @Temporal(TemporalType.DATE)
    private LocalDate date;
    private double amount;
    @Enumerated(EnumType.STRING)
    private PaymentType type;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    private String receipt;
    @ManyToOne
    private Student student;
}

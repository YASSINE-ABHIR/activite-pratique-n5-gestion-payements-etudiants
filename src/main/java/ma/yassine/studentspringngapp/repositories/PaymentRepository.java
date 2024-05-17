package ma.yassine.studentspringngapp.repositories;

import ma.yassine.studentspringngapp.entities.Payment;
import ma.yassine.studentspringngapp.enumirat.PaymentStatus;
import ma.yassine.studentspringngapp.enumirat.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,String> {
    List<Payment> findByStudentCode(String studentCode);
    List<Payment> findByStatus(PaymentStatus paymentStatus);
    List<Payment> findByType(PaymentType paymentType);
}

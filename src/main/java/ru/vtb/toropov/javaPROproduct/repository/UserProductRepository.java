package ru.vtb.toropov.javaPROproduct.repository;

import ru.vtb.toropov.javaPROproduct.model.UserProduct;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserProductRepository.
 *
 * @author DToropov
 */
public interface UserProductRepository extends JpaRepository<UserProduct, Long> {

  List<UserProduct> findByUserId(Long userId);

}

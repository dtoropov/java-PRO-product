package ru.vtb.toropov.product.repository;

import ru.vtb.toropov.product.model.UserProduct;
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

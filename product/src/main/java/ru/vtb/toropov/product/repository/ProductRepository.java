package ru.vtb.toropov.product.repository;

import ru.vtb.toropov.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ProductRepository.
 *
 * @author DToropov
 */
public interface ProductRepository  extends JpaRepository<Product, Long> {

}

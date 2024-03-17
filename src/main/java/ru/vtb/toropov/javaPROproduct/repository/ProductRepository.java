package ru.vtb.toropov.javaPROproduct.repository;

import ru.vtb.toropov.javaPROproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ProductRepository.
 *
 * @author DToropov
 */
public interface ProductRepository  extends JpaRepository<Product, Long> {

}

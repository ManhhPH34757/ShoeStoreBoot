package com.spring.shoestoreboot.repositories;

import com.spring.shoestoreboot.dto.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDTORepository extends JpaRepository<ProductDTO, Integer> {

    @Query(
            value = """
            SELECT 
                p._id_product AS 'id',
                p._product_code AS 'product_code',
                p._product_name AS 'product_name',
                b._brand_name AS 'brand_name',
                c._category_name AS 'category_name',
                s._sole_name AS 'sole_name',
                m._material_name AS 'material_name',
                p._date_created AS 'date_created',
                p._date_updated AS 'date_updated',
                COALESCE(SUM(pd._quantity), 0) AS 'quantity'
            FROM dbo.product p
            JOIN dbo.brand b ON p._id_brand = b._id_brand
            JOIN dbo.category c ON p._id_category = c._id_category
            JOIN dbo.material m ON m._id_material = p._id_material
            JOIN dbo.sole s ON s._id_sole = p._id_sole
            LEFT JOIN dbo.product_details pd ON p._id_product = pd._id_product
            GROUP BY p._id_product, p._product_code, p._product_name, b._brand_name, c._category_name, s._sole_name, m._material_name, p._date_created, p._date_updated;
            
            """,
            nativeQuery = true
    )
    List<ProductDTO> getAllProducts();
}
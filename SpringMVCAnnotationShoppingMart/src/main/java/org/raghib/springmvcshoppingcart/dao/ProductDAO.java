package org.raghib.springmvcshoppingcart.dao;

import org.raghib.springmvcshoppingcart.entity.Product;
import org.raghib.springmvcshoppingcart.model.PaginationResult;
import org.raghib.springmvcshoppingcart.model.ProductInfo;

public interface ProductDAO {
	
public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);

}

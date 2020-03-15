package com.deloitte.ecommerce.dkartcarts.controller;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dkart/api")
public class DkartCartsController {
	final static Logger LOG = Logger.getLogger(DkartCartsController.class);

	@RequestMapping(value = "/carts/{cartId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getCartDetailsById(@PathVariable String cartId) throws Exception{
		LOG.info("The cart id is :" + cartId);
		//if(cartId!= null && !cartId.isEmpty()) {
			//response = dkartCartsService.getCartItems(cartId);
		//} else {
		//	response = new CartItems();
		//}
		return "{\"cartItems\":[{\"productId\":\"2\",\"title\":\"Nikon D3400 DSLR Camera Body with Single Lens: AF-P DX NIKKOR 18-55 mm (Black)\",\"productImage\":\"nikon-dslr.jpg\",\"itemId\":2,\"specification\":{\"noOfItems\":4,\"itemPrice\":414,\"itemFormattedPrice\":\"414.00\",\"totalPrice\":1656,\"totalFormattedPrice\":\"1,656.00\",\"itemOriginalPrice\":\"450\",\"itemOriginalFormattedPrice\":\"450.00\",\"totalOriginalPrice\":\"1800\",\"totalOriginalFormattedPrice\":\"1,800.00\",\"isDiscounted\":true}}],\"totalPrice\":\"1,656.00\",\"cartID\":1,\"totalOriginalPrice\":\"1,800.00\",\"savings\":\"144.00\",\"isDiscounted\":true}";
	}
	
	
}

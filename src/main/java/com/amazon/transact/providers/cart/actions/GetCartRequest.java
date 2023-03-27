package com.amazon.transact.providers.cart.actions;

public class GetCartRequest {
    public String getCartId() {
        return cartId;
    }

    private String cartId;

    public GetCartRequest(String cartId) {
        this.cartId = cartId
    }
}

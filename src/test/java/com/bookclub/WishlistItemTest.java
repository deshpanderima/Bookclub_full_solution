package com.bookclub;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.bookclub.model.WishlistItem;

class WishlistItemTest {

    @Test
    void testWishlistItemConstructor() {
        // Create a WishlistItem using the constructor
        WishlistItem wishlistItem = new WishlistItem("1234567890", "Sample Book");

        // Assert that the attributes are set correctly
        assertEquals("1234567890", wishlistItem.getIsbn());
        assertEquals("Sample Book", wishlistItem.getTitle());
        assertNull(wishlistItem.getId()); // ID should be null when using the constructor
        assertNull(wishlistItem.getUsername()); // Username should be null when using the constructor
    }

    @Test
    void testWishlistItemSetterMethods() {
        // Create a WishlistItem
        WishlistItem wishlistItem = new WishlistItem();

        // Use setter methods to set attributes
        wishlistItem.setIsbn("9876543210");
        wishlistItem.setTitle("New Book");
        wishlistItem.setId("abcd1234");
        wishlistItem.setUsername("user123");

        // Assert that the attributes are set correctly
        assertEquals("9876543210", wishlistItem.getIsbn());
        assertEquals("New Book", wishlistItem.getTitle());
        assertEquals("abcd1234", wishlistItem.getId());
        assertEquals("user123", wishlistItem.getUsername());
    }
}

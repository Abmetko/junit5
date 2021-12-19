package com.wimix.smoke;

import com.wimix.Base;
import com.wimix.ui.ContainerHeader;
import com.wimix.ui.enums.MenuItems;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.parallel.ResourceLock;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ResourceLock("ServiceTest")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ServiceTest extends Base {

    private final ContainerHeader containerHeader = new ContainerHeader();

    @BeforeEach
    public void beforeEach() {
        System.out.println(this.hashCode());
    }

    @Test
    public void openHomePage() {
        String name = MenuItems.HOME.value;
        containerHeader.selectHeaderMenu(name);
        assertTrue(containerHeader.isMenuItemSelected(name));
    }

    @Test
    public void openContactUsPage() {
        String name = MenuItems.CONTACT_US.value;
        containerHeader.selectHeaderMenu(name);
        assertTrue(containerHeader.isMenuItemSelected(name));
    }
}
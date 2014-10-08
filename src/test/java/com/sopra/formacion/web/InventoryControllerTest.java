package com.sopra.formacion.web;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.formacion.domain.Product;
import com.sopra.formacion.repository.InMemoryProductDao;
import com.sopra.formacion.service.SimpleProductManager;


public class InventoryControllerTest {

    @Test
    public void testHandleRequestView() throws Exception{		
        InventoryController controller = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
        controller.setProductManager(spm);
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map<?,?> modelMap = (Map<?,?>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}

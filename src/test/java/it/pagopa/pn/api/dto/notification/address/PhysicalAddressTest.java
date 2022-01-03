package it.pagopa.pn.api.dto.notification.address;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhysicalAddressTest {
    @Test
    public void test1() {
        PhysicalAddress physicalAddress = new PhysicalAddress();
        physicalAddress.setAddress("via Ugo Bassi, 7");
        physicalAddress.setAt("Matteo Turra");
        physicalAddress.setAddressDetails("Scala 1b");
        physicalAddress.setMunicipality("Zola Predosa");
        physicalAddress.setProvince("BO");
        physicalAddress.setForeignState("Italia");
        physicalAddress.setZip("40069");
        List<String> stdAddress = physicalAddress.toStandardAddressString("Sig.");
        List<String> expected = Arrays.asList("Sig.","Matteo Turra!","Scala 1b","via Ugo Bassi, 7","40069 Zola Predosa BO","Italia");
        assertEquals(expected.size(), expected.size());
        for (int i = 0; i < stdAddress.size(); i++) {
            assertEquals(stdAddress.get(i), expected.get(i));
        }
    }
}

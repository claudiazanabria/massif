package hu.bme.mit.massif.simulink.api.tests.bus;

import hu.bme.mit.massif.simulink.api.util.bus.BusSignalMapper;

import org.junit.Test;

public class BusSignalMappingSpecificCasesTest extends BusSignalMappingBaseTest {

    @Test
    public void testMappingCreatorFAM18() throws Exception{
    	// TODO fox test cases
        modelUri = "platform:plugin/Local_trunk/fam.18.bus_creator_selector/fam_18_bus_creator_selector";
        BusSignalMapper mapper = prepareBusSignalMapper();
        executeMappingCreator(mapper, true);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testMappingCreatorFlattenedSignals() throws Exception{
        modelUri = "platform:plugin/hu.bme.mit.massif.simulink.api.tests/cases/14 - BusMapping/tst_bus_flattened_signals";
        BusSignalMapper mapper = prepareBusSignalMapper();
        executeMappingCreator(mapper, true);
    }
}
package tn.esprit.rh.achat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.rh.achat.entities.Facture;
//import tn.esprit.rh.achat.repositories.CategorieProduitRepository;
import tn.esprit.rh.achat.repositories.*;

import tn.esprit.rh.achat.services.ProduitServiceImpl;
import tn.esprit.rh.achat.services.FactureServiceImpl;
import tn.esprit.rh.achat.services.ReglementServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {FactureServiceImpl.class})
@ExtendWith(SpringExtension.class)
public class FactureTest {

    @MockBean
    private DetailFactureRepository detailFactureRepositoryRepository;

    @MockBean
    private FactureRepository factureRepository;

    @Autowired
    private FactureServiceImpl factureServiceImpl;



    @MockBean
    private StockRepository stockRepository;

    @Test
    void testRetrieveAllFactures() {
        ArrayList<Facture> factureList = new ArrayList<>();
        when(factureRepository.findAll()).thenReturn(factureList);
        List<Facture> actualRetrieveAllFacturesResult = factureServiceImpl.retrieveAllFactures();
        assertSame(factureList, actualRetrieveAllFacturesResult);
        assertTrue(actualRetrieveAllFacturesResult.isEmpty());
        verify(factureRepository).findAll();
    }
    //@Test
    //void testDeleteFactures() {
    //doNothing().when(factureRepository).deleteById((Long) any());
    // factureServiceImpl.deleteFacture(123L);
    // verify(produitRepository).deleteById((Long) any());
    //}
}

package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCompteBancaire {

	@Test
  void testDebiterSoldeOk() {
      CompteBancaire cb = new CompteBancaire(1000);
      assertEquals(985, cb.debiterSolde(15));
  }

	@Test
  void testDebiterSoldeThrow() {
      CompteBancaire cb = new CompteBancaire(1000);
      assertThrows(IllegalArgumentException.class, () -> cb.debiterSolde(-15));
  }
  
	@Test
  void testCrediterSoldeOk() {
      CompteBancaire cb = new CompteBancaire(1000);
      assertEquals(1015, cb.crediterSolde(15));
  }

	@Test
  void testCrediteroldeThrow() {
      CompteBancaire cb = new CompteBancaire(1000);
      assertThrows(IllegalArgumentException.class, () -> cb.crediterSolde(-15));
  }
  
}

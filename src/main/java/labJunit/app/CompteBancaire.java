package labJunit.app;

public class CompteBancaire {
  public CompteBancaire(double initialSolde) {
    solde = initialSolde;
  }

  private double solde = 0;
	
	public double debiterSolde(double montant) throws IllegalArgumentException
	{
    if (montant < 0) throw new IllegalArgumentException("Le montant doit être positif.");
		solde -= montant;
    return solde;
	}
	
	public double crediterSolde(double montant) throws IllegalArgumentException
	{
    if (montant < 0) throw new IllegalArgumentException("Le montant doit être positif.");
		solde += montant;
    return solde;
	}
}

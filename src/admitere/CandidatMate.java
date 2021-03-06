package admitere;

public class CandidatMate extends Candidat{
	private Admis admited;
	private int anul;
	
	protected CandidatMate(String nume, String CNP, int varsta, Admis admited, int anul) {
		super(nume, CNP, varsta);
		this.admited = admited;
		this.anul = anul;
	}
	
	protected Admis getAdmited() {
		return admited;
	}

	protected void setAdmited(Admis admited) {
		this.admited = admited;
	}

	protected int getAnul() {
		return anul;
	}

	protected void setAnul(int anul) {
		this.anul = anul;
	}

	@Override
	public String toString() {
		return "CandidatMate [Admis=" + admited.getNota() + ", anul=" + anul + ", " + super.toString() + "]";
	}

	protected CandidatMate() {
	}
}
